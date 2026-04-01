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
import java.lang.Integer;

public class VertexSet1_contains_151723498613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71576;
     Object term71595;

    public VertexSet1_contains_151723498613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71576 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71577 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71578 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71582 = (int[]) newIntArray(5);
        Object term71590 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71591 = (long[]) newLongArray(1);
        setField(term71577, term71577.getClass(), "table", term71578);
        setIntField(term71577, term71577.getClass(), "count", -913545640);
        setIntField(term71577, term71577.getClass(), "threshold", 15);
        setFloatField(term71577, term71577.getClass(), "loadFactor", 0.75F);
        setField(term71576, term71576.getClass(), "posMap", term71577);
        setField(term71576, term71576.getClass(), "graph", null);
        setIntElement(term71582, 0, 1019617568);
        setIntElement(term71582, 1, -89684579);
        setIntElement(term71582, 2, -259140396);
        setIntElement(term71582, 3, 2058486253);
        setIntElement(term71582, 4, -1940345085);
        setField(term71576, term71576.getClass(), "vertices", term71582);
        setIntField(term71576, term71576.getClass(), "numVertices", -1732622094);
        setIntField(term71576, term71576.getClass(), "first", 2112663117);
        setField(term71590, term71590.getClass(), "words", term71591);
        setIntField(term71590, term71590.getClass(), "wordsInUse", 310553066);
        setBooleanField(term71590, term71590.getClass(), "sizeIsSticky", false);
        setField(term71576, term71576.getClass(), "bitset", term71590);
        term71595 = new Integer(-162362750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71595;
        callMethod(klass, "contains", argTypes, term71576, args);
    }

};


