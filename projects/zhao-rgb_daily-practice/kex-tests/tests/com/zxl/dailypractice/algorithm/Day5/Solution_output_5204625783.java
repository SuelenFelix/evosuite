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

public class Solution_output_5204625783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term142;

    public Solution_output_5204625783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution"));
        term142 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term144 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term146 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term148 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term150 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        setIntField(term142, term142.getClass(), "val", -2068769794);
        setIntField(term144, term144.getClass(), "val", -117576464);
        setIntField(term146, term146.getClass(), "val", -1007160944);
        setIntField(term148, term148.getClass(), "val", 1135664017);
        setIntField(term150, term150.getClass(), "val", 590364439);
        setField(term150, term150.getClass(), "next", null);
        setField(term148, term148.getClass(), "next", term150);
        setField(term146, term146.getClass(), "next", term148);
        setField(term144, term144.getClass(), "next", term146);
        setField(term142, term142.getClass(), "next", term144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode");
        Object[] args = new Object[1];
        args[0] = term142;
        callMethod(klass, "output", argTypes, term141, args);
    }

};


