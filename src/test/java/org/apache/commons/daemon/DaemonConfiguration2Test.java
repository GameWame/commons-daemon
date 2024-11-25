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


public class DaemonConfiguration2Test {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("");
        java.lang.String[] strArray6 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        java.lang.Class<?> wildcardClass13 = daemonConfiguration0.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] {});
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("");
        boolean boolean12 = daemonConfiguration0.load("");
        boolean boolean14 = daemonConfiguration0.load("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        boolean boolean16 = daemonConfiguration0.load("hi!");
        boolean boolean18 = daemonConfiguration0.load("");
        java.lang.String str20 = daemonConfiguration0.getProperty("hi!");
        java.lang.Class<?> wildcardClass21 = daemonConfiguration0.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNull(str20);
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("");
        java.lang.Class<?> wildcardClass21 = strArray20.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("");
        java.lang.String[] strArray6 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        boolean boolean16 = daemonConfiguration0.load("hi!");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] {});
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        boolean boolean8 = daemonConfiguration0.load("");
        java.lang.String[] strArray10 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] {});
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNull(str14);
        assertNull(str16);
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        boolean boolean20 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray22 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.Class<?> wildcardClass23 = daemonConfiguration0.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertNull(str18);
        assertFalse(boolean20, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(strArray22);
        assertArrayEquals(strArray22, new java.lang.String[] {});
        assertNotNull(wildcardClass23);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray10 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] {});
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNull(str14);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertNull(str10);
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        boolean boolean12 = daemonConfiguration0.load("");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        java.lang.Class<?> wildcardClass15 = daemonConfiguration0.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNull(str14);
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str18 = daemonConfiguration0.getProperty("hi!");
        java.lang.Class<?> wildcardClass19 = daemonConfiguration0.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertNull(str18);
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNull(str14);
        assertNull(str16);
        assertNull(str18);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("");
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        boolean boolean16 = daemonConfiguration0.load("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        java.lang.String str20 = daemonConfiguration0.getProperty("");
        java.lang.String str22 = daemonConfiguration0.getProperty("");
        boolean boolean24 = daemonConfiguration0.load("");
        java.lang.String str26 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray28 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean30 = daemonConfiguration0.load("");
        java.lang.String str32 = daemonConfiguration0.getProperty("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertNull(str14);
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertNull(str18);
        assertNull(str20);
        assertNull(str22);
        assertFalse(boolean24, "'" + boolean24 + "' != '" + false + "'");
        assertNull(str26);
        assertNotNull(strArray28);
        assertArrayEquals(strArray28, new java.lang.String[] {});
        assertFalse(boolean30, "'" + boolean30 + "' != '" + false + "'");
        assertNull(str32);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        boolean boolean18 = daemonConfiguration0.load("");
        java.lang.Class<?> wildcardClass19 = daemonConfiguration0.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNull(str16);
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(wildcardClass19);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        boolean boolean6 = daemonConfiguration0.load("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertFalse(boolean6, "'" + boolean6 + "' != '" + false + "'");
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertNull(str14);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("");
        boolean boolean14 = daemonConfiguration0.load("");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray18 = daemonConfiguration0.getPropertyArray("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNull(str16);
        assertNotNull(strArray18);
        assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("");
        java.lang.String[] strArray6 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("");
        boolean boolean14 = daemonConfiguration0.load("");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        boolean boolean20 = daemonConfiguration0.load("");
        java.lang.Class<?> wildcardClass21 = daemonConfiguration0.getClass();
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] {});
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertNull(str10);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertFalse(boolean20, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(wildcardClass21);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        boolean boolean6 = daemonConfiguration0.load("");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertFalse(boolean6, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertNotNull(wildcardClass9);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNotNull(wildcardClass13);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        boolean boolean8 = daemonConfiguration0.load("");
        java.lang.String[] strArray10 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray18 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str20 = daemonConfiguration0.getProperty("");
        java.lang.String str22 = daemonConfiguration0.getProperty("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] {});
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNull(str14);
        assertNull(str16);
        assertNotNull(strArray18);
        assertArrayEquals(strArray18, new java.lang.String[] {});
        assertNull(str20);
        assertNull(str22);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean14 = daemonConfiguration0.load("");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray18 = daemonConfiguration0.getPropertyArray("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertNotNull(strArray18);
        assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray10 = daemonConfiguration0.getPropertyArray("");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] {});
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        boolean boolean14 = daemonConfiguration0.load("");
        java.lang.String str16 = daemonConfiguration0.getProperty("hi!");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNull(str16);
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        java.lang.String str20 = daemonConfiguration0.getProperty("");
        java.lang.String str22 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str24 = daemonConfiguration0.getProperty("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNull(str16);
        assertNull(str18);
        assertNull(str20);
        assertNull(str22);
        assertNull(str24);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        boolean boolean16 = daemonConfiguration0.load("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        java.lang.String str20 = daemonConfiguration0.getProperty("");
        boolean boolean22 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray24 = daemonConfiguration0.getPropertyArray("");
        java.lang.Class<?> wildcardClass25 = strArray24.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertNull(str14);
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertNull(str18);
        assertNull(str20);
        assertFalse(boolean22, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(strArray24);
        assertArrayEquals(strArray24, new java.lang.String[] {});
        assertNotNull(wildcardClass25);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        boolean boolean12 = daemonConfiguration0.load("");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNull(str14);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str16 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray18 = daemonConfiguration0.getPropertyArray("");
        boolean boolean20 = daemonConfiguration0.load("hi!");
        java.lang.String str22 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str24 = daemonConfiguration0.getProperty("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNull(str14);
        assertNull(str16);
        assertNotNull(strArray18);
        assertArrayEquals(strArray18, new java.lang.String[] {});
        assertFalse(boolean20, "'" + boolean20 + "' != '" + false + "'");
        assertNull(str22);
        assertNull(str24);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray8 = daemonConfiguration0.getPropertyArray("");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        boolean boolean14 = daemonConfiguration0.load("");
        java.lang.String str16 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNotNull(strArray8);
        assertArrayEquals(strArray8, new java.lang.String[] {});
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNull(str16);
        assertNull(str18);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean16 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray18 = daemonConfiguration0.getPropertyArray("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(strArray18);
        assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        boolean boolean18 = daemonConfiguration0.load("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertNull(str10);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNull(str14);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray6 = daemonConfiguration0.getPropertyArray("");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.Class<?> wildcardClass15 = daemonConfiguration0.getClass();
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] {});
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNotNull(wildcardClass15);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("");
        java.lang.String str14 = daemonConfiguration0.getProperty("");
        boolean boolean16 = daemonConfiguration0.load("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        java.lang.String str20 = daemonConfiguration0.getProperty("");
        java.lang.String str22 = daemonConfiguration0.getProperty("");
        boolean boolean24 = daemonConfiguration0.load("");
        java.lang.String[] strArray26 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray28 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray30 = daemonConfiguration0.getPropertyArray("");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNull(str12);
        assertNull(str14);
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
        assertNull(str18);
        assertNull(str20);
        assertNull(str22);
        assertFalse(boolean24, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(strArray26);
        assertArrayEquals(strArray26, new java.lang.String[] {});
        assertNotNull(strArray28);
        assertArrayEquals(strArray28, new java.lang.String[] {});
        assertNotNull(strArray30);
        assertArrayEquals(strArray30, new java.lang.String[] {});
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray6 = daemonConfiguration0.getPropertyArray("");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        boolean boolean16 = daemonConfiguration0.load("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNotNull(strArray6);
        assertArrayEquals(strArray6, new java.lang.String[] {});
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertFalse(boolean16, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        java.lang.String[] strArray2 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str4 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        boolean boolean12 = daemonConfiguration0.load("");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str18 = daemonConfiguration0.getProperty("");
        boolean boolean20 = daemonConfiguration0.load("");
        java.lang.String[] strArray22 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray24 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str26 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray28 = daemonConfiguration0.getPropertyArray("hi!");
        assertNotNull(strArray2);
        assertArrayEquals(strArray2, new java.lang.String[] {});
        assertNull(str4);
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNull(str14);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertNull(str18);
        assertFalse(boolean20, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(strArray22);
        assertArrayEquals(strArray22, new java.lang.String[] {});
        assertNotNull(strArray24);
        assertArrayEquals(strArray24, new java.lang.String[] {});
        assertNull(str26);
        assertNotNull(strArray28);
        assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        boolean boolean6 = daemonConfiguration0.load("hi!");
        boolean boolean8 = daemonConfiguration0.load("");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertFalse(boolean6, "'" + boolean6 + "' != '" + false + "'");
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        boolean boolean10 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        boolean boolean8 = daemonConfiguration0.load("hi!");
        boolean boolean10 = daemonConfiguration0.load("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        boolean boolean14 = daemonConfiguration0.load("hi!");
        java.lang.String str16 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str18 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray22 = daemonConfiguration0.getPropertyArray("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertFalse(boolean8, "'" + boolean8 + "' != '" + false + "'");
        assertFalse(boolean10, "'" + boolean10 + "' != '" + false + "'");
        assertNull(str12);
        assertFalse(boolean14, "'" + boolean14 + "' != '" + false + "'");
        assertNull(str16);
        assertNull(str18);
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
        assertNotNull(strArray22);
        assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        java.lang.String[] strArray4 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("");
        java.lang.String str8 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str10 = daemonConfiguration0.getProperty("");
        boolean boolean12 = daemonConfiguration0.load("hi!");
        java.lang.String str14 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("hi!");
        boolean boolean18 = daemonConfiguration0.load("");
        java.lang.String str20 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray22 = daemonConfiguration0.getPropertyArray("");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(strArray4);
        assertArrayEquals(strArray4, new java.lang.String[] {});
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertFalse(boolean12, "'" + boolean12 + "' != '" + false + "'");
        assertNull(str14);
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertFalse(boolean18, "'" + boolean18 + "' != '" + false + "'");
        assertNull(str20);
        assertNotNull(strArray22);
        assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        java.lang.String[] strArray10 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str12 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray14 = daemonConfiguration0.getPropertyArray("hi!");
        java.lang.String[] strArray16 = daemonConfiguration0.getPropertyArray("");
        java.lang.String str18 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray20 = daemonConfiguration0.getPropertyArray("");
        boolean boolean22 = daemonConfiguration0.load("hi!");
        java.lang.String str24 = daemonConfiguration0.getProperty("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertNotNull(strArray10);
        assertArrayEquals(strArray10, new java.lang.String[] {});
        assertNull(str12);
        assertNotNull(strArray14);
        assertArrayEquals(strArray14, new java.lang.String[] {});
        assertNotNull(strArray16);
        assertArrayEquals(strArray16, new java.lang.String[] {});
        assertNull(str18);
        assertNotNull(strArray20);
        assertArrayEquals(strArray20, new java.lang.String[] {});
        assertFalse(boolean22, "'" + boolean22 + "' != '" + false + "'");
        assertNull(str24);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.daemon.support.DaemonConfiguration daemonConfiguration0 = new org.apache.commons.daemon.support.DaemonConfiguration();
        boolean boolean2 = daemonConfiguration0.load("hi!");
        boolean boolean4 = daemonConfiguration0.load("hi!");
        java.lang.String str6 = daemonConfiguration0.getProperty("hi!");
        java.lang.String str8 = daemonConfiguration0.getProperty("");
        java.lang.String str10 = daemonConfiguration0.getProperty("hi!");
        java.lang.String[] strArray12 = daemonConfiguration0.getPropertyArray("hi!");
        assertFalse(boolean2, "'" + boolean2 + "' != '" + false + "'");
        assertFalse(boolean4, "'" + boolean4 + "' != '" + false + "'");
        assertNull(str6);
        assertNull(str8);
        assertNull(str10);
        assertNotNull(strArray12);
        assertArrayEquals(strArray12, new java.lang.String[] {});
    }
}

