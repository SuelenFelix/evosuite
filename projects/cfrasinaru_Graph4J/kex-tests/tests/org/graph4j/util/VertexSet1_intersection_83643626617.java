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
     Object term71709;
     Object term71724;

    public VertexSet1_intersection_83643626617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71709 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71710 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71711 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71715 = (int[]) newIntArray(1);
        Object term71719 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71720 = (long[]) newLongArray(1);
        setField(term71710, term71710.getClass(), "table", term71711);
        setIntField(term71710, term71710.getClass(), "count", -2138080639);
        setIntField(term71710, term71710.getClass(), "threshold", 15);
        setFloatField(term71710, term71710.getClass(), "loadFactor", 0.75F);
        setField(term71709, term71709.getClass(), "posMap", term71710);
        setField(term71709, term71709.getClass(), "graph", null);
        setIntElement(term71715, 0, 1515190471);
        setField(term71709, term71709.getClass(), "vertices", term71715);
        setIntField(term71709, term71709.getClass(), "numVertices", -565295100);
        setIntField(term71709, term71709.getClass(), "first", -155271123);
        setField(term71719, term71719.getClass(), "words", term71720);
        setIntField(term71719, term71719.getClass(), "wordsInUse", 1876008218);
        setBooleanField(term71719, term71719.getClass(), "sizeIsSticky", false);
        setField(term71709, term71709.getClass(), "bitset", term71719);
        term71724 = (int[]) newIntArray(5);
        setIntElement(term71724, 0, -1489159494);
        setIntElement(term71724, 1, 2098095371);
        setIntElement(term71724, 2, -1167910114);
        setIntElement(term71724, 3, 887019523);
        setIntElement(term71724, 4, 1368241755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71724;
        callMethod(klass, "intersection", argTypes, term71709, args);
    }

};


