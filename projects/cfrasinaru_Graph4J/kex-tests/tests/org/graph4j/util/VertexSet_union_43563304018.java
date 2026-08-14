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

public class VertexSet_union_43563304018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8372;
     Object term8386;

    public VertexSet_union_43563304018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8372 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8373 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8374 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8378 = (int[]) newIntArray(0);
        Object term8381 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8382 = (long[]) newLongArray(1);
        setField(term8373, term8373.getClass(), "table", term8374);
        setIntField(term8373, term8373.getClass(), "count", 1155135931);
        setIntField(term8373, term8373.getClass(), "threshold", 15);
        setFloatField(term8373, term8373.getClass(), "loadFactor", 0.75F);
        setField(term8372, term8372.getClass(), "posMap", term8373);
        setField(term8372, term8372.getClass(), "graph", null);
        setField(term8372, term8372.getClass(), "vertices", term8378);
        setIntField(term8372, term8372.getClass(), "numVertices", -636910567);
        setIntField(term8372, term8372.getClass(), "first", 1896114203);
        setField(term8381, term8381.getClass(), "words", term8382);
        setIntField(term8381, term8381.getClass(), "wordsInUse", 1045745470);
        setBooleanField(term8381, term8381.getClass(), "sizeIsSticky", false);
        setField(term8372, term8372.getClass(), "bitset", term8381);
        term8386 = (int[]) newIntArray(5);
        setIntElement(term8386, 0, 892741901);
        setIntElement(term8386, 1, -1724900201);
        setIntElement(term8386, 2, -758523003);
        setIntElement(term8386, 3, 1567184195);
        setIntElement(term8386, 4, 63595623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8386;
        callMethod(klass, "union", argTypes, term8372, args);
    }

};


