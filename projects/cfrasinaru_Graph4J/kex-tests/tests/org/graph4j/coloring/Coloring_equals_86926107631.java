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

public class Coloring_equals_86926107631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;
     Object term2414;

    public Coloring_equals_86926107631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2401 = new HashMap();
        term2391 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2392 = (int[]) newIntArray(2);
        Object term2396 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2397 = (long[]) newLongArray(1);
        setField(term2391, term2391.getClass(), "graph", null);
        setIntElement(term2392, 0, -2023791789);
        setIntElement(term2392, 1, 353974456);
        setField(term2391, term2391.getClass(), "vertexColor", term2392);
        setIntField(term2391, term2391.getClass(), "numColoredVertices", -485108462);
        setField(term2396, term2396.getClass(), "words", term2397);
        setIntField(term2396, term2396.getClass(), "wordsInUse", 1418551216);
        setBooleanField(term2396, term2396.getClass(), "sizeIsSticky", true);
        setField(term2391, term2391.getClass(), "usedColors", term2396);
        setField(term2391, term2391.getClass(), "colorMap", term2401);
        term2414 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2414;
        callMethod(klass, "equals", argTypes, term2391, args);
    }

};


