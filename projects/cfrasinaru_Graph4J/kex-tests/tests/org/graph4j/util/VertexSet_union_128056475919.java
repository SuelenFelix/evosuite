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

public class VertexSet_union_128056475919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8398;
     Object term8419;

    public VertexSet_union_128056475919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8398 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8399 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8400 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8404 = (int[]) newIntArray(7);
        Object term8414 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8415 = (long[]) newLongArray(1);
        setField(term8399, term8399.getClass(), "table", term8400);
        setIntField(term8399, term8399.getClass(), "count", 1764150991);
        setIntField(term8399, term8399.getClass(), "threshold", 15);
        setFloatField(term8399, term8399.getClass(), "loadFactor", 0.75F);
        setField(term8398, term8398.getClass(), "posMap", term8399);
        setField(term8398, term8398.getClass(), "graph", null);
        setIntElement(term8404, 0, 944653455);
        setIntElement(term8404, 1, -1819474400);
        setIntElement(term8404, 2, 783684648);
        setIntElement(term8404, 3, 553754005);
        setIntElement(term8404, 4, 1986699236);
        setIntElement(term8404, 5, -1729178560);
        setIntElement(term8404, 6, 874974171);
        setField(term8398, term8398.getClass(), "vertices", term8404);
        setIntField(term8398, term8398.getClass(), "numVertices", -1689017763);
        setIntField(term8398, term8398.getClass(), "first", 1657387281);
        setField(term8414, term8414.getClass(), "words", term8415);
        setIntField(term8414, term8414.getClass(), "wordsInUse", 1276651382);
        setBooleanField(term8414, term8414.getClass(), "sizeIsSticky", true);
        setField(term8398, term8398.getClass(), "bitset", term8414);
        term8419 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8420 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8421 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8425 = (int[]) newIntArray(7);
        Object term8435 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8436 = (long[]) newLongArray(1);
        setField(term8420, term8420.getClass(), "table", term8421);
        setIntField(term8420, term8420.getClass(), "count", 266716659);
        setIntField(term8420, term8420.getClass(), "threshold", 15);
        setFloatField(term8420, term8420.getClass(), "loadFactor", 0.75F);
        setField(term8419, term8419.getClass(), "posMap", term8420);
        setField(term8419, term8419.getClass(), "graph", null);
        setIntElement(term8425, 0, 1249390809);
        setIntElement(term8425, 1, -1069437097);
        setIntElement(term8425, 2, 215016257);
        setIntElement(term8425, 3, -1967315273);
        setIntElement(term8425, 4, -1848110874);
        setIntElement(term8425, 5, -1988070462);
        setIntElement(term8425, 6, 323423569);
        setField(term8419, term8419.getClass(), "vertices", term8425);
        setIntField(term8419, term8419.getClass(), "numVertices", -274269573);
        setIntField(term8419, term8419.getClass(), "first", 1395520168);
        setField(term8435, term8435.getClass(), "words", term8436);
        setIntField(term8435, term8435.getClass(), "wordsInUse", -524708742);
        setBooleanField(term8435, term8435.getClass(), "sizeIsSticky", true);
        setField(term8419, term8419.getClass(), "bitset", term8435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term8419;
        callMethod(klass, "union", argTypes, term8398, args);
    }

};


