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

public class VertexSet1_remove_21196518359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2863;
     Object term2882;

    public VertexSet1_remove_21196518359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2863 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2864 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2865 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2869 = (int[]) newIntArray(5);
        Object term2877 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2878 = (long[]) newLongArray(1);
        setField(term2864, term2864.getClass(), "table", term2865);
        setIntField(term2864, term2864.getClass(), "count", -1808638031);
        setIntField(term2864, term2864.getClass(), "threshold", 15);
        setFloatField(term2864, term2864.getClass(), "loadFactor", 0.75F);
        setField(term2863, term2863.getClass(), "posMap", term2864);
        setField(term2863, term2863.getClass(), "graph", null);
        setIntElement(term2869, 0, -1514240086);
        setIntElement(term2869, 1, 2052244839);
        setIntElement(term2869, 2, -1763480506);
        setIntElement(term2869, 3, -1541297110);
        setIntElement(term2869, 4, -1581464804);
        setField(term2863, term2863.getClass(), "vertices", term2869);
        setIntField(term2863, term2863.getClass(), "numVertices", -1954937310);
        setIntField(term2863, term2863.getClass(), "first", -460657407);
        setField(term2877, term2877.getClass(), "words", term2878);
        setIntField(term2877, term2877.getClass(), "wordsInUse", 941003590);
        setBooleanField(term2877, term2877.getClass(), "sizeIsSticky", true);
        setField(term2863, term2863.getClass(), "bitset", term2877);
        term2882 = new Integer(-1825624890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2882;
        callMethod(klass, "remove", argTypes, term2863, args);
    }

};


