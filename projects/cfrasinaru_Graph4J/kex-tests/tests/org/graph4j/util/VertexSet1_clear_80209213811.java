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

public class VertexSet1_clear_80209213811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2909;

    public VertexSet1_clear_80209213811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2909 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2910 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2911 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2915 = (int[]) newIntArray(8);
        Object term2926 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2927 = (long[]) newLongArray(1);
        setField(term2910, term2910.getClass(), "table", term2911);
        setIntField(term2910, term2910.getClass(), "count", -860680764);
        setIntField(term2910, term2910.getClass(), "threshold", 15);
        setFloatField(term2910, term2910.getClass(), "loadFactor", 0.75F);
        setField(term2909, term2909.getClass(), "posMap", term2910);
        setField(term2909, term2909.getClass(), "graph", null);
        setIntElement(term2915, 0, -963198667);
        setIntElement(term2915, 1, -1007935918);
        setIntElement(term2915, 2, 1485731037);
        setIntElement(term2915, 3, 1304396087);
        setIntElement(term2915, 4, 1782600602);
        setIntElement(term2915, 5, -185892708);
        setIntElement(term2915, 6, -203163250);
        setIntElement(term2915, 7, 498473526);
        setField(term2909, term2909.getClass(), "vertices", term2915);
        setIntField(term2909, term2909.getClass(), "numVertices", 1186917020);
        setIntField(term2909, term2909.getClass(), "first", 1670041824);
        setField(term2926, term2926.getClass(), "words", term2927);
        setIntField(term2926, term2926.getClass(), "wordsInUse", 2140388634);
        setBooleanField(term2926, term2926.getClass(), "sizeIsSticky", true);
        setField(term2909, term2909.getClass(), "bitset", term2926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term2909, args);
    }

};


