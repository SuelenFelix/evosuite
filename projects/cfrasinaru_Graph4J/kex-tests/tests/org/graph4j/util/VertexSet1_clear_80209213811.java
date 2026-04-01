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
     Object term71526;

    public VertexSet1_clear_80209213811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71526 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71527 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71528 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71532 = (int[]) newIntArray(4);
        Object term71539 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71540 = (long[]) newLongArray(1);
        setField(term71527, term71527.getClass(), "table", term71528);
        setIntField(term71527, term71527.getClass(), "count", -122537673);
        setIntField(term71527, term71527.getClass(), "threshold", 15);
        setFloatField(term71527, term71527.getClass(), "loadFactor", 0.75F);
        setField(term71526, term71526.getClass(), "posMap", term71527);
        setField(term71526, term71526.getClass(), "graph", null);
        setIntElement(term71532, 0, 824068126);
        setIntElement(term71532, 1, 1657336748);
        setIntElement(term71532, 2, -267331048);
        setIntElement(term71532, 3, -1707487274);
        setField(term71526, term71526.getClass(), "vertices", term71532);
        setIntField(term71526, term71526.getClass(), "numVertices", -687077769);
        setIntField(term71526, term71526.getClass(), "first", 1239617209);
        setField(term71539, term71539.getClass(), "words", term71540);
        setIntField(term71539, term71539.getClass(), "wordsInUse", -1866259664);
        setBooleanField(term71539, term71539.getClass(), "sizeIsSticky", false);
        setField(term71526, term71526.getClass(), "bitset", term71539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term71526, args);
    }

};


