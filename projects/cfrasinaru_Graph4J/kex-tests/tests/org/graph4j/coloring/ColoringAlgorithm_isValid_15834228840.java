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

public class ColoringAlgorithm_isValid_15834228840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;

    public ColoringAlgorithm_isValid_15834228840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133 = new HashMap();
        term118 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term119 = (int[]) newIntArray(7);
        Object term128 = newInstance(Class.forName("java.util.BitSet"));
        long[] term129 = (long[]) newLongArray(1);
        setField(term118, term118.getClass(), "graph", null);
        setIntElement(term119, 0, 1328271830);
        setIntElement(term119, 1, 1596070772);
        setIntElement(term119, 2, 97029295);
        setIntElement(term119, 3, -1371869594);
        setIntElement(term119, 4, -2095575670);
        setIntElement(term119, 5, 1225272962);
        setIntElement(term119, 6, 1324040357);
        setField(term118, term118.getClass(), "vertexColor", term119);
        setIntField(term118, term118.getClass(), "numColoredVertices", -1588772968);
        setField(term128, term128.getClass(), "words", term129);
        setIntField(term128, term128.getClass(), "wordsInUse", -93135961);
        setBooleanField(term128, term128.getClass(), "sizeIsSticky", false);
        setField(term118, term118.getClass(), "usedColors", term128);
        setField(term118, term118.getClass(), "colorMap", term133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.ColoringAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[1];
        args[0] = term118;
        callMethod(klass, "isValid", argTypes, null, args);
    }

};


