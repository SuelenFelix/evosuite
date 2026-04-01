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

public class VertexSet1_hashCode_145991566419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71763;

    public VertexSet1_hashCode_145991566419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71763 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71764 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71765 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71769 = (int[]) newIntArray(7);
        Object term71779 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71780 = (long[]) newLongArray(1);
        setField(term71764, term71764.getClass(), "table", term71765);
        setIntField(term71764, term71764.getClass(), "count", -1877003964);
        setIntField(term71764, term71764.getClass(), "threshold", 15);
        setFloatField(term71764, term71764.getClass(), "loadFactor", 0.75F);
        setField(term71763, term71763.getClass(), "posMap", term71764);
        setField(term71763, term71763.getClass(), "graph", null);
        setIntElement(term71769, 0, 1700904086);
        setIntElement(term71769, 1, -362916771);
        setIntElement(term71769, 2, 1886181117);
        setIntElement(term71769, 3, -229212246);
        setIntElement(term71769, 4, 1726721533);
        setIntElement(term71769, 5, -328854592);
        setIntElement(term71769, 6, 765971129);
        setField(term71763, term71763.getClass(), "vertices", term71769);
        setIntField(term71763, term71763.getClass(), "numVertices", -385727798);
        setIntField(term71763, term71763.getClass(), "first", -1441415289);
        setField(term71779, term71779.getClass(), "words", term71780);
        setIntField(term71779, term71779.getClass(), "wordsInUse", 1081832872);
        setBooleanField(term71779, term71779.getClass(), "sizeIsSticky", false);
        setField(term71763, term71763.getClass(), "bitset", term71779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term71763, args);
    }

};


