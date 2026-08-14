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

public class GreedyEquitableColoring_findColoring_10386297082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public GreedyEquitableColoring_findColoring_10386297082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45 = new HashMap();
        term33 = newInstance(Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring"));
        Object term34 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term35 = (int[]) newIntArray(3);
        Object term40 = newInstance(Class.forName("java.util.BitSet"));
        long[] term41 = (long[]) newLongArray(1);
        setField(term34, term34.getClass(), "graph", null);
        setIntElement(term35, 0, 597278769);
        setIntElement(term35, 1, -1685132342);
        setIntElement(term35, 2, -1456670397);
        setField(term34, term34.getClass(), "vertexColor", term35);
        setIntField(term34, term34.getClass(), "numColoredVertices", 1622346318);
        setField(term40, term40.getClass(), "words", term41);
        setIntField(term40, term40.getClass(), "wordsInUse", 1048535127);
        setBooleanField(term40, term40.getClass(), "sizeIsSticky", false);
        setField(term34, term34.getClass(), "usedColors", term40);
        setField(term34, term34.getClass(), "colorMap", term45);
        setField(term33, term33.getClass(), "initialColoring", term34);
        setIntField(term33, term33.getClass(), "numColors", -1275173084);
        setField(term33, term33.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findColoring", argTypes, term33, args);
    }

};


