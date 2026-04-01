package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Coloring_isColorSet_6275333595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;
     Object term1560;

    public Coloring_isColorSet_6275333595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1547 = new HashMap();
        term1539 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1540 = (int[]) newIntArray(0);
        Object term1542 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1543 = (long[]) newLongArray(1);
        setField(term1539, term1539.getClass(), "graph", null);
        setField(term1539, term1539.getClass(), "vertexColor", term1540);
        setIntField(term1539, term1539.getClass(), "numColoredVertices", 1094107751);
        setField(term1542, term1542.getClass(), "words", term1543);
        setIntField(term1542, term1542.getClass(), "wordsInUse", 844222656);
        setBooleanField(term1542, term1542.getClass(), "sizeIsSticky", true);
        setField(term1539, term1539.getClass(), "usedColors", term1542);
        setField(term1539, term1539.getClass(), "colorMap", term1547);
        term1560 = new Integer(-1667482829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1560;
        callMethod(klass, "isColorSet", argTypes, term1539, args);
    }

};


