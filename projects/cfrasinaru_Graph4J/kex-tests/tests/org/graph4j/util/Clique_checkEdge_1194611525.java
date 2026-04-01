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

public class Clique_checkEdge_1194611525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141561;
     Object term141577;
     Object term141579;

    public Clique_checkEdge_1194611525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141561 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term141562 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141563 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141567 = (int[]) newIntArray(2);
        Object term141572 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141573 = (long[]) newLongArray(1);
        setField(term141562, term141562.getClass(), "table", term141563);
        setIntField(term141562, term141562.getClass(), "count", 1068311383);
        setIntField(term141562, term141562.getClass(), "threshold", 15);
        setFloatField(term141562, term141562.getClass(), "loadFactor", 0.75F);
        setField(term141561, term141561.getClass(), "posMap", term141562);
        setField(term141561, term141561.getClass(), "graph", null);
        setIntElement(term141567, 0, 411636515);
        setIntElement(term141567, 1, -606302219);
        setField(term141561, term141561.getClass(), "vertices", term141567);
        setIntField(term141561, term141561.getClass(), "numVertices", 1571772499);
        setIntField(term141561, term141561.getClass(), "first", 58748297);
        setField(term141572, term141572.getClass(), "words", term141573);
        setIntField(term141572, term141572.getClass(), "wordsInUse", -2026652455);
        setBooleanField(term141572, term141572.getClass(), "sizeIsSticky", false);
        setField(term141561, term141561.getClass(), "bitset", term141572);
        term141577 = new Integer(1377742875);
        term141579 = new Integer(440743051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term141577;
        args[1] = term141579;
        callMethod(klass, "checkEdge", argTypes, term141561, args);
    }

};


