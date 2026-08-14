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
import java.lang.Integer;

public class VertexSet_remove_20659469749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8121;
     Object term8139;

    public VertexSet_remove_20659469749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8121 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8122 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8123 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8127 = (int[]) newIntArray(4);
        Object term8134 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8135 = (long[]) newLongArray(1);
        setField(term8122, term8122.getClass(), "table", term8123);
        setIntField(term8122, term8122.getClass(), "count", -1965331640);
        setIntField(term8122, term8122.getClass(), "threshold", 15);
        setFloatField(term8122, term8122.getClass(), "loadFactor", 0.75F);
        setField(term8121, term8121.getClass(), "posMap", term8122);
        setField(term8121, term8121.getClass(), "graph", null);
        setIntElement(term8127, 0, -514392629);
        setIntElement(term8127, 1, -166633123);
        setIntElement(term8127, 2, 373110517);
        setIntElement(term8127, 3, -1632703926);
        setField(term8121, term8121.getClass(), "vertices", term8127);
        setIntField(term8121, term8121.getClass(), "numVertices", -1031499401);
        setIntField(term8121, term8121.getClass(), "first", 280202002);
        setField(term8134, term8134.getClass(), "words", term8135);
        setIntField(term8134, term8134.getClass(), "wordsInUse", -1074402599);
        setBooleanField(term8134, term8134.getClass(), "sizeIsSticky", false);
        setField(term8121, term8121.getClass(), "bitset", term8134);
        term8139 = new Integer(-1867539151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8139;
        callMethod(klass, "remove", argTypes, term8121, args);
    }

};


