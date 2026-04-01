package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FindMaxSubArrayProduct_findMaxProduct_186428221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public FindMaxSubArrayProduct_findMaxProduct_186428221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("com.pd.algorithms.FindMaxSubArrayProduct"));
        int[] term13 = (int[]) newIntArray(4);
        setIntElement(term13, 0, -616727354);
        setIntElement(term13, 1, -1955890973);
        setIntElement(term13, 2, -2038273078);
        setIntElement(term13, 3, 1227103734);
        setField(term12, term12.getClass(), "nums", term13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.FindMaxSubArrayProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findMaxProduct", argTypes, term12, args);
    }

};


