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

public class VertexSet_peek_158665550715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8269;

    public VertexSet_peek_158665550715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8269 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8270 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8271 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8275 = (int[]) newIntArray(5);
        Object term8283 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8284 = (long[]) newLongArray(1);
        setField(term8270, term8270.getClass(), "table", term8271);
        setIntField(term8270, term8270.getClass(), "count", 272179554);
        setIntField(term8270, term8270.getClass(), "threshold", 15);
        setFloatField(term8270, term8270.getClass(), "loadFactor", 0.75F);
        setField(term8269, term8269.getClass(), "posMap", term8270);
        setField(term8269, term8269.getClass(), "graph", null);
        setIntElement(term8275, 0, 1717711536);
        setIntElement(term8275, 1, -606339607);
        setIntElement(term8275, 2, 800440712);
        setIntElement(term8275, 3, -1976407622);
        setIntElement(term8275, 4, -552996061);
        setField(term8269, term8269.getClass(), "vertices", term8275);
        setIntField(term8269, term8269.getClass(), "numVertices", -153013117);
        setIntField(term8269, term8269.getClass(), "first", 712181359);
        setField(term8283, term8283.getClass(), "words", term8284);
        setIntField(term8283, term8283.getClass(), "wordsInUse", -1943255435);
        setBooleanField(term8283, term8283.getClass(), "sizeIsSticky", true);
        setField(term8269, term8269.getClass(), "bitset", term8283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term8269, args);
    }

};


