package org.graph4j.coloring.eq;

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
import static org.graph4j.coloring.eq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;

public class BacktrackEquitableColoring_init_13543210343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term183;

    public BacktrackEquitableColoring_init_13543210343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term170 = new HashMap();
        term156 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term157 = (int[]) newIntArray(6);
        Object term165 = newInstance(Class.forName("java.util.BitSet"));
        long[] term166 = (long[]) newLongArray(1);
        setField(term156, term156.getClass(), "graph", null);
        setIntElement(term157, 0, 1265463001);
        setIntElement(term157, 1, 335112684);
        setIntElement(term157, 2, 1551099402);
        setIntElement(term157, 3, -2027534003);
        setIntElement(term157, 4, 1063420942);
        setIntElement(term157, 5, 1375330971);
        setField(term156, term156.getClass(), "vertexColor", term157);
        setIntField(term156, term156.getClass(), "numColoredVertices", -478195677);
        setField(term165, term165.getClass(), "words", term166);
        setIntField(term165, term165.getClass(), "wordsInUse", 972867650);
        setBooleanField(term165, term165.getClass(), "sizeIsSticky", false);
        setField(term156, term156.getClass(), "usedColors", term165);
        setField(term156, term156.getClass(), "colorMap", term170);
        term183 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term156;
        args[2] = term183;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


