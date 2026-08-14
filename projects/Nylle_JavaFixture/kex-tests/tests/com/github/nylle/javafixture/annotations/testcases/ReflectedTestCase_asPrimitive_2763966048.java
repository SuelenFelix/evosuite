package com.github.nylle.javafixture.annotations.testcases;

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
import static com.github.nylle.javafixture.annotations.testcases.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReflectedTestCase_asPrimitive_2763966048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;

    public ReflectedTestCase_asPrimitive_2763966048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411 = newInstance(Class.forName("com.github.nylle.javafixture.annotations.testcases.ReflectedTestCase"));
        setField(term411, term411.getClass(), "matrix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.annotations.testcases.ReflectedTestCase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "asPrimitive", argTypes, term411, args);
    }

};


