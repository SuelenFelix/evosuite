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

public class Coloring_getGraph_14946199464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513;

    public Coloring_getGraph_14946199464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1523 = new HashMap();
        term1513 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1514 = (int[]) newIntArray(2);
        Object term1518 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1519 = (long[]) newLongArray(1);
        setField(term1513, term1513.getClass(), "graph", null);
        setIntElement(term1514, 0, -1529797673);
        setIntElement(term1514, 1, -868676396);
        setField(term1513, term1513.getClass(), "vertexColor", term1514);
        setIntField(term1513, term1513.getClass(), "numColoredVertices", 1922684808);
        setField(term1518, term1518.getClass(), "words", term1519);
        setIntField(term1518, term1518.getClass(), "wordsInUse", -2005784375);
        setBooleanField(term1518, term1518.getClass(), "sizeIsSticky", false);
        setField(term1513, term1513.getClass(), "usedColors", term1518);
        setField(term1513, term1513.getClass(), "colorMap", term1523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGraph", argTypes, term1513, args);
    }

};


