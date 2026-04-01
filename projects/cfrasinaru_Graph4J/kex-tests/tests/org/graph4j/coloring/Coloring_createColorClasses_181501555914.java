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

public class Coloring_createColorClasses_181501555914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;

    public Coloring_createColorClasses_181501555914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1841 = new HashMap();
        term1827 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1828 = (int[]) newIntArray(6);
        Object term1836 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1837 = (long[]) newLongArray(1);
        setField(term1827, term1827.getClass(), "graph", null);
        setIntElement(term1828, 0, 1572907769);
        setIntElement(term1828, 1, 1608016787);
        setIntElement(term1828, 2, -516303035);
        setIntElement(term1828, 3, -2143043890);
        setIntElement(term1828, 4, -2138825831);
        setIntElement(term1828, 5, 1454781562);
        setField(term1827, term1827.getClass(), "vertexColor", term1828);
        setIntField(term1827, term1827.getClass(), "numColoredVertices", -27944011);
        setField(term1836, term1836.getClass(), "words", term1837);
        setIntField(term1836, term1836.getClass(), "wordsInUse", -20614472);
        setBooleanField(term1836, term1836.getClass(), "sizeIsSticky", false);
        setField(term1827, term1827.getClass(), "usedColors", term1836);
        setField(term1827, term1827.getClass(), "colorMap", term1841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createColorClasses", argTypes, term1827, args);
    }

};


