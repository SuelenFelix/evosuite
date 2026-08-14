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

public class Coloring_getColors_16670889729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public Coloring_getColors_16670889729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1683 = new HashMap();
        term1671 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1672 = (int[]) newIntArray(4);
        Object term1678 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1679 = (long[]) newLongArray(1);
        setField(term1671, term1671.getClass(), "graph", null);
        setIntElement(term1672, 0, 947897214);
        setIntElement(term1672, 1, 1496340209);
        setIntElement(term1672, 2, -1748391876);
        setIntElement(term1672, 3, 43258317);
        setField(term1671, term1671.getClass(), "vertexColor", term1672);
        setIntField(term1671, term1671.getClass(), "numColoredVertices", 1707220033);
        setField(term1678, term1678.getClass(), "words", term1679);
        setIntField(term1678, term1678.getClass(), "wordsInUse", -1792504217);
        setBooleanField(term1678, term1678.getClass(), "sizeIsSticky", false);
        setField(term1671, term1671.getClass(), "usedColors", term1678);
        setField(term1671, term1671.getClass(), "colorMap", term1683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColors", argTypes, term1671, args);
    }

};


