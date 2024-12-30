/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.commons.daemon.support;

import org.apache.commons.daemon.DaemonContext;
import org.apache.commons.daemon.DaemonController;
import org.apache.commons.daemon.DaemonInitException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.logging.Level;

public final class DaemonLoader {

    private static volatile Controller controller;
    private static volatile Object daemon;
    private static volatile Method init;
    private static volatile Method start;
    private static volatile Method stop;
    private static volatile Method destroy;
    private static volatile Method signal;

    private final String control;
    private Object actions;

    public DaemonLoader(){
        this.control = null;
    }
    public DaemonLoader(String control, Object actions) {
        this.control = control;
        this.actions = actions;
    }

    public DaemonLoader(String control) {
        this.control = control;
    }

    private static final Logger log = Logger.getLogger(DaemonLoader.class.getName());

    public static void version() {
        if (log.isLoggable(Level.INFO)) {
            log.log(Level.INFO, "java version \"{0}\"", System.getProperty("java.version"));
            log.log(Level.INFO, "commons daemon version \"{0}\"", System.getProperty("commons.daemon.version"));
            log.log(Level.INFO, "{0} (build {1})", new Object[]{
                    System.getProperty("java.runtime.name"),
                    System.getProperty("java.runtime.version")
            });
            log.log(Level.INFO, "{0} (build {1}, {2})", new Object[]{
                    System.getProperty("java.vm.name"),
                    System.getProperty("java.vm.version"),
                    System.getProperty("java.vm.info")
            });
            log.log(Level.INFO, "commons daemon process (id: {0}, parent: {1})", new Object[]{
                    System.getProperty("commons.daemon.process.id"),
                    System.getProperty("commons.daemon.process.parent")
            });
        }
    }

    public static boolean check(final String className) {
        try {
            Objects.requireNonNull(className, "className");
            final ClassLoader cl = DaemonLoader.class.getClassLoader();
            if (cl == null) {
                log.info("Cannot retrieve ClassLoader instance");
                return false;
            }
            final Class<?> c = cl.loadClass(className);
            if (c == null) {
                throw new ClassNotFoundException(className);
            }
            c.getConstructor().newInstance();
        } catch (final Throwable t) {
            t.printStackTrace(System.err);
            return false;
        }
        return true;
    }

    public static boolean signal() {
        try {
            if (signal != null) {
                signal.invoke(daemon);
                return true;
            }
            System.out.println("Daemon doesn't support signaling");
        } catch (final Throwable ex) {
            System.err.println("Cannot send signal: " + ex);
            ex.printStackTrace(System.err);
        }
        return false;
    }

    public static boolean load(final String className, String[] args) {
        try {
            if (args == null) {
                args = new String[0];
            }
            Objects.requireNonNull(className, "className");
            final ClassLoader cl = DaemonLoader.class.getClassLoader();
            if (cl == null) {
                System.err.println("Cannot retrieve ClassLoader instance");
                return false;
            }
            final Class<?> c;
            if (className.charAt(0) == '@') {
                c = DaemonWrapper.class;
                final String[] a = new String[args.length + 2];
                a[0] = "-start";
                a[1] = className.substring(1);
                System.arraycopy(args, 0, a, 2, args.length);
                args = a;
            } else {
                c = cl.loadClass(className);
            }
            if (c == null) {
                throw new ClassNotFoundException(className);
            }
            boolean isdaemon = false;
            try {
                final Class<?> dclass = cl.loadClass("org.apache.commons.daemon.Daemon");
                isdaemon = dclass.isAssignableFrom(c);
            } catch (final Exception ignored) {
            }
            final Class<?>[] myclass = new Class[1];
            if (isdaemon) {
                myclass[0] = DaemonContext.class;
            } else {
                myclass[0] = args.getClass();
            }
            init = c.getMethod("init", myclass);
            start = c.getMethod("start");
            stop = c.getMethod("stop");
            destroy = c.getMethod("destroy");
            try {
                signal = c.getMethod("signal");
            } catch (final NoSuchMethodException ignored) {
            }
            daemon = c.getConstructor().newInstance();
            if (isdaemon) {
                controller = new Controller();
                controller.setAvailable(false);
                final Context context = new Context();
                context.setArguments(args);
                context.setController(controller);
                final Object[] arg = new Object[1];
                arg[0] = context;
                init.invoke(daemon, arg);
            } else {
                final Object[] arg = new Object[1];
                arg[0] = args;
                init.invoke(daemon, arg);
            }
        } catch (final InvocationTargetException e) {
            return handleInvocationTargetException(e);
        } catch (final Throwable t) {
            return handleGeneralException(t);
        }
        return true;
    }

    private static boolean handleInvocationTargetException(InvocationTargetException e) {
        final Throwable thrown = e.getTargetException();
        if (thrown instanceof DaemonInitException) {
            failed(((DaemonInitException) thrown).getMessageWithCause());
        } else {
            thrown.printStackTrace(System.err);
        }
        return false;
    }

    private static boolean handleGeneralException(Throwable t) {
        t.printStackTrace(System.err);
        return false;
    }

    public static boolean start() {
        try {
            start.invoke(daemon);
            if (controller != null) {
                controller.setAvailable(true);
            }
        } catch (final Throwable t) {
            t.printStackTrace(System.err);
            return false;
        }
        return true;
    }

    public static boolean stop() {
        try {
            if (controller != null) {
                controller.setAvailable(false);
            }
            stop.invoke(daemon);
        } catch (final Throwable t) {
            t.printStackTrace(System.err);
            return false;
        }
        return true;
    }

    public static boolean destroy() {
        try {
            destroy.invoke(daemon);
            daemon = null;
            controller = null;
        } catch (final Throwable t) {
            t.printStackTrace(System.err);
            return false;
        }
        return true;
    }

    private static native void shutdown(boolean reload);
    private static native void failed(String message);

    public static class Controller implements DaemonController {

        private volatile boolean available;

        private Controller() {
            setAvailable(false);
        }

        private boolean isAvailable() {
            return this.available;
        }

        private void setAvailable(final boolean available) {
            this.available = available;
        }

        @Override
        public void shutdown() throws IllegalStateException {
            if (!isAvailable()) {
                throw new IllegalStateException();
            }
            setAvailable(false);
            DaemonLoader.shutdown(false);
        }

        @Override
        public void reload() throws IllegalStateException {
            if (!isAvailable()) {
                throw new IllegalStateException();
            }
            setAvailable(false);
            DaemonLoader.shutdown(true);
        }

        @Override
        public void fail() {
            fail(null, null);
        }

        @Override
        public void fail(final String message) {
            fail(message, null);
        }

        @Override
        public void fail(final Exception exception) {
            fail(null, exception);
        }

        @Override
        public void fail(final String message, final Exception exception) {
            setAvailable(false);
            String msg = message;
            if (exception != null) {
                if (msg != null) {
                    msg = msg + ": " + exception.toString();
                } else {
                    msg = exception.toString();
                }
            }
            failed(msg);
        }
    }

    public static class Context implements DaemonContext {

        private DaemonController daemonController;
        private String[] args;

        @Override
        public DaemonController getController() {
            return daemonController;
        }

        public void setController(final DaemonController controller) {
            this.daemonController = controller;
        }

        @Override
        public String[] getArguments() {
            return args;
        }

        public void setArguments(final String[] args) {
            this.args = args;
        }
    }
}