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

public class VertexSet_hashCode_151362052520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8456;

    public VertexSet_hashCode_151362052520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8456 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8457 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8458 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8462 = (int[]) newIntArray(1);
        Object term8466 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8467 = (long[]) newLongArray(1);
        setField(term8457, term8457.getClass(), "table", term8458);
        setIntField(term8457, term8457.getClass(), "count", -349448118);
        setIntField(term8457, term8457.getClass(), "threshold", 15);
        setFloatField(term8457, term8457.getClass(), "loadFactor", 0.75F);
        setField(term8456, term8456.getClass(), "posMap", term8457);
        setField(term8456, term8456.getClass(), "graph", null);
        setIntElement(term8462, 0, 1938137872);
        setField(term8456, term8456.getClass(), "vertices", term8462);
        setIntField(term8456, term8456.getClass(), "numVertices", 1767604467);
        setIntField(term8456, term8456.getClass(), "first", 1997859160);
        setField(term8466, term8466.getClass(), "words", term8467);
        setIntField(term8466, term8466.getClass(), "wordsInUse", 1565529799);
        setBooleanField(term8466, term8466.getClass(), "sizeIsSticky", true);
        setField(term8456, term8456.getClass(), "bitset", term8466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8456, args);
    }

};


