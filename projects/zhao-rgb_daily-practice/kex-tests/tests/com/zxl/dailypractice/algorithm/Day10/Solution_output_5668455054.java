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

public class Solution_output_5668455054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;
     Object term163;

    public Solution_output_5668455054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution"));
        term163 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term165 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term167 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term169 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        Object term171 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode"));
        setIntField(term163, term163.getClass(), "val", -602026508);
        setIntField(term165, term165.getClass(), "val", -157887805);
        setIntField(term167, term167.getClass(), "val", 1876565163);
        setIntField(term169, term169.getClass(), "val", -817164822);
        setIntField(term171, term171.getClass(), "val", -1016503459);
        setField(term171, term171.getClass(), "next", null);
        setField(term169, term169.getClass(), "next", term171);
        setField(term167, term167.getClass(), "next", term169);
        setField(term165, term165.getClass(), "next", term167);
        setField(term163, term163.getClass(), "next", term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day10.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day10.ListNode");
        Object[] args = new Object[1];
        args[0] = term163;
        callMethod(klass, "output", argTypes, term162, args);
    }

};


