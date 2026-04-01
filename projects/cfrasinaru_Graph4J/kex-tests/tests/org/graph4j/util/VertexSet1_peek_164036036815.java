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

public class VertexSet1_peek_164036036815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71634;

    public VertexSet1_peek_164036036815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71634 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71635 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71636 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71640 = (int[]) newIntArray(6);
        Object term71649 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71650 = (long[]) newLongArray(1);
        setField(term71635, term71635.getClass(), "table", term71636);
        setIntField(term71635, term71635.getClass(), "count", -500432727);
        setIntField(term71635, term71635.getClass(), "threshold", 15);
        setFloatField(term71635, term71635.getClass(), "loadFactor", 0.75F);
        setField(term71634, term71634.getClass(), "posMap", term71635);
        setField(term71634, term71634.getClass(), "graph", null);
        setIntElement(term71640, 0, -2047392780);
        setIntElement(term71640, 1, -1637799701);
        setIntElement(term71640, 2, 1698600430);
        setIntElement(term71640, 3, -1431010224);
        setIntElement(term71640, 4, -1025991695);
        setIntElement(term71640, 5, -1660783456);
        setField(term71634, term71634.getClass(), "vertices", term71640);
        setIntField(term71634, term71634.getClass(), "numVertices", -1695731044);
        setIntField(term71634, term71634.getClass(), "first", -255451892);
        setField(term71649, term71649.getClass(), "words", term71650);
        setIntField(term71649, term71649.getClass(), "wordsInUse", -1224111256);
        setBooleanField(term71649, term71649.getClass(), "sizeIsSticky", true);
        setField(term71634, term71634.getClass(), "bitset", term71649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term71634, args);
    }

};


