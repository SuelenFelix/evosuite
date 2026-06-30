package com.zxl.dailypractice.algorithm2.Day1;

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
import static com.zxl.dailypractice.algorithm2.Day1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_maxSubArray_15805338692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term14;

    public Solution_maxSubArray_15805338692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.zxl.dailypractice.algorithm2.Day1.Solution"));
        term14 = (int[]) newIntArray(4);
        setIntElement(term14, 0, -616727354);
        setIntElement(term14, 1, -1955890973);
        setIntElement(term14, 2, -2038273078);
        setIntElement(term14, 3, 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.algorithm2.Day1.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14;
        callMethod(klass, "maxSubArray", argTypes, term13, args);
    }

};


