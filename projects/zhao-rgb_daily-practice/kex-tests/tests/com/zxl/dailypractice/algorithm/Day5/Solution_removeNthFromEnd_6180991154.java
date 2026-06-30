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
import java.lang.Integer;

public class Solution_removeNthFromEnd_6180991154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;
     Object term153;
     Object term163;

    public Solution_removeNthFromEnd_6180991154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution"));
        term153 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term155 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term157 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term159 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term161 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        setIntField(term153, term153.getClass(), "val", -73683645);
        setIntField(term155, term155.getClass(), "val", -226514366);
        setIntField(term157, term157.getClass(), "val", 1193880199);
        setIntField(term159, term159.getClass(), "val", -1087774327);
        setIntField(term161, term161.getClass(), "val", -1530420153);
        setField(term161, term161.getClass(), "next", null);
        setField(term159, term159.getClass(), "next", term161);
        setField(term157, term157.getClass(), "next", term159);
        setField(term155, term155.getClass(), "next", term157);
        setField(term153, term153.getClass(), "next", term155);
        term163 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term153;
        args[1] = term163;
        callMethod(klass, "removeNthFromEnd", argTypes, term152, args);
    }

};


