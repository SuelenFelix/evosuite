package com.zxl.dailypractice.algorithm.Day5;

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
import static com.zxl.dailypractice.algorithm.Day5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_middleNode_18085783491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term20;

    public Solution_middleNode_18085783491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution"));
        term20 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term22 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term24 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term26 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term28 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode");
        Object[] args = new Object[1];
        args[0] = term20;
        callMethod(klass, "middleNode", argTypes, term19, args);
    }

};


