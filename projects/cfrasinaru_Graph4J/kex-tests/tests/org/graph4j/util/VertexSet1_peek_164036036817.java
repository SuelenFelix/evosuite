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

public class VertexSet1_peek_164036036817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71642;

    public VertexSet1_peek_164036036817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71642 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71643 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71644 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71648 = (int[]) newIntArray(6);
        Object term71657 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71658 = (long[]) newLongArray(1);
        setField(term71643, term71643.getClass(), "table", term71644);
        setIntField(term71643, term71643.getClass(), "count", -500432727);
        setIntField(term71643, term71643.getClass(), "threshold", 15);
        setFloatField(term71643, term71643.getClass(), "loadFactor", 0.75F);
        setField(term71642, term71642.getClass(), "posMap", term71643);
        setField(term71642, term71642.getClass(), "graph", null);
        setIntElement(term71648, 0, -2047392780);
        setIntElement(term71648, 1, -1637799701);
        setIntElement(term71648, 2, 1698600430);
        setIntElement(term71648, 3, -1431010224);
        setIntElement(term71648, 4, -1025991695);
        setIntElement(term71648, 5, -1660783456);
        setField(term71642, term71642.getClass(), "vertices", term71648);
        setIntField(term71642, term71642.getClass(), "numVertices", -1695731044);
        setIntField(term71642, term71642.getClass(), "first", -255451892);
        setField(term71657, term71657.getClass(), "words", term71658);
        setIntField(term71657, term71657.getClass(), "wordsInUse", -1224111256);
        setBooleanField(term71657, term71657.getClass(), "sizeIsSticky", true);
        setField(term71642, term71642.getClass(), "bitset", term71657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term71642, args);
    }

};


