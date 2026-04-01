package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ParallelFilterKruskal_init_11193915129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ParallelFilterKruskal_init_11193915129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Graph");
        argTypes[2] = Class.forName("org.graph4j.util.UnionFind");
        argTypes[3] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        argTypes[4] = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


