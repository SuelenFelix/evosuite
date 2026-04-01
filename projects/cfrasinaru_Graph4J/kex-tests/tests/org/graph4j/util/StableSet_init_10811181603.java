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
     Object term154722;

    public StableSet_init_10811181603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154722 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term154723 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154724 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term154728 = (int[]) newIntArray(3);
        Object term154734 = newInstance(Class.forName("java.util.BitSet"));
        long[] term154735 = (long[]) newLongArray(1);
        setField(term154723, term154723.getClass(), "table", term154724);
        setIntField(term154723, term154723.getClass(), "count", -1818241002);
        setIntField(term154723, term154723.getClass(), "threshold", 15);
        setFloatField(term154723, term154723.getClass(), "loadFactor", 0.75F);
        setField(term154722, term154722.getClass(), "posMap", term154723);
        setField(term154722, term154722.getClass(), "graph", null);
        setIntElement(term154728, 0, 879684971);
        setIntElement(term154728, 1, 1735383579);
        setIntElement(term154728, 2, 1320949921);
        setField(term154722, term154722.getClass(), "vertices", term154728);
        setIntField(term154722, term154722.getClass(), "numVertices", -1693544826);
        setIntField(term154722, term154722.getClass(), "first", -772814477);
        setField(term154734, term154734.getClass(), "words", term154735);
        setIntField(term154734, term154734.getClass(), "wordsInUse", 1710738282);
        setBooleanField(term154734, term154734.getClass(), "sizeIsSticky", true);
        setField(term154722, term154722.getClass(), "bitset", term154734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term154722;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


