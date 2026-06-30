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
import java.lang.Integer;
import java.lang.Object;

public class ListNode_init_6061842472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;

    public ListNode_init_6061842472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term5 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term7 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term9 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term11 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term13 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        setIntField(term5, term5.getClass(), "val", 1484323161);
        setIntField(term7, term7.getClass(), "val", 391863371);
        setIntField(term9, term9.getClass(), "val", -1922583790);
        setIntField(term11, term11.getClass(), "val", -616727354);
        setIntField(term13, term13.getClass(), "val", -1955890973);
        setField(term13, term13.getClass(), "next", null);
        setField(term11, term11.getClass(), "next", term13);
        setField(term9, term9.getClass(), "next", term11);
        setField(term7, term7.getClass(), "next", term9);
        setField(term5, term5.getClass(), "next", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term5;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


