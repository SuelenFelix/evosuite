package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class BacktrackBandwithColoring_init_12731250622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public BacktrackBandwithColoring_init_12731250622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46 = new HashMap();
        term35 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term36 = (int[]) newIntArray(3);
        Object term41 = newInstance(Class.forName("java.util.BitSet"));
        long[] term42 = (long[]) newLongArray(1);
        setField(term35, term35.getClass(), "graph", null);
        setIntElement(term36, 0, 597278769);
        setIntElement(term36, 1, -1685132342);
        setIntElement(term36, 2, -1456670397);
        setField(term35, term35.getClass(), "vertexColor", term36);
        setIntField(term35, term35.getClass(), "numColoredVertices", 1622346318);
        setField(term41, term41.getClass(), "words", term42);
        setIntField(term41, term41.getClass(), "wordsInUse", 1048535127);
        setBooleanField(term41, term41.getClass(), "sizeIsSticky", false);
        setField(term35, term35.getClass(), "usedColors", term41);
        setField(term35, term35.getClass(), "colorMap", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.BacktrackBandwithColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


