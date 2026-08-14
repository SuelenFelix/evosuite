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

public class VertexSet1_addAll_13723333878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2831;
     Object term2851;

    public VertexSet1_addAll_13723333878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2831 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2832 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2833 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2837 = (int[]) newIntArray(6);
        Object term2846 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2847 = (long[]) newLongArray(1);
        setField(term2832, term2832.getClass(), "table", term2833);
        setIntField(term2832, term2832.getClass(), "count", 1574458332);
        setIntField(term2832, term2832.getClass(), "threshold", 15);
        setFloatField(term2832, term2832.getClass(), "loadFactor", 0.75F);
        setField(term2831, term2831.getClass(), "posMap", term2832);
        setField(term2831, term2831.getClass(), "graph", null);
        setIntElement(term2837, 0, -975856245);
        setIntElement(term2837, 1, -1023366103);
        setIntElement(term2837, 2, 81427089);
        setIntElement(term2837, 3, 755951489);
        setIntElement(term2837, 4, 1175146356);
        setIntElement(term2837, 5, -2137419728);
        setField(term2831, term2831.getClass(), "vertices", term2837);
        setIntField(term2831, term2831.getClass(), "numVertices", 1558810715);
        setIntField(term2831, term2831.getClass(), "first", -382652403);
        setField(term2846, term2846.getClass(), "words", term2847);
        setIntField(term2846, term2846.getClass(), "wordsInUse", -2126539433);
        setBooleanField(term2846, term2846.getClass(), "sizeIsSticky", true);
        setField(term2831, term2831.getClass(), "bitset", term2846);
        term2851 = (int[]) newIntArray(2);
        setIntElement(term2851, 0, 196952878);
        setIntElement(term2851, 1, 802673242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2851;
        callMethod(klass, "addAll", argTypes, term2831, args);
    }

};


