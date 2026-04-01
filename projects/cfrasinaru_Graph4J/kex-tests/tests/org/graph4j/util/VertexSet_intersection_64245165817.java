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

public class VertexSet_intersection_64245165817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150405;
     Object term150428;

    public VertexSet_intersection_64245165817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150405 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150406 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150407 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150411 = (int[]) newIntArray(9);
        Object term150423 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150424 = (long[]) newLongArray(1);
        setField(term150406, term150406.getClass(), "table", term150407);
        setIntField(term150406, term150406.getClass(), "count", 1886528943);
        setIntField(term150406, term150406.getClass(), "threshold", 15);
        setFloatField(term150406, term150406.getClass(), "loadFactor", 0.75F);
        setField(term150405, term150405.getClass(), "posMap", term150406);
        setField(term150405, term150405.getClass(), "graph", null);
        setIntElement(term150411, 0, -789221265);
        setIntElement(term150411, 1, -1179743417);
        setIntElement(term150411, 2, 441450424);
        setIntElement(term150411, 3, 793139290);
        setIntElement(term150411, 4, 1379976592);
        setIntElement(term150411, 5, -960650812);
        setIntElement(term150411, 6, 1610368493);
        setIntElement(term150411, 7, 1480724209);
        setIntElement(term150411, 8, 1249113599);
        setField(term150405, term150405.getClass(), "vertices", term150411);
        setIntField(term150405, term150405.getClass(), "numVertices", -1420467871);
        setIntField(term150405, term150405.getClass(), "first", 490995191);
        setField(term150423, term150423.getClass(), "words", term150424);
        setIntField(term150423, term150423.getClass(), "wordsInUse", -1635354935);
        setBooleanField(term150423, term150423.getClass(), "sizeIsSticky", false);
        setField(term150405, term150405.getClass(), "bitset", term150423);
        term150428 = (int[]) newIntArray(1);
        setIntElement(term150428, 0, 278229130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150428;
        callMethod(klass, "intersection", argTypes, term150405, args);
    }

};


