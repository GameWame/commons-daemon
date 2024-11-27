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


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DaemonPermissionTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission2 = new org.apache.commons.daemon.DaemonPermission("", "");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission1 = new org.apache.commons.daemon.DaemonPermission("hi!");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"hi!\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission2 = new org.apache.commons.daemon.DaemonPermission("", "hi!");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission1 = new org.apache.commons.daemon.DaemonPermission("");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission2 = new org.apache.commons.daemon.DaemonPermission("hi!", "hi!");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"hi!\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.daemon.DaemonPermission daemonPermission2 = new org.apache.commons.daemon.DaemonPermission("hi!", "");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid permission name \"hi!\" specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

