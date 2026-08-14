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
import java.lang.Object;

public class VertexSet1_equals_101122898920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3155;
     Object term3175;

    public VertexSet1_equals_101122898920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3155 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3156 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3157 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3161 = (int[]) newIntArray(6);
        Object term3170 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3171 = (long[]) newLongArray(1);
        setField(term3156, term3156.getClass(), "table", term3157);
        setIntField(term3156, term3156.getClass(), "count", 186472650);
        setIntField(term3156, term3156.getClass(), "threshold", 15);
        setFloatField(term3156, term3156.getClass(), "loadFactor", 0.75F);
        setField(term3155, term3155.getClass(), "posMap", term3156);
        setField(term3155, term3155.getClass(), "graph", null);
        setIntElement(term3161, 0, 279675992);
        setIntElement(term3161, 1, -1626074989);
        setIntElement(term3161, 2, -552272253);
        setIntElement(term3161, 3, -633523956);
        setIntElement(term3161, 4, 1761540885);
        setIntElement(term3161, 5, -168498989);
        setField(term3155, term3155.getClass(), "vertices", term3161);
        setIntField(term3155, term3155.getClass(), "numVertices", 388247095);
        setIntField(term3155, term3155.getClass(), "first", -1320402633);
        setField(term3170, term3170.getClass(), "words", term3171);
        setIntField(term3170, term3170.getClass(), "wordsInUse", 919602316);
        setBooleanField(term3170, term3170.getClass(), "sizeIsSticky", false);
        setField(term3155, term3155.getClass(), "bitset", term3170);
        term3175 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3175;
        callMethod(klass, "equals", argTypes, term3155, args);
    }

};


