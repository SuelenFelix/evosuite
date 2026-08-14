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

public class VertexSet1_peek_164036036815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001;

    public VertexSet1_peek_164036036815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3001 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term3002 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3003 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3007 = (int[]) newIntArray(5);
        Object term3015 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3016 = (long[]) newLongArray(1);
        setField(term3002, term3002.getClass(), "table", term3003);
        setIntField(term3002, term3002.getClass(), "count", -691164974);
        setIntField(term3002, term3002.getClass(), "threshold", 15);
        setFloatField(term3002, term3002.getClass(), "loadFactor", 0.75F);
        setField(term3001, term3001.getClass(), "posMap", term3002);
        setField(term3001, term3001.getClass(), "graph", null);
        setIntElement(term3007, 0, -761675396);
        setIntElement(term3007, 1, -1954860951);
        setIntElement(term3007, 2, -2078879114);
        setIntElement(term3007, 3, -1186882318);
        setIntElement(term3007, 4, 1077647088);
        setField(term3001, term3001.getClass(), "vertices", term3007);
        setIntField(term3001, term3001.getClass(), "numVertices", -705176810);
        setIntField(term3001, term3001.getClass(), "first", -1584779593);
        setField(term3015, term3015.getClass(), "words", term3016);
        setIntField(term3015, term3015.getClass(), "wordsInUse", 303007547);
        setBooleanField(term3015, term3015.getClass(), "sizeIsSticky", true);
        setField(term3001, term3001.getClass(), "bitset", term3015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term3001, args);
    }

};


