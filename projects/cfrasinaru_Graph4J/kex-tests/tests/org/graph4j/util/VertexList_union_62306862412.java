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

public class VertexList_union_62306862412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2562;
     Object term2574;

    public VertexList_union_62306862412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2562 = newInstance(Class.forName("org.graph4j.util.VertexList"));
        int[] term2563 = (int[]) newIntArray(3);
        Object term2569 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2570 = (long[]) newLongArray(1);
        setField(term2562, term2562.getClass(), "graph", null);
        setIntElement(term2563, 0, -1489991025);
        setIntElement(term2563, 1, -1542979444);
        setIntElement(term2563, 2, -1130401612);
        setField(term2562, term2562.getClass(), "vertices", term2563);
        setIntField(term2562, term2562.getClass(), "numVertices", -316771104);
        setIntField(term2562, term2562.getClass(), "first", -1374527319);
        setField(term2569, term2569.getClass(), "words", term2570);
        setIntField(term2569, term2569.getClass(), "wordsInUse", -1735276919);
        setBooleanField(term2569, term2569.getClass(), "sizeIsSticky", true);
        setField(term2562, term2562.getClass(), "bitset", term2569);
        term2574 = (int[]) newIntArray(2);
        setIntElement(term2574, 0, -712023865);
        setIntElement(term2574, 1, 613256157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2574;
        callMethod(klass, "union", argTypes, term2562, args);
    }

};


