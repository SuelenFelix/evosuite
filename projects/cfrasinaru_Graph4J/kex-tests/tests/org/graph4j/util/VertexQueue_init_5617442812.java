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
     Object term4212;

    public VertexQueue_init_5617442812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4212 = (int[]) newIntArray(9);
        setIntElement(term4212, 0, -1443680397);
        setIntElement(term4212, 1, -1331169079);
        setIntElement(term4212, 2, 1109050836);
        setIntElement(term4212, 3, 1978065000);
        setIntElement(term4212, 4, -2121133707);
        setIntElement(term4212, 5, -1005498887);
        setIntElement(term4212, 6, 1329150584);
        setIntElement(term4212, 7, -1825382367);
        setIntElement(term4212, 8, -1791371074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4212;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


