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

public class VertexSet_pop_160934795914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8244;

    public VertexSet_pop_160934795914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8244 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8245 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8246 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8250 = (int[]) newIntArray(5);
        Object term8258 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8259 = (long[]) newLongArray(1);
        setField(term8245, term8245.getClass(), "table", term8246);
        setIntField(term8245, term8245.getClass(), "count", 114898432);
        setIntField(term8245, term8245.getClass(), "threshold", 15);
        setFloatField(term8245, term8245.getClass(), "loadFactor", 0.75F);
        setField(term8244, term8244.getClass(), "posMap", term8245);
        setField(term8244, term8244.getClass(), "graph", null);
        setIntElement(term8250, 0, -193767503);
        setIntElement(term8250, 1, -2090918082);
        setIntElement(term8250, 2, 1505717672);
        setIntElement(term8250, 3, -1683274691);
        setIntElement(term8250, 4, -935900044);
        setField(term8244, term8244.getClass(), "vertices", term8250);
        setIntField(term8244, term8244.getClass(), "numVertices", 1747876558);
        setIntField(term8244, term8244.getClass(), "first", 833477776);
        setField(term8258, term8258.getClass(), "words", term8259);
        setIntField(term8258, term8258.getClass(), "wordsInUse", 2043960707);
        setBooleanField(term8258, term8258.getClass(), "sizeIsSticky", false);
        setField(term8244, term8244.getClass(), "bitset", term8258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term8244, args);
    }

};


