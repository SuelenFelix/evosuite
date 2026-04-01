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

public class Coloring_getColoredVertices_125725803024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2153;

    public Coloring_getColoredVertices_125725803024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2162 = new HashMap();
        term2153 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2154 = (int[]) newIntArray(1);
        Object term2157 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2158 = (long[]) newLongArray(1);
        setField(term2153, term2153.getClass(), "graph", null);
        setIntElement(term2154, 0, -314165467);
        setField(term2153, term2153.getClass(), "vertexColor", term2154);
        setIntField(term2153, term2153.getClass(), "numColoredVertices", 963694071);
        setField(term2157, term2157.getClass(), "words", term2158);
        setIntField(term2157, term2157.getClass(), "wordsInUse", -995785731);
        setBooleanField(term2157, term2157.getClass(), "sizeIsSticky", false);
        setField(term2153, term2153.getClass(), "usedColors", term2157);
        setField(term2153, term2153.getClass(), "colorMap", term2162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColoredVertices", argTypes, term2153, args);
    }

};


