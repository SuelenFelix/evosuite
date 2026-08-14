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

public class VertexSet1_clear_80209213812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71529;

    public VertexSet1_clear_80209213812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71529 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71530 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71531 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71535 = (int[]) newIntArray(4);
        Object term71542 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71543 = (long[]) newLongArray(1);
        setField(term71530, term71530.getClass(), "table", term71531);
        setIntField(term71530, term71530.getClass(), "count", -122537673);
        setIntField(term71530, term71530.getClass(), "threshold", 15);
        setFloatField(term71530, term71530.getClass(), "loadFactor", 0.75F);
        setField(term71529, term71529.getClass(), "posMap", term71530);
        setField(term71529, term71529.getClass(), "graph", null);
        setIntElement(term71535, 0, 824068126);
        setIntElement(term71535, 1, 1657336748);
        setIntElement(term71535, 2, -267331048);
        setIntElement(term71535, 3, -1707487274);
        setField(term71529, term71529.getClass(), "vertices", term71535);
        setIntField(term71529, term71529.getClass(), "numVertices", -687077769);
        setIntField(term71529, term71529.getClass(), "first", 1239617209);
        setField(term71542, term71542.getClass(), "words", term71543);
        setIntField(term71542, term71542.getClass(), "wordsInUse", -1866259664);
        setBooleanField(term71542, term71542.getClass(), "sizeIsSticky", false);
        setField(term71529, term71529.getClass(), "bitset", term71542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term71529, args);
    }

};


