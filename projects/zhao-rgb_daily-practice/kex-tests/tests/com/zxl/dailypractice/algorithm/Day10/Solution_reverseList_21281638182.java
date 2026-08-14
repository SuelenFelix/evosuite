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

public class Solution_reverseList_21281638182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40;
     Object term41;

    public Solution_reverseList_21281638182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution"));
        term41 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term43 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term45 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term47 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term49 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        setIntField(term41, term41.getClass(), "val", -73683645);
        setIntField(term43, term43.getClass(), "val", -226514366);
        setIntField(term45, term45.getClass(), "val", 1193880199);
        setIntField(term47, term47.getClass(), "val", -1087774327);
        setIntField(term49, term49.getClass(), "val", -1530420153);
        setField(term49, term49.getClass(), "next", null);
        setField(term47, term47.getClass(), "next", term49);
        setField(term45, term45.getClass(), "next", term47);
        setField(term43, term43.getClass(), "next", term45);
        setField(term41, term41.getClass(), "next", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        Object[] args = new Object[1];
        args[0] = term41;
        callMethod(klass, "reverseList", argTypes, term40, args);
    }

};


