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

public class VertexSet_contains_157093984713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8227;
     Object term8241;

    public VertexSet_contains_157093984713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8227 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8228 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8229 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8233 = (int[]) newIntArray(0);
        Object term8236 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8237 = (long[]) newLongArray(1);
        setField(term8228, term8228.getClass(), "table", term8229);
        setIntField(term8228, term8228.getClass(), "count", 734222768);
        setIntField(term8228, term8228.getClass(), "threshold", 15);
        setFloatField(term8228, term8228.getClass(), "loadFactor", 0.75F);
        setField(term8227, term8227.getClass(), "posMap", term8228);
        setField(term8227, term8227.getClass(), "graph", null);
        setField(term8227, term8227.getClass(), "vertices", term8233);
        setIntField(term8227, term8227.getClass(), "numVertices", 1545425140);
        setIntField(term8227, term8227.getClass(), "first", -1580765555);
        setField(term8236, term8236.getClass(), "words", term8237);
        setIntField(term8236, term8236.getClass(), "wordsInUse", -1295149055);
        setBooleanField(term8236, term8236.getClass(), "sizeIsSticky", true);
        setField(term8227, term8227.getClass(), "bitset", term8236);
        term8241 = new Integer(-769814321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8241;
        callMethod(klass, "contains", argTypes, term8227, args);
    }

};


