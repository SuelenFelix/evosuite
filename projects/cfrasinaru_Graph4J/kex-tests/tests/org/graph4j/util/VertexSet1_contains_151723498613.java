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

public class VertexSet1_contains_151723498613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2957;
     Object term2974;

    public VertexSet1_contains_151723498613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2957 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2958 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2959 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2963 = (int[]) newIntArray(3);
        Object term2969 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2970 = (long[]) newLongArray(1);
        setField(term2958, term2958.getClass(), "table", term2959);
        setIntField(term2958, term2958.getClass(), "count", 593962063);
        setIntField(term2958, term2958.getClass(), "threshold", 15);
        setFloatField(term2958, term2958.getClass(), "loadFactor", 0.75F);
        setField(term2957, term2957.getClass(), "posMap", term2958);
        setField(term2957, term2957.getClass(), "graph", null);
        setIntElement(term2963, 0, -1485826786);
        setIntElement(term2963, 1, -1549952664);
        setIntElement(term2963, 2, 148394188);
        setField(term2957, term2957.getClass(), "vertices", term2963);
        setIntField(term2957, term2957.getClass(), "numVertices", 504525721);
        setIntField(term2957, term2957.getClass(), "first", 1835568392);
        setField(term2969, term2969.getClass(), "words", term2970);
        setIntField(term2969, term2969.getClass(), "wordsInUse", 457470807);
        setBooleanField(term2969, term2969.getClass(), "sizeIsSticky", false);
        setField(term2957, term2957.getClass(), "bitset", term2969);
        term2974 = new Integer(-994742871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2974;
        callMethod(klass, "contains", argTypes, term2957, args);
    }

};


