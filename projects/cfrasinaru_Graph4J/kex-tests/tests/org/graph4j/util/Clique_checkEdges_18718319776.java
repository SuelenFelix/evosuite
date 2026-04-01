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

public class Clique_checkEdges_18718319776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141584;

    public Clique_checkEdges_18718319776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141584 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term141585 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141586 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141590 = (int[]) newIntArray(0);
        Object term141593 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141594 = (long[]) newLongArray(1);
        setField(term141585, term141585.getClass(), "table", term141586);
        setIntField(term141585, term141585.getClass(), "count", 1230595174);
        setIntField(term141585, term141585.getClass(), "threshold", 15);
        setFloatField(term141585, term141585.getClass(), "loadFactor", 0.75F);
        setField(term141584, term141584.getClass(), "posMap", term141585);
        setField(term141584, term141584.getClass(), "graph", null);
        setField(term141584, term141584.getClass(), "vertices", term141590);
        setIntField(term141584, term141584.getClass(), "numVertices", 941555370);
        setIntField(term141584, term141584.getClass(), "first", -323535726);
        setField(term141593, term141593.getClass(), "words", term141594);
        setIntField(term141593, term141593.getClass(), "wordsInUse", -1576331582);
        setBooleanField(term141593, term141593.getClass(), "sizeIsSticky", true);
        setField(term141584, term141584.getClass(), "bitset", term141593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term141584, args);
    }

};


