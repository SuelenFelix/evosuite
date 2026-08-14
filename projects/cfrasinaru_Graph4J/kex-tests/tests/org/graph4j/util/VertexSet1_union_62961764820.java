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

public class VertexSet1_union_62961764820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71745;
     Object term71763;

    public VertexSet1_union_62961764820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71745 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71746 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71747 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71751 = (int[]) newIntArray(4);
        Object term71758 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71759 = (long[]) newLongArray(1);
        setField(term71746, term71746.getClass(), "table", term71747);
        setIntField(term71746, term71746.getClass(), "count", 638332794);
        setIntField(term71746, term71746.getClass(), "threshold", 15);
        setFloatField(term71746, term71746.getClass(), "loadFactor", 0.75F);
        setField(term71745, term71745.getClass(), "posMap", term71746);
        setField(term71745, term71745.getClass(), "graph", null);
        setIntElement(term71751, 0, 813998278);
        setIntElement(term71751, 1, 1609669666);
        setIntElement(term71751, 2, -762558361);
        setIntElement(term71751, 3, 887781125);
        setField(term71745, term71745.getClass(), "vertices", term71751);
        setIntField(term71745, term71745.getClass(), "numVertices", 156944686);
        setIntField(term71745, term71745.getClass(), "first", -271866942);
        setField(term71758, term71758.getClass(), "words", term71759);
        setIntField(term71758, term71758.getClass(), "wordsInUse", 385425101);
        setBooleanField(term71758, term71758.getClass(), "sizeIsSticky", true);
        setField(term71745, term71745.getClass(), "bitset", term71758);
        term71763 = (int[]) newIntArray(1);
        setIntElement(term71763, 0, -1505816576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71763;
        callMethod(klass, "union", argTypes, term71745, args);
    }

};


