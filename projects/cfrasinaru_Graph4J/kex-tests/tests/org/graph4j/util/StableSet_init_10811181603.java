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

public class StableSet_init_10811181603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8754;

    public StableSet_init_10811181603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8754 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8755 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8756 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8760 = (int[]) newIntArray(1);
        Object term8764 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8765 = (long[]) newLongArray(1);
        setField(term8755, term8755.getClass(), "table", term8756);
        setIntField(term8755, term8755.getClass(), "count", -508560324);
        setIntField(term8755, term8755.getClass(), "threshold", 15);
        setFloatField(term8755, term8755.getClass(), "loadFactor", 0.75F);
        setField(term8754, term8754.getClass(), "posMap", term8755);
        setField(term8754, term8754.getClass(), "graph", null);
        setIntElement(term8760, 0, -1700781575);
        setField(term8754, term8754.getClass(), "vertices", term8760);
        setIntField(term8754, term8754.getClass(), "numVertices", -2042022388);
        setIntField(term8754, term8754.getClass(), "first", 390228535);
        setField(term8764, term8764.getClass(), "words", term8765);
        setIntField(term8764, term8764.getClass(), "wordsInUse", -667505209);
        setBooleanField(term8764, term8764.getClass(), "sizeIsSticky", true);
        setField(term8754, term8754.getClass(), "bitset", term8764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term8754;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


