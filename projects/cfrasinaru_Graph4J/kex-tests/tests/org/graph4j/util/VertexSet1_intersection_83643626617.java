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

public class VertexSet1_intersection_83643626617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3070;
     Object term3085;

    public VertexSet1_intersection_83643626617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3070 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3071 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3072 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3076 = (int[]) newIntArray(1);
        Object term3080 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3081 = (long[]) newLongArray(1);
        setField(term3071, term3071.getClass(), "table", term3072);
        setIntField(term3071, term3071.getClass(), "count", -1731921726);
        setIntField(term3071, term3071.getClass(), "threshold", 15);
        setFloatField(term3071, term3071.getClass(), "loadFactor", 0.75F);
        setField(term3070, term3070.getClass(), "posMap", term3071);
        setField(term3070, term3070.getClass(), "graph", null);
        setIntElement(term3076, 0, 919994471);
        setField(term3070, term3070.getClass(), "vertices", term3076);
        setIntField(term3070, term3070.getClass(), "numVertices", 183531701);
        setIntField(term3070, term3070.getClass(), "first", -974923743);
        setField(term3080, term3080.getClass(), "words", term3081);
        setIntField(term3080, term3080.getClass(), "wordsInUse", 1876738932);
        setBooleanField(term3080, term3080.getClass(), "sizeIsSticky", true);
        setField(term3070, term3070.getClass(), "bitset", term3080);
        term3085 = (int[]) newIntArray(1);
        setIntElement(term3085, 0, -1870339027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3085;
        callMethod(klass, "intersection", argTypes, term3070, args);
    }

};


