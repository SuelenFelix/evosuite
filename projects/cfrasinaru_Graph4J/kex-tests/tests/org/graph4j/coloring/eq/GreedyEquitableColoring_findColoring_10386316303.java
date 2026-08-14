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
import java.lang.Integer;

public class GreedyEquitableColoring_findColoring_10386316303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term81;

    public GreedyEquitableColoring_findColoring_10386316303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term70 = new HashMap();
        term60 = newInstance(Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring"));
        Object term61 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term62 = (int[]) newIntArray(1);
        Object term65 = newInstance(Class.forName("java.util.BitSet"));
        long[] term66 = (long[]) newLongArray(1);
        setField(term61, term61.getClass(), "graph", null);
        setIntElement(term62, 0, -244121226);
        setField(term61, term61.getClass(), "vertexColor", term62);
        setIntField(term61, term61.getClass(), "numColoredVertices", -203030934);
        setField(term65, term65.getClass(), "words", term66);
        setIntField(term65, term65.getClass(), "wordsInUse", -1179120542);
        setBooleanField(term65, term65.getClass(), "sizeIsSticky", true);
        setField(term61, term61.getClass(), "usedColors", term65);
        setField(term61, term61.getClass(), "colorMap", term70);
        setField(term60, term60.getClass(), "initialColoring", term61);
        setIntField(term60, term60.getClass(), "numColors", -602026508);
        setField(term60, term60.getClass(), "graph", null);
        term81 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.GreedyEquitableColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "findColoring", argTypes, term60, args);
    }

};


