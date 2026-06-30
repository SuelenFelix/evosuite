package com.zxl.dailypractice.algorithm.Day10;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.zxl.dailypractice.algorithm.Day10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_mergeTwoLists_508883271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term20;
     Object term30;

    public Solution_mergeTwoLists_508883271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution"));
        term20 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term22 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term24 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term26 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term28 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        setIntField(term20, term20.getClass(), "val", 1134449235);
        setIntField(term22, term22.getClass(), "val", -883034806);
        setIntField(term24, term24.getClass(), "val", 1585847225);
        setIntField(term26, term26.getClass(), "val", 597278769);
        setIntField(term28, term28.getClass(), "val", -1685132342);
        setField(term28, term28.getClass(), "next", null);
        setField(term26, term26.getClass(), "next", term28);
        setField(term24, term24.getClass(), "next", term26);
        setField(term22, term22.getClass(), "next", term24);
        setField(term20, term20.getClass(), "next", term22);
        term30 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term32 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term34 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term36 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term38 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        setIntField(term30, term30.getClass(), "val", -2068769794);
        setIntField(term32, term32.getClass(), "val", -117576464);
        setIntField(term34, term34.getClass(), "val", -1007160944);
        setIntField(term36, term36.getClass(), "val", 1135664017);
        setIntField(term38, term38.getClass(), "val", 590364439);
        setField(term38, term38.getClass(), "next", null);
        setField(term36, term36.getClass(), "next", term38);
        setField(term34, term34.getClass(), "next", term36);
        setField(term32, term32.getClass(), "next", term34);
        setField(term30, term30.getClass(), "next", term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        argTypes[1] = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        Object[] args = new Object[2];
        args[0] = term20;
        args[1] = term30;
        callMethod(klass, "mergeTwoLists", argTypes, term19, args);
    }

};


