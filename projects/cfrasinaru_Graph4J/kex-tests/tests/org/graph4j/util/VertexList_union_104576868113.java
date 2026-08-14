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

public class VertexList_union_104576868113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2583;
     Object term2599;

    public VertexList_union_104576868113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2583 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2584 = (int[]) newIntArray(7);
        Object term2594 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2595 = (long[]) newLongArray(1);
        setField(term2583, term2583.getClass(), "graph", null);
        setIntElement(term2584, 0, 454242689);
        setIntElement(term2584, 1, 1798354517);
        setIntElement(term2584, 2, -1495693617);
        setIntElement(term2584, 3, -890538258);
        setIntElement(term2584, 4, -1085899912);
        setIntElement(term2584, 5, -1458980236);
        setIntElement(term2584, 6, 890505372);
        setField(term2583, term2583.getClass(), "vertices", term2584);
        setIntField(term2583, term2583.getClass(), "numVertices", 2044137055);
        setIntField(term2583, term2583.getClass(), "first", -1452324619);
        setField(term2594, term2594.getClass(), "words", term2595);
        setIntField(term2594, term2594.getClass(), "wordsInUse", -1121709274);
        setBooleanField(term2594, term2594.getClass(), "sizeIsSticky", true);
        setField(term2583, term2583.getClass(), "bitset", term2594);
        term2599 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2600 = (int[]) newIntArray(4);
        Object term2607 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2608 = (long[]) newLongArray(1);
        setField(term2599, term2599.getClass(), "graph", null);
        setIntElement(term2600, 0, -532304223);
        setIntElement(term2600, 1, 666218293);
        setIntElement(term2600, 2, 1737876343);
        setIntElement(term2600, 3, -897937940);
        setField(term2599, term2599.getClass(), "vertices", term2600);
        setIntField(term2599, term2599.getClass(), "numVertices", 1523261232);
        setIntField(term2599, term2599.getClass(), "first", -428988337);
        setField(term2607, term2607.getClass(), "words", term2608);
        setIntField(term2607, term2607.getClass(), "wordsInUse", 48047085);
        setBooleanField(term2607, term2607.getClass(), "sizeIsSticky", true);
        setField(term2599, term2599.getClass(), "bitset", term2607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexList");
        Object[] args = new Object[1];
        args[0] = term2599;
        callMethod(klass, "union", argTypes, term2583, args);
    }

};


