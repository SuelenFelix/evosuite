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

public class StableSet_checkEdges_17036719855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8800;

    public StableSet_checkEdges_17036719855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8800 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term8801 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8802 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8806 = (int[]) newIntArray(6);
        Object term8815 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8816 = (long[]) newLongArray(1);
        setField(term8801, term8801.getClass(), "table", term8802);
        setIntField(term8801, term8801.getClass(), "count", -663671886);
        setIntField(term8801, term8801.getClass(), "threshold", 15);
        setFloatField(term8801, term8801.getClass(), "loadFactor", 0.75F);
        setField(term8800, term8800.getClass(), "posMap", term8801);
        setField(term8800, term8800.getClass(), "graph", null);
        setIntElement(term8806, 0, -1295577968);
        setIntElement(term8806, 1, 1006574741);
        setIntElement(term8806, 2, -1471698394);
        setIntElement(term8806, 3, 1146444085);
        setIntElement(term8806, 4, 316145449);
        setIntElement(term8806, 5, 387128751);
        setField(term8800, term8800.getClass(), "vertices", term8806);
        setIntField(term8800, term8800.getClass(), "numVertices", 1220621259);
        setIntField(term8800, term8800.getClass(), "first", 272507740);
        setField(term8815, term8815.getClass(), "words", term8816);
        setIntField(term8815, term8815.getClass(), "wordsInUse", -2117539025);
        setBooleanField(term8815, term8815.getClass(), "sizeIsSticky", false);
        setField(term8800, term8800.getClass(), "bitset", term8815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term8800, args);
    }

};


