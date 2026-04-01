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
import java.lang.Boolean;

public class CycleGenerator_addEdges_19513592905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2657;
     Object term2667;

    public CycleGenerator_addEdges_19513592905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2657 = newInstance(Class.forName("org.graph4j.generators.CycleGenerator"));
        int[] term2658 = (int[]) newIntArray(8);
        setIntElement(term2658, 0, 2136158480);
        setIntElement(term2658, 1, 2118747457);
        setIntElement(term2658, 2, 1868344256);
        setIntElement(term2658, 3, 1857693976);
        setIntElement(term2658, 4, 1631305277);
        setIntElement(term2658, 5, 162113491);
        setIntElement(term2658, 6, -932147928);
        setIntElement(term2658, 7, 487369012);
        setField(term2657, term2657.getClass(), "vertices", term2658);
        term2667 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CycleGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2667;
        callMethod(klass, "addEdges", argTypes, term2657, args);
    }

};


