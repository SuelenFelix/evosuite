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

public class VertexSet1_intersection_83643626619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71717;
     Object term71732;

    public VertexSet1_intersection_83643626619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71717 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71718 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71719 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71723 = (int[]) newIntArray(1);
        Object term71727 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71728 = (long[]) newLongArray(1);
        setField(term71718, term71718.getClass(), "table", term71719);
        setIntField(term71718, term71718.getClass(), "count", -2138080639);
        setIntField(term71718, term71718.getClass(), "threshold", 15);
        setFloatField(term71718, term71718.getClass(), "loadFactor", 0.75F);
        setField(term71717, term71717.getClass(), "posMap", term71718);
        setField(term71717, term71717.getClass(), "graph", null);
        setIntElement(term71723, 0, 1515190471);
        setField(term71717, term71717.getClass(), "vertices", term71723);
        setIntField(term71717, term71717.getClass(), "numVertices", -565295100);
        setIntField(term71717, term71717.getClass(), "first", -155271123);
        setField(term71727, term71727.getClass(), "words", term71728);
        setIntField(term71727, term71727.getClass(), "wordsInUse", 1876008218);
        setBooleanField(term71727, term71727.getClass(), "sizeIsSticky", false);
        setField(term71717, term71717.getClass(), "bitset", term71727);
        term71732 = (int[]) newIntArray(5);
        setIntElement(term71732, 0, -1489159494);
        setIntElement(term71732, 1, 2098095371);
        setIntElement(term71732, 2, -1167910114);
        setIntElement(term71732, 3, 887019523);
        setIntElement(term71732, 4, 1368241755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71732;
        callMethod(klass, "intersection", argTypes, term71717, args);
    }

};


