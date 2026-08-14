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

public class GreedyEquitableColoring_init_9089924481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GreedyEquitableColoring_init_9089924481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14 = new HashMap();
        term1 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2 = (int[]) newIntArray(5);
        Object term9 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10 = (long[]) newLongArray(1);
        setField(term1, term1.getClass(), "graph", null);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        setField(term1, term1.getClass(), "vertexColor", term2);
        setIntField(term1, term1.getClass(), "numColoredVertices", -616727354);
        setField(term9, term9.getClass(), "words", term10);
        setIntField(term9, term9.getClass(), "wordsInUse", -1955890973);
        setBooleanField(term9, term9.getClass(), "sizeIsSticky", false);
        setField(term1, term1.getClass(), "usedColors", term9);
        setField(term1, term1.getClass(), "colorMap", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


