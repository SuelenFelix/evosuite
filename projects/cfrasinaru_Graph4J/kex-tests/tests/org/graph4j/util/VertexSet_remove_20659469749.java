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

public class VertexSet_remove_20659469749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150174;
     Object term150197;

    public VertexSet_remove_20659469749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150174 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150175 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150176 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150180 = (int[]) newIntArray(9);
        Object term150192 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150193 = (long[]) newLongArray(1);
        setField(term150175, term150175.getClass(), "table", term150176);
        setIntField(term150175, term150175.getClass(), "count", 1815764426);
        setIntField(term150175, term150175.getClass(), "threshold", 15);
        setFloatField(term150175, term150175.getClass(), "loadFactor", 0.75F);
        setField(term150174, term150174.getClass(), "posMap", term150175);
        setField(term150174, term150174.getClass(), "graph", null);
        setIntElement(term150180, 0, 1200866331);
        setIntElement(term150180, 1, -1657170047);
        setIntElement(term150180, 2, -1434612412);
        setIntElement(term150180, 3, -1277744672);
        setIntElement(term150180, 4, 679333756);
        setIntElement(term150180, 5, 670111594);
        setIntElement(term150180, 6, 559332132);
        setIntElement(term150180, 7, -645078460);
        setIntElement(term150180, 8, -679829024);
        setField(term150174, term150174.getClass(), "vertices", term150180);
        setIntField(term150174, term150174.getClass(), "numVertices", -1808442029);
        setIntField(term150174, term150174.getClass(), "first", -431120939);
        setField(term150192, term150192.getClass(), "words", term150193);
        setIntField(term150192, term150192.getClass(), "wordsInUse", 1415341460);
        setBooleanField(term150192, term150192.getClass(), "sizeIsSticky", true);
        setField(term150174, term150174.getClass(), "bitset", term150192);
        term150197 = new Integer(1353155216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150197;
        callMethod(klass, "remove", argTypes, term150174, args);
    }

};


