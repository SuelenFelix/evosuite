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

public class VertexSet1_addAll_13723333878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71446;
     Object term71462;

    public VertexSet1_addAll_13723333878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71446 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71447 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71448 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71452 = (int[]) newIntArray(2);
        Object term71457 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71458 = (long[]) newLongArray(1);
        setField(term71447, term71447.getClass(), "table", term71448);
        setIntField(term71447, term71447.getClass(), "count", -1959301548);
        setIntField(term71447, term71447.getClass(), "threshold", 15);
        setFloatField(term71447, term71447.getClass(), "loadFactor", 0.75F);
        setField(term71446, term71446.getClass(), "posMap", term71447);
        setField(term71446, term71446.getClass(), "graph", null);
        setIntElement(term71452, 0, 987806484);
        setIntElement(term71452, 1, -1033174268);
        setField(term71446, term71446.getClass(), "vertices", term71452);
        setIntField(term71446, term71446.getClass(), "numVertices", -393658283);
        setIntField(term71446, term71446.getClass(), "first", 1751001510);
        setField(term71457, term71457.getClass(), "words", term71458);
        setIntField(term71457, term71457.getClass(), "wordsInUse", -1222375530);
        setBooleanField(term71457, term71457.getClass(), "sizeIsSticky", true);
        setField(term71446, term71446.getClass(), "bitset", term71457);
        term71462 = (int[]) newIntArray(4);
        setIntElement(term71462, 0, 673233183);
        setIntElement(term71462, 1, 147997544);
        setIntElement(term71462, 2, -2078032890);
        setIntElement(term71462, 3, -1228044113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71462;
        callMethod(klass, "addAll", argTypes, term71446, args);
    }

};


