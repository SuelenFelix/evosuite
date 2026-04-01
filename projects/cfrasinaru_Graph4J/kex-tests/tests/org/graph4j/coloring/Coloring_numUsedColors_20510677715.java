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

public class Coloring_numUsedColors_20510677715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1861;

    public Coloring_numUsedColors_20510677715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1875 = new HashMap();
        term1861 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1862 = (int[]) newIntArray(6);
        Object term1870 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1871 = (long[]) newLongArray(1);
        setField(term1861, term1861.getClass(), "graph", null);
        setIntElement(term1862, 0, 990883365);
        setIntElement(term1862, 1, 633598642);
        setIntElement(term1862, 2, 1862841859);
        setIntElement(term1862, 3, -1114668574);
        setIntElement(term1862, 4, 514511037);
        setIntElement(term1862, 5, 1713573821);
        setField(term1861, term1861.getClass(), "vertexColor", term1862);
        setIntField(term1861, term1861.getClass(), "numColoredVertices", 1956590498);
        setField(term1870, term1870.getClass(), "words", term1871);
        setIntField(term1870, term1870.getClass(), "wordsInUse", 1467356494);
        setBooleanField(term1870, term1870.getClass(), "sizeIsSticky", true);
        setField(term1861, term1861.getClass(), "usedColors", term1870);
        setField(term1861, term1861.getClass(), "colorMap", term1875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numUsedColors", argTypes, term1861, args);
    }

};


