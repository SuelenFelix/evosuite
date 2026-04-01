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

public class Coloring_init_852459091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469;

    public Coloring_init_852459091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1483 = new HashMap();
        term1469 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1470 = (int[]) newIntArray(6);
        Object term1478 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1479 = (long[]) newLongArray(1);
        setField(term1469, term1469.getClass(), "graph", null);
        setIntElement(term1470, 0, 2007134147);
        setIntElement(term1470, 1, 993388358);
        setIntElement(term1470, 2, -765191335);
        setIntElement(term1470, 3, -1697741155);
        setIntElement(term1470, 4, 1295839803);
        setIntElement(term1470, 5, -1891015523);
        setField(term1469, term1469.getClass(), "vertexColor", term1470);
        setIntField(term1469, term1469.getClass(), "numColoredVertices", -1560631747);
        setField(term1478, term1478.getClass(), "words", term1479);
        setIntField(term1478, term1478.getClass(), "wordsInUse", 1215150180);
        setBooleanField(term1478, term1478.getClass(), "sizeIsSticky", true);
        setField(term1469, term1469.getClass(), "usedColors", term1478);
        setField(term1469, term1469.getClass(), "colorMap", term1483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1469;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


