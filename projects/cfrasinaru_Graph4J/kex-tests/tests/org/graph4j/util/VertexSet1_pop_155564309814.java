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

public class VertexSet1_pop_155564309814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2980;

    public VertexSet1_pop_155564309814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2980 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2981 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2982 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2986 = (int[]) newIntArray(3);
        Object term2992 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2993 = (long[]) newLongArray(1);
        setField(term2981, term2981.getClass(), "table", term2982);
        setIntField(term2981, term2981.getClass(), "count", -222412326);
        setIntField(term2981, term2981.getClass(), "threshold", 15);
        setFloatField(term2981, term2981.getClass(), "loadFactor", 0.75F);
        setField(term2980, term2980.getClass(), "posMap", term2981);
        setField(term2980, term2980.getClass(), "graph", null);
        setIntElement(term2986, 0, -299497261);
        setIntElement(term2986, 1, -23054366);
        setIntElement(term2986, 2, 153009426);
        setField(term2980, term2980.getClass(), "vertices", term2986);
        setIntField(term2980, term2980.getClass(), "numVertices", 185751892);
        setIntField(term2980, term2980.getClass(), "first", 1068256001);
        setField(term2992, term2992.getClass(), "words", term2993);
        setIntField(term2992, term2992.getClass(), "wordsInUse", 1139078354);
        setBooleanField(term2992, term2992.getClass(), "sizeIsSticky", false);
        setField(term2980, term2980.getClass(), "bitset", term2992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term2980, args);
    }

};


