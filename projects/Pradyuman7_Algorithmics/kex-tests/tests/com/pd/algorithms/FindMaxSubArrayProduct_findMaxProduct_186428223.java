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

public class FindMaxSubArrayProduct_findMaxProduct_186428223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;

    public FindMaxSubArrayProduct_findMaxProduct_186428223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("com.pd.algorithms.FindMaxSubArrayProduct"));
        setField(term22, term22.getClass(), "nums", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.FindMaxSubArrayProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findMaxProduct", argTypes, term22, args);
    }

};


