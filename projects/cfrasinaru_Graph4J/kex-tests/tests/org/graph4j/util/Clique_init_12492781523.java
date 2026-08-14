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
     Object term7514;

    public Clique_init_12492781523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7514 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7515 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7516 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7520 = (int[]) newIntArray(6);
        Object term7529 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7530 = (long[]) newLongArray(1);
        setField(term7515, term7515.getClass(), "table", term7516);
        setIntField(term7515, term7515.getClass(), "count", -863483345);
        setIntField(term7515, term7515.getClass(), "threshold", 15);
        setFloatField(term7515, term7515.getClass(), "loadFactor", 0.75F);
        setField(term7514, term7514.getClass(), "posMap", term7515);
        setField(term7514, term7514.getClass(), "graph", null);
        setIntElement(term7520, 0, -1722702406);
        setIntElement(term7520, 1, 549278914);
        setIntElement(term7520, 2, -1490125498);
        setIntElement(term7520, 3, -1443119347);
        setIntElement(term7520, 4, 1962181481);
        setIntElement(term7520, 5, 1798831879);
        setField(term7514, term7514.getClass(), "vertices", term7520);
        setIntField(term7514, term7514.getClass(), "numVertices", 1393855580);
        setIntField(term7514, term7514.getClass(), "first", -849064032);
        setField(term7529, term7529.getClass(), "words", term7530);
        setIntField(term7529, term7529.getClass(), "wordsInUse", -184659375);
        setBooleanField(term7529, term7529.getClass(), "sizeIsSticky", false);
        setField(term7514, term7514.getClass(), "bitset", term7529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term7514;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


