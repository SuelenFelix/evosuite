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

public class EquitableColoringAlgorithm_isValid_15841627350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public EquitableColoringAlgorithm_isValid_15841627350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term884 = new HashMap();
        term868 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term869 = (int[]) newIntArray(8);
        Object term879 = newInstance(Class.forName("java.util.BitSet"));
        long[] term880 = (long[]) newLongArray(1);
        setField(term868, term868.getClass(), "graph", null);
        setIntElement(term869, 0, -1022990421);
        setIntElement(term869, 1, 1045547089);
        setIntElement(term869, 2, -1122880881);
        setIntElement(term869, 3, -542712742);
        setIntElement(term869, 4, -1254072822);
        setIntElement(term869, 5, -1111249833);
        setIntElement(term869, 6, -1692331299);
        setIntElement(term869, 7, 479531250);
        setField(term868, term868.getClass(), "vertexColor", term869);
        setIntField(term868, term868.getClass(), "numColoredVertices", 1320570890);
        setField(term879, term879.getClass(), "words", term880);
        setIntField(term879, term879.getClass(), "wordsInUse", -130649791);
        setBooleanField(term879, term879.getClass(), "sizeIsSticky", false);
        setField(term868, term868.getClass(), "usedColors", term879);
        setField(term868, term868.getClass(), "colorMap", term884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.EquitableColoringAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[1];
        args[0] = term868;
        callMethod(klass, "isValid", argTypes, null, args);
    }

};


