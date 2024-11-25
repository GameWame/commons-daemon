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


public class DaemonLoader2Test {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.daemon.support.DaemonLoader.Context context1 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController2 = context1.getController();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        boolean boolean8 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray7);
        boolean boolean9 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray7);
        boolean boolean10 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray7);
        context1.setArguments(strArray7);
        org.apache.commons.daemon.support.DaemonLoader.Context context12 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController13 = context12.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context14 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController15 = context14.getController();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context14.setArguments(strArray21);
        context12.setArguments(strArray21);
        context1.setArguments(strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        boolean boolean30 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray29);
        boolean boolean31 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray29);
        context1.setArguments(strArray29);
        org.apache.commons.daemon.DaemonController daemonController33 = context1.getController();
        org.apache.commons.daemon.DaemonController daemonController34 = null;
        context1.setController(daemonController34);
        org.apache.commons.daemon.support.DaemonLoader.Context context37 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController38 = context37.getController();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        boolean boolean44 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray43);
        boolean boolean45 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray43);
        boolean boolean46 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray43);
        context37.setArguments(strArray43);
        org.apache.commons.daemon.support.DaemonLoader.Context context48 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController49 = context48.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context50 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController51 = context50.getController();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context50.setArguments(strArray57);
        context48.setArguments(strArray57);
        context37.setArguments(strArray57);
        boolean boolean61 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray57);
        context1.setArguments(strArray57);
        java.lang.String[] strArray63 = context1.getArguments();
        boolean boolean64 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray63);
        java.lang.Class<?> wildcardClass65 = strArray63.getClass();
        assertNull(daemonController2);
        assertNotNull(strArray7);
        assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(daemonController13);
        assertNull(daemonController15);
        assertNotNull(strArray21);
        assertArrayEquals(strArray21, new String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray29);
        assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "" });
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertTrue(boolean31 == false, "'" + boolean31 + "' != '" + false + "'");
        assertNull(daemonController33);
        assertNull(daemonController38);
        assertNotNull(strArray43);
        assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        assertTrue(boolean44 == false, "'" + boolean44 + "' != '" + false + "'");
        assertTrue(boolean45 == false, "'" + boolean45 + "' != '" + false + "'");
        assertTrue(boolean46 == false, "'" + boolean46 + "' != '" + false + "'");
        assertNull(daemonController49);
        assertNull(daemonController51);
        assertNotNull(strArray57);
        assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean61 == false, "'" + boolean61 + "' != '" + false + "'");
        assertNotNull(strArray63);
        assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean64 == false, "'" + boolean64 + "' != '" + false + "'");
        assertNotNull(wildcardClass65);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray1 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        java.lang.String[] strArray3 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController4 = context0.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context5 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController6 = context5.getController();
        org.apache.commons.daemon.DaemonController daemonController7 = context5.getController();
        org.apache.commons.daemon.DaemonController daemonController8 = null;
        context5.setController(daemonController8);
        org.apache.commons.daemon.support.DaemonLoader.Context context10 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController11 = context10.getController();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray16);
        boolean boolean18 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray16);
        boolean boolean19 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray16);
        context10.setArguments(strArray16);
        org.apache.commons.daemon.support.DaemonLoader.Context context21 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController22 = context21.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context23 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController24 = context23.getController();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context23.setArguments(strArray30);
        context21.setArguments(strArray30);
        context10.setArguments(strArray30);
        context5.setArguments(strArray30);
        java.lang.String[] strArray35 = context5.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context36 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController37 = context36.getController();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        boolean boolean43 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray42);
        boolean boolean44 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray42);
        boolean boolean45 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray42);
        context36.setArguments(strArray42);
        org.apache.commons.daemon.support.DaemonLoader.Context context47 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController48 = context47.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context49 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController50 = context49.getController();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context49.setArguments(strArray56);
        context47.setArguments(strArray56);
        context36.setArguments(strArray56);
        context5.setArguments(strArray56);
        java.lang.String[] strArray61 = context5.getArguments();
        java.lang.String[] strArray62 = context5.getArguments();
        org.apache.commons.daemon.DaemonController daemonController63 = context5.getController();
        java.lang.String[] strArray64 = context5.getArguments();
        context0.setArguments(strArray64);
        assertNull(strArray1);
        assertNull(daemonController2);
        assertNull(strArray3);
        assertNull(daemonController4);
        assertNull(daemonController6);
        assertNull(daemonController7);
        assertNull(daemonController11);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNull(daemonController22);
        assertNull(daemonController24);
        assertNotNull(strArray30);
        assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray35);
        assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController37);
        assertNotNull(strArray42);
        assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        assertTrue(boolean43 == false, "'" + boolean43 + "' != '" + false + "'");
        assertTrue(boolean44 == false, "'" + boolean44 + "' != '" + false + "'");
        assertTrue(boolean45 == false, "'" + boolean45 + "' != '" + false + "'");
        assertNull(daemonController48);
        assertNull(daemonController50);
        assertNotNull(strArray56);
        assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray61);
        assertArrayEquals(strArray61, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray62);
        assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController63);
        assertNotNull(strArray64);
        assertArrayEquals(strArray64, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.daemon.support.DaemonLoader.Context context1 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController2 = context1.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context1.setController(daemonController3);
        org.apache.commons.daemon.support.DaemonLoader.Context context7 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController8 = context7.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context9 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController10 = context9.getController();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context9.setArguments(strArray16);
        context7.setArguments(strArray16);
        boolean boolean19 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray16);
        boolean boolean20 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray16);
        context1.setArguments(strArray16);
        java.lang.String[] strArray22 = context1.getArguments();
        boolean boolean23 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray22);
        assertNull(daemonController2);
        assertNull(daemonController8);
        assertNull(daemonController10);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(strArray22);
        assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean23 == false, "'" + boolean23 + "' != '" + false + "'");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context0.setController(daemonController3);
        org.apache.commons.daemon.support.DaemonLoader.Context context5 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController6 = context5.getController();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        boolean boolean12 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean13 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean14 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray11);
        context5.setArguments(strArray11);
        org.apache.commons.daemon.support.DaemonLoader.Context context16 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController17 = context16.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context18 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController19 = context18.getController();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context18.setArguments(strArray25);
        context16.setArguments(strArray25);
        context5.setArguments(strArray25);
        context0.setArguments(strArray25);
        java.lang.String[] strArray30 = context0.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context31 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController32 = context31.getController();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        boolean boolean38 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray37);
        boolean boolean39 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray37);
        boolean boolean40 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray37);
        context31.setArguments(strArray37);
        org.apache.commons.daemon.support.DaemonLoader.Context context42 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController43 = context42.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context44 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController45 = context44.getController();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context44.setArguments(strArray51);
        context42.setArguments(strArray51);
        context31.setArguments(strArray51);
        context0.setArguments(strArray51);
        java.lang.String[] strArray56 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController57 = null;
        context0.setController(daemonController57);
        java.lang.String[] strArray59 = context0.getArguments();
        assertNull(daemonController1);
        assertNull(daemonController2);
        assertNull(daemonController6);
        assertNotNull(strArray11);
        assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNull(daemonController17);
        assertNull(daemonController19);
        assertNotNull(strArray25);
        assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray30);
        assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController32);
        assertNotNull(strArray37);
        assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        assertTrue(boolean38 == false, "'" + boolean38 + "' != '" + false + "'");
        assertTrue(boolean39 == false, "'" + boolean39 + "' != '" + false + "'");
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
        assertNull(daemonController43);
        assertNull(daemonController45);
        assertNotNull(strArray51);
        assertArrayEquals(strArray51, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray56);
        assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray59);
        assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.daemon.support.DaemonLoader.Context context1 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        boolean boolean5 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray4);
        context1.setArguments(strArray4);
        org.apache.commons.daemon.support.DaemonLoader.Context context7 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController8 = context7.getController();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray13);
        boolean boolean15 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray13);
        boolean boolean16 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray13);
        context7.setArguments(strArray13);
        org.apache.commons.daemon.support.DaemonLoader.Context context18 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController19 = context18.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context20 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController21 = context20.getController();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context20.setArguments(strArray27);
        context18.setArguments(strArray27);
        context7.setArguments(strArray27);
        context1.setArguments(strArray27);
        org.apache.commons.daemon.support.DaemonLoader.Context context32 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController33 = context32.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context34 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController35 = context34.getController();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context34.setArguments(strArray41);
        context32.setArguments(strArray41);
        org.apache.commons.daemon.DaemonController daemonController44 = context32.getController();
        org.apache.commons.daemon.DaemonController daemonController45 = context32.getController();
        org.apache.commons.daemon.DaemonController daemonController46 = null;
        context32.setController(daemonController46);
        org.apache.commons.daemon.support.DaemonLoader.Context context49 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray50 = context49.getArguments();
        org.apache.commons.daemon.DaemonController daemonController51 = context49.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context52 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController53 = context52.getController();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context52.setArguments(strArray59);
        context49.setArguments(strArray59);
        boolean boolean62 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray59);
        context32.setArguments(strArray59);
        context1.setArguments(strArray59);
        org.apache.commons.daemon.DaemonController daemonController65 = context1.getController();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        boolean boolean74 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray73);
        boolean boolean75 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray73);
        boolean boolean76 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray73);
        boolean boolean77 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray73);
        boolean boolean78 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray73);
        boolean boolean79 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray73);
        context1.setArguments(strArray73);
        boolean boolean81 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray73);
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNull(daemonController8);
        assertNotNull(strArray13);
        assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNull(daemonController19);
        assertNull(daemonController21);
        assertNotNull(strArray27);
        assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController33);
        assertNull(daemonController35);
        assertNotNull(strArray41);
        assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController44);
        assertNull(daemonController45);
        assertNull(strArray50);
        assertNull(daemonController51);
        assertNull(daemonController53);
        assertNotNull(strArray59);
        assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean62 == false, "'" + boolean62 + "' != '" + false + "'");
        assertNull(daemonController65);
        assertNotNull(strArray73);
        assertArrayEquals(strArray73, new java.lang.String[] { "hi!" });
        assertTrue(boolean74 == false, "'" + boolean74 + "' != '" + false + "'");
        assertTrue(boolean75 == false, "'" + boolean75 + "' != '" + false + "'");
        assertTrue(boolean76 == false, "'" + boolean76 + "' != '" + false + "'");
        assertTrue(boolean77 == false, "'" + boolean77 + "' != '" + false + "'");
        assertTrue(boolean78 == false, "'" + boolean78 + "' != '" + false + "'");
        assertTrue(boolean79 == false, "'" + boolean79 + "' != '" + false + "'");
        assertTrue(boolean81 == false, "'" + boolean81 + "' != '" + false + "'");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray1 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context3 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController4 = context3.getController();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context3.setArguments(strArray10);
        context0.setArguments(strArray10);
        org.apache.commons.daemon.DaemonController daemonController13 = null;
        context0.setController(daemonController13);
        org.apache.commons.daemon.DaemonController daemonController15 = null;
        context0.setController(daemonController15);
        java.lang.String[] strArray17 = context0.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context20 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray21 = context20.getArguments();
        org.apache.commons.daemon.DaemonController daemonController22 = context20.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context23 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController24 = context23.getController();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context23.setArguments(strArray30);
        context20.setArguments(strArray30);
        boolean boolean33 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray30);
        boolean boolean34 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray30);
        context0.setArguments(strArray30);
        java.lang.String[] strArray36 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController37 = context0.getController();
        java.lang.String[] strArray38 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController39 = null;
        context0.setController(daemonController39);
        org.apache.commons.daemon.DaemonController daemonController41 = null;
        context0.setController(daemonController41);
        assertNull(strArray1);
        assertNull(daemonController2);
        assertNull(daemonController4);
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray17);
        assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(strArray21);
        assertNull(daemonController22);
        assertNull(daemonController24);
        assertNotNull(strArray30);
        assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean33 == false, "'" + boolean33 + "' != '" + false + "'");
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
        assertNotNull(strArray36);
        assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController37);
        assertNotNull(strArray38);
        assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context2 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController3 = context2.getController();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context2.setArguments(strArray9);
        context0.setArguments(strArray9);
        org.apache.commons.daemon.support.DaemonLoader.Context context12 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController13 = context12.getController();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context12.setArguments(strArray19);
        context0.setArguments(strArray19);
        org.apache.commons.daemon.DaemonController daemonController22 = null;
        context0.setController(daemonController22);
        org.apache.commons.daemon.support.DaemonLoader.Context context24 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        boolean boolean28 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray27);
        context24.setArguments(strArray27);
        context0.setArguments(strArray27);
        java.lang.String[] strArray31 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController32 = context0.getController();
        java.lang.String[] strArray33 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController34 = null;
        context0.setController(daemonController34);
        assertNull(daemonController1);
        assertNull(daemonController3);
        assertNotNull(strArray9);
        assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController13);
        assertNotNull(strArray19);
        assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray27);
        assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(strArray31);
        assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        assertNull(daemonController32);
        assertNotNull(strArray33);
        assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context0.setArguments(strArray7);
        org.apache.commons.daemon.DaemonController daemonController9 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController10 = null;
        context0.setController(daemonController10);
        java.lang.String[] strArray12 = context0.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context14 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray15 = context14.getArguments();
        org.apache.commons.daemon.DaemonController daemonController16 = context14.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context17 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController18 = context17.getController();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context17.setArguments(strArray24);
        context14.setArguments(strArray24);
        org.apache.commons.daemon.DaemonController daemonController27 = null;
        context14.setController(daemonController27);
        org.apache.commons.daemon.DaemonController daemonController29 = null;
        context14.setController(daemonController29);
        java.lang.String[] strArray31 = context14.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context34 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray35 = context34.getArguments();
        org.apache.commons.daemon.DaemonController daemonController36 = context34.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context37 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController38 = context37.getController();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context37.setArguments(strArray44);
        context34.setArguments(strArray44);
        boolean boolean47 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray44);
        boolean boolean48 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray44);
        context14.setArguments(strArray44);
        java.lang.String[] strArray50 = context14.getArguments();
        org.apache.commons.daemon.DaemonController daemonController51 = context14.getController();
        java.lang.String[] strArray52 = context14.getArguments();
        boolean boolean53 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray52);
        context0.setArguments(strArray52);
        assertNull(daemonController1);
        assertNotNull(strArray7);
        assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController9);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(strArray15);
        assertNull(daemonController16);
        assertNull(daemonController18);
        assertNotNull(strArray24);
        assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray31);
        assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(strArray35);
        assertNull(daemonController36);
        assertNull(daemonController38);
        assertNotNull(strArray44);
        assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean47 == false, "'" + boolean47 + "' != '" + false + "'");
        assertTrue(boolean48 == false, "'" + boolean48 + "' != '" + false + "'");
        assertNotNull(strArray50);
        assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController51);
        assertNotNull(strArray52);
        assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertTrue(boolean53 == false, "'" + boolean53 + "' != '" + false + "'");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        boolean boolean7 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray6);
        boolean boolean8 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray6);
        boolean boolean9 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray6);
        context0.setArguments(strArray6);
        org.apache.commons.daemon.support.DaemonLoader.Context context11 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController12 = context11.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context13 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController14 = context13.getController();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context13.setArguments(strArray20);
        context11.setArguments(strArray20);
        context0.setArguments(strArray20);
        org.apache.commons.daemon.support.DaemonLoader.Context context24 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        boolean boolean28 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray27);
        context24.setArguments(strArray27);
        context0.setArguments(strArray27);
        java.lang.String[] strArray31 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController32 = context0.getController();
        java.lang.String[] strArray33 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController34 = context0.getController();
        assertNull(daemonController1);
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNull(daemonController12);
        assertNull(daemonController14);
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray27);
        assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(strArray31);
        assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        assertNull(daemonController32);
        assertNotNull(strArray33);
        assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        assertNull(daemonController34);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context0.setController(daemonController3);
        java.lang.String[] strArray5 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController6 = null;
        context0.setController(daemonController6);
        java.lang.String[] strArray8 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController9 = null;
        context0.setController(daemonController9);
        org.apache.commons.daemon.DaemonController daemonController11 = context0.getController();
        java.lang.String[] strArray12 = context0.getArguments();
        assertNull(daemonController1);
        assertNull(daemonController2);
        assertNull(strArray5);
        assertNull(strArray8);
        assertNull(daemonController11);
        assertNull(strArray12);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context0.setController(daemonController3);
        org.apache.commons.daemon.support.DaemonLoader.Context context5 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController6 = context5.getController();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        boolean boolean12 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean13 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean14 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray11);
        context5.setArguments(strArray11);
        org.apache.commons.daemon.support.DaemonLoader.Context context16 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController17 = context16.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context18 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController19 = context18.getController();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context18.setArguments(strArray25);
        context16.setArguments(strArray25);
        context5.setArguments(strArray25);
        context0.setArguments(strArray25);
        org.apache.commons.daemon.DaemonController daemonController30 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController31 = null;
        context0.setController(daemonController31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        boolean boolean36 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray35);
        context0.setArguments(strArray35);
        org.apache.commons.daemon.DaemonController daemonController38 = null;
        context0.setController(daemonController38);
        assertNull(daemonController1);
        assertNull(daemonController2);
        assertNull(daemonController6);
        assertNotNull(strArray11);
        assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNull(daemonController17);
        assertNull(daemonController19);
        assertNotNull(strArray25);
        assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController30);
        assertNotNull(strArray35);
        assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        assertTrue(boolean36 == false, "'" + boolean36 + "' != '" + false + "'");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context0.setController(daemonController3);
        org.apache.commons.daemon.support.DaemonLoader.Context context5 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController6 = context5.getController();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        boolean boolean12 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean13 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray11);
        boolean boolean14 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray11);
        context5.setArguments(strArray11);
        org.apache.commons.daemon.support.DaemonLoader.Context context16 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController17 = context16.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context18 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController19 = context18.getController();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context18.setArguments(strArray25);
        context16.setArguments(strArray25);
        context5.setArguments(strArray25);
        context0.setArguments(strArray25);
        java.lang.String[] strArray30 = context0.getArguments();
        org.apache.commons.daemon.support.DaemonLoader.Context context31 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController32 = context31.getController();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        boolean boolean38 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray37);
        boolean boolean39 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray37);
        boolean boolean40 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray37);
        context31.setArguments(strArray37);
        org.apache.commons.daemon.support.DaemonLoader.Context context42 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController43 = context42.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context44 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController45 = context44.getController();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context44.setArguments(strArray51);
        context42.setArguments(strArray51);
        context31.setArguments(strArray51);
        context0.setArguments(strArray51);
        org.apache.commons.daemon.support.DaemonLoader.Context context56 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController57 = context56.getController();
        org.apache.commons.daemon.support.DaemonLoader.Context context58 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController59 = context58.getController();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context58.setArguments(strArray65);
        context56.setArguments(strArray65);
        org.apache.commons.daemon.DaemonController daemonController68 = context56.getController();
        java.lang.String[] strArray69 = context56.getArguments();
        context0.setArguments(strArray69);
        org.apache.commons.daemon.DaemonController daemonController71 = null;
        context0.setController(daemonController71);
        org.apache.commons.daemon.DaemonController daemonController73 = context0.getController();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass74 = daemonController73.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertNull(daemonController1);
        assertNull(daemonController2);
        assertNull(daemonController6);
        assertNotNull(strArray11);
        assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNull(daemonController17);
        assertNull(daemonController19);
        assertNotNull(strArray25);
        assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray30);
        assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController32);
        assertNotNull(strArray37);
        assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        assertTrue(boolean38 == false, "'" + boolean38 + "' != '" + false + "'");
        assertTrue(boolean39 == false, "'" + boolean39 + "' != '" + false + "'");
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
        assertNull(daemonController43);
        assertNull(daemonController45);
        assertNotNull(strArray51);
        assertArrayEquals(strArray51, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController57);
        assertNull(daemonController59);
        assertNotNull(strArray65);
        assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController68);
        assertNotNull(strArray69);
        assertArrayEquals(strArray69, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController73);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context0.setArguments(strArray7);
        org.apache.commons.daemon.DaemonController daemonController9 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController10 = null;
        context0.setController(daemonController10);
        java.lang.String[] strArray12 = context0.getArguments();
        java.lang.String[] strArray13 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController14 = null;
        context0.setController(daemonController14);
        java.lang.String[] strArray16 = context0.getArguments();
        assertNull(daemonController1);
        assertNotNull(strArray7);
        assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController9);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray13);
        assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        context0.setArguments(strArray7);
        org.apache.commons.daemon.DaemonController daemonController9 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController10 = null;
        context0.setController(daemonController10);
        org.apache.commons.daemon.DaemonController daemonController12 = null;
        context0.setController(daemonController12);
        java.lang.Class<?> wildcardClass14 = context0.getClass();
        assertNull(daemonController1);
        assertNotNull(strArray7);
        assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
        assertNull(daemonController9);
        assertNotNull(wildcardClass14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController2 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController3 = null;
        context0.setController(daemonController3);
        java.lang.String[] strArray5 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController6 = null;
        context0.setController(daemonController6);
        org.apache.commons.daemon.DaemonController daemonController8 = null;
        context0.setController(daemonController8);
        org.apache.commons.daemon.DaemonController daemonController10 = context0.getController();
        assertNull(daemonController1);
        assertNull(daemonController2);
        assertNull(strArray5);
        assertNull(daemonController10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.daemon.support.DaemonLoader.Context context0 = new org.apache.commons.daemon.support.DaemonLoader.Context();
        org.apache.commons.daemon.DaemonController daemonController1 = context0.getController();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        boolean boolean7 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray6);
        boolean boolean8 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray6);
        boolean boolean9 = org.apache.commons.daemon.support.DaemonLoader.load("", strArray6);
        context0.setArguments(strArray6);
        org.apache.commons.daemon.DaemonController daemonController11 = context0.getController();
        org.apache.commons.daemon.DaemonController daemonController12 = null;
        context0.setController(daemonController12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.daemon.support.DaemonLoader.load("hi!", strArray16);
        context0.setArguments(strArray16);
        java.lang.String[] strArray19 = context0.getArguments();
        org.apache.commons.daemon.DaemonController daemonController20 = null;
        context0.setController(daemonController20);
        org.apache.commons.daemon.DaemonController daemonController22 = null;
        context0.setController(daemonController22);
        org.apache.commons.daemon.DaemonController daemonController24 = null;
        context0.setController(daemonController24);
        assertNull(daemonController1);
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNull(daemonController11);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(strArray19);
        assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
    }
}

