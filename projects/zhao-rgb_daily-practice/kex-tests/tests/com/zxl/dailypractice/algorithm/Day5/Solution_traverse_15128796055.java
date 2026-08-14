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

public class Solution_traverse_15128796055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term166;
     Object term176;

    public Solution_traverse_15128796055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution"));
        term166 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term168 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term170 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term172 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        Object term174 = newInstance(Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode"));
        setIntField(term166, term166.getClass(), "val", -157887805);
        setIntField(term168, term168.getClass(), "val", 1876565163);
        setIntField(term170, term170.getClass(), "val", -817164822);
        setIntField(term172, term172.getClass(), "val", -1016503459);
        setIntField(term174, term174.getClass(), "val", -1968847291);
        setField(term174, term174.getClass(), "next", null);
        setField(term172, term172.getClass(), "next", term174);
        setField(term170, term170.getClass(), "next", term172);
        setField(term168, term168.getClass(), "next", term170);
        setField(term166, term166.getClass(), "next", term168);
        term176 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.zxl.dailypractice.algorithm.Day5.Solution$ListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term166;
        args[1] = term176;
        callMethod(klass, "traverse", argTypes, term165, args);
    }

};


