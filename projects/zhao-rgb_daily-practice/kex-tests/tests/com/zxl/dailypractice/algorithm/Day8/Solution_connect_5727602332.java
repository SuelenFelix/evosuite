package com.zxl.dailypractice.algorithm.Day8;

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
import static com.zxl.dailypractice.algorithm.Day8.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_connect_5727602332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150;
     Object term151;

    public Solution_connect_5727602332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution"));
        term151 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term153 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term155 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term157 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term159 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term161 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term163 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term165 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        Object term167 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node"));
        setIntField(term151, term151.getClass(), "val", 335112684);
        setIntField(term153, term153.getClass(), "val", 1551099402);
        setIntField(term155, term155.getClass(), "val", -2027534003);
        setIntField(term157, term157.getClass(), "val", 1063420942);
        setIntField(term159, term159.getClass(), "val", 1375330971);
        setField(term159, term159.getClass(), "left", null);
        setField(term159, term159.getClass(), "right", null);
        setField(term159, term159.getClass(), "next", null);
        setField(term159, term159.getClass(), "this$0", null);
        setField(term157, term157.getClass(), "left", term159);
        setIntField(term161, term161.getClass(), "val", -478195677);
        setField(term161, term161.getClass(), "left", null);
        setField(term161, term161.getClass(), "right", null);
        setField(term161, term161.getClass(), "next", term159);
        setField(term161, term161.getClass(), "this$0", null);
        setField(term157, term157.getClass(), "right", term161);
        setField(term157, term157.getClass(), "next", term155);
        setField(term157, term157.getClass(), "this$0", null);
        setField(term155, term155.getClass(), "left", term157);
        setField(term155, term155.getClass(), "right", term159);
        setIntField(term163, term163.getClass(), "val", 1655935355);
        setIntField(term165, term165.getClass(), "val", -481533957);
        setField(term165, term165.getClass(), "left", null);
        setField(term165, term165.getClass(), "right", term161);
        setField(term165, term165.getClass(), "next", term157);
        setField(term165, term165.getClass(), "this$0", null);
        setField(term163, term163.getClass(), "left", term165);
        setField(term163, term163.getClass(), "right", term153);
        setField(term163, term163.getClass(), "next", term153);
        setField(term163, term163.getClass(), "this$0", null);
        setField(term155, term155.getClass(), "next", term163);
        setField(term155, term155.getClass(), "this$0", null);
        setField(term153, term153.getClass(), "left", term155);
        setIntField(term167, term167.getClass(), "val", 1240914516);
        setField(term167, term167.getClass(), "left", term163);
        setField(term167, term167.getClass(), "right", term165);
        setField(term167, term167.getClass(), "next", term151);
        setField(term167, term167.getClass(), "this$0", null);
        setField(term153, term153.getClass(), "right", term167);
        setField(term153, term153.getClass(), "next", term167);
        setField(term153, term153.getClass(), "this$0", null);
        setField(term151, term151.getClass(), "left", term153);
        setField(term151, term151.getClass(), "right", term157);
        setField(term151, term151.getClass(), "next", term159);
        setField(term151, term151.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day8.Solution$Node");
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "connect", argTypes, term150, args);
    }

};


