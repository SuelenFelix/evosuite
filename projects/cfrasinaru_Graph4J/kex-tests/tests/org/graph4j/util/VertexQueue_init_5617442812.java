package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexQueue_init_5617442812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101146;

    public VertexQueue_init_5617442812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101146 = (int[]) newIntArray(9);
        setIntElement(term101146, 0, -1606093016);
        setIntElement(term101146, 1, 1649273071);
        setIntElement(term101146, 2, -1224864932);
        setIntElement(term101146, 3, 54480662);
        setIntElement(term101146, 4, 1555799329);
        setIntElement(term101146, 5, -1426263681);
        setIntElement(term101146, 6, -220900580);
        setIntElement(term101146, 7, -1612314595);
        setIntElement(term101146, 8, 74725785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term101146;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


