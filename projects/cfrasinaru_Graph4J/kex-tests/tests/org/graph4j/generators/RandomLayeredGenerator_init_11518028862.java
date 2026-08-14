package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class RandomLayeredGenerator_init_11518028862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;
     Object term2575;
     Object term2577;
     Object term2579;
     Object term2581;

    public RandomLayeredGenerator_init_11518028862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2573 = new Integer(0);
        term2575 = new Integer(0);
        term2577 = new Integer(0);
        term2579 = new Double(0.0);
        term2581 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomLayeredGenerator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("java.util.function.DoubleFunction");
        Object[] args = new Object[6];
        args[0] = term2573;
        args[1] = term2575;
        args[2] = term2577;
        args[3] = term2579;
        args[4] = term2581;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


