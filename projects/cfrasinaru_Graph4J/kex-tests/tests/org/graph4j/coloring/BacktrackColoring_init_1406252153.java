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
import java.lang.Long;

public class BacktrackColoring_init_1406252153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5447;
     Object term5472;

    public BacktrackColoring_init_1406252153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5459 = new HashMap();
        term5447 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term5448 = (int[]) newIntArray(4);
        Object term5454 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5455 = (long[]) newLongArray(1);
        setField(term5447, term5447.getClass(), "graph", null);
        setIntElement(term5448, 0, 1841765799);
        setIntElement(term5448, 1, 72160200);
        setIntElement(term5448, 2, -1870567623);
        setIntElement(term5448, 3, -1442923471);
        setField(term5447, term5447.getClass(), "vertexColor", term5448);
        setIntField(term5447, term5447.getClass(), "numColoredVertices", -434247549);
        setField(term5454, term5454.getClass(), "words", term5455);
        setIntField(term5454, term5454.getClass(), "wordsInUse", 1246505552);
        setBooleanField(term5454, term5454.getClass(), "sizeIsSticky", false);
        setField(term5447, term5447.getClass(), "usedColors", term5454);
        setField(term5447, term5447.getClass(), "colorMap", term5459);
        term5472 = new Long(-8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoring");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5447;
        args[2] = term5472;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


