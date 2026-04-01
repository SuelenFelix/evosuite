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

public class Coloring_getColorsUsedBy_63256659627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;
     Object term2292;

    public Coloring_getColorsUsedBy_63256659627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2279 = new HashMap();
        term2270 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2271 = (int[]) newIntArray(1);
        Object term2274 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2275 = (long[]) newLongArray(1);
        setField(term2270, term2270.getClass(), "graph", null);
        setIntElement(term2271, 0, -896473214);
        setField(term2270, term2270.getClass(), "vertexColor", term2271);
        setIntField(term2270, term2270.getClass(), "numColoredVertices", 401203924);
        setField(term2274, term2274.getClass(), "words", term2275);
        setIntField(term2274, term2274.getClass(), "wordsInUse", -1212399479);
        setBooleanField(term2274, term2274.getClass(), "sizeIsSticky", true);
        setField(term2270, term2270.getClass(), "usedColors", term2274);
        setField(term2270, term2270.getClass(), "colorMap", term2279);
        term2292 = (int[]) newIntArray(7);
        setIntElement(term2292, 0, -1397251956);
        setIntElement(term2292, 1, -796934571);
        setIntElement(term2292, 2, 405295896);
        setIntElement(term2292, 3, -814977075);
        setIntElement(term2292, 4, 808614267);
        setIntElement(term2292, 5, 1611734632);
        setIntElement(term2292, 6, 868908117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2292;
        callMethod(klass, "getColorsUsedBy", argTypes, term2270, args);
    }

};


