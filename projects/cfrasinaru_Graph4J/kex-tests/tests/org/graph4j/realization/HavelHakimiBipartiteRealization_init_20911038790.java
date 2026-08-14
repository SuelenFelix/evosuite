package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HavelHakimiBipartiteRealization_init_20911038790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;

    public HavelHakimiBipartiteRealization_init_20911038790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (int[]) newIntArray(5);
        setIntElement(term1, 0, 568599855);
        setIntElement(term1, 1, 1162663216);
        setIntElement(term1, 2, 1484323161);
        setIntElement(term1, 3, 391863371);
        setIntElement(term1, 4, -1922583790);
        term7 = (int[]) newIntArray(4);
        setIntElement(term7, 0, -616727354);
        setIntElement(term7, 1, -1955890973);
        setIntElement(term7, 2, -2038273078);
        setIntElement(term7, 3, 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


