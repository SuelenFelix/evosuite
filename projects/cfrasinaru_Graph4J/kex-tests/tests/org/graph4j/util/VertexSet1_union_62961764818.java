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

public class VertexSet1_union_62961764818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71737;
     Object term71755;

    public VertexSet1_union_62961764818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71737 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71738 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71739 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71743 = (int[]) newIntArray(4);
        Object term71750 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71751 = (long[]) newLongArray(1);
        setField(term71738, term71738.getClass(), "table", term71739);
        setIntField(term71738, term71738.getClass(), "count", 638332794);
        setIntField(term71738, term71738.getClass(), "threshold", 15);
        setFloatField(term71738, term71738.getClass(), "loadFactor", 0.75F);
        setField(term71737, term71737.getClass(), "posMap", term71738);
        setField(term71737, term71737.getClass(), "graph", null);
        setIntElement(term71743, 0, 813998278);
        setIntElement(term71743, 1, 1609669666);
        setIntElement(term71743, 2, -762558361);
        setIntElement(term71743, 3, 887781125);
        setField(term71737, term71737.getClass(), "vertices", term71743);
        setIntField(term71737, term71737.getClass(), "numVertices", 156944686);
        setIntField(term71737, term71737.getClass(), "first", -271866942);
        setField(term71750, term71750.getClass(), "words", term71751);
        setIntField(term71750, term71750.getClass(), "wordsInUse", 385425101);
        setBooleanField(term71750, term71750.getClass(), "sizeIsSticky", true);
        setField(term71737, term71737.getClass(), "bitset", term71750);
        term71755 = (int[]) newIntArray(1);
        setIntElement(term71755, 0, -1505816576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71755;
        callMethod(klass, "union", argTypes, term71737, args);
    }

};


