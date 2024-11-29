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

package org.apache.commons.daemon;


import org.apache.commons.daemon.support.DaemonWrapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DaemonWrapperTest {

    private DaemonWrapper daemonWrapper;

    @BeforeEach
    void setUp() {
        daemonWrapper = new DaemonWrapper();
    }

    @Test
    void testDaemonWrapper() {
        assertNotNull(daemonWrapper);
    }


    //test init class
    @Test
    void testDaemonWrapperInit() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[0];
            }
        };
        daemonWrapper.init(daemonContext);
        assertNotNull(daemonWrapper);
    }

    //test for init method in DaemonWrapper class when args[i] is -daemon-properties and returns IllegalArgumentException
    @Test
    void testDaemonWrapperInitIllegalArgumentException() {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-daemon-properties"};
            }
        };
        assertThrows(IllegalArgumentException.class, () -> daemonWrapper.init(daemonContext));


    }

    //test for init method in DaemonWrapper class when args[i] is -start and args[i+1] is null and startup.setClassName(args[i]) is called
    @Test
    void testDaemonWrapperInitStartClassNameNull() {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-start"};
            }
        };
        assertThrows(IllegalArgumentException.class, () -> daemonWrapper.init(daemonContext));
    }

    @Test
    void testDaemonWrapperInitStartClassName() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-start", "org.apache.commons.daemon.docker.example"};
            }
        };

        daemonWrapper.init(daemonContext);
        assertTrue(daemonContext.getArguments().length > 0);
    }

    //test for init method in DaemonWrapper class when args[i] is -start-method , args[i+1] is -stop , and is called the method startup.setMethodName(args[i])
    @Test
    void testDaemonWrapperInitStartMethodNameNull() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-start-method"};
            }
        };

        assertThrows(IllegalArgumentException.class, () -> daemonWrapper.init(daemonContext));
    }

    @Test
    void testDaemonWrapperInitStartMethodName() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-start-method", "org.apache.commons.daemon.docker.example.handle"};
            }
        };

        daemonWrapper.init(daemonContext);
        assertTrue(daemonContext.getArguments().length > 0);
    }

    //test for init method in DaemonWrapper class when args[i] is -stop , args[i+1] is org.apache.commons.daemon.docker.example, and is called the method startup.setMethodName(args[i])
    @Test
    void testDaemonWrapperInitStopClassNameNull() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-stop"};
            }
        };

        assertThrows(IllegalArgumentException.class, () -> daemonWrapper.init(daemonContext));
    }

    @Test
    void testDaemonWrapperInitStopClassName() throws Exception {
        DaemonContext daemonContext = new DaemonContext() {
            @Override
            public DaemonController getController() {
                return null;
            }

            @Override
            public String[] getArguments() {
                return new String[]{"-stop", "org.apache.commons.daemon.docker.example"};
            }
        };

        daemonWrapper.init(daemonContext);
        assertTrue(daemonContext.getArguments().length > 0);
    }
}