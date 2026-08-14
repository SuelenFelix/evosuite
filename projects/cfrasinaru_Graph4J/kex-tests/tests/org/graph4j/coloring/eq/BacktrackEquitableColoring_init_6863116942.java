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

public class BacktrackEquitableColoring_init_6863116942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;

    public BacktrackEquitableColoring_init_6863116942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term135 = new HashMap();
        term120 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term121 = (int[]) newIntArray(7);
        Object term130 = newInstance(Class.forName("java.util.BitSet"));
        long[] term131 = (long[]) newLongArray(1);
        setField(term120, term120.getClass(), "graph", null);
        setIntElement(term121, 0, 1328271830);
        setIntElement(term121, 1, 1596070772);
        setIntElement(term121, 2, 97029295);
        setIntElement(term121, 3, -1371869594);
        setIntElement(term121, 4, -2095575670);
        setIntElement(term121, 5, 1225272962);
        setIntElement(term121, 6, 1324040357);
        setField(term120, term120.getClass(), "vertexColor", term121);
        setIntField(term120, term120.getClass(), "numColoredVertices", -1588772968);
        setField(term130, term130.getClass(), "words", term131);
        setIntField(term130, term130.getClass(), "wordsInUse", -93135961);
        setBooleanField(term130, term130.getClass(), "sizeIsSticky", false);
        setField(term120, term120.getClass(), "usedColors", term130);
        setField(term120, term120.getClass(), "colorMap", term135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.eq.BacktrackEquitableColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.coloring.Coloring");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term120;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


