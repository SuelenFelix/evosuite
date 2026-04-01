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

public class Clique_init_12492781523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141502;

    public Clique_init_12492781523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141502 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term141503 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141504 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141508 = (int[]) newIntArray(2);
        Object term141513 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141514 = (long[]) newLongArray(1);
        setField(term141503, term141503.getClass(), "table", term141504);
        setIntField(term141503, term141503.getClass(), "count", 607926043);
        setIntField(term141503, term141503.getClass(), "threshold", 15);
        setFloatField(term141503, term141503.getClass(), "loadFactor", 0.75F);
        setField(term141502, term141502.getClass(), "posMap", term141503);
        setField(term141502, term141502.getClass(), "graph", null);
        setIntElement(term141508, 0, 206027425);
        setIntElement(term141508, 1, -459471927);
        setField(term141502, term141502.getClass(), "vertices", term141508);
        setIntField(term141502, term141502.getClass(), "numVertices", 1046077624);
        setIntField(term141502, term141502.getClass(), "first", -2054453219);
        setField(term141513, term141513.getClass(), "words", term141514);
        setIntField(term141513, term141513.getClass(), "wordsInUse", 1424375130);
        setBooleanField(term141513, term141513.getClass(), "sizeIsSticky", false);
        setField(term141502, term141502.getClass(), "bitset", term141513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term141502;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


