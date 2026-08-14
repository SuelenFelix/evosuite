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
import java.lang.Integer;

public class BacktrackColoringBase_prepareRootColoring_10453077381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;
     Object term1104;

    public BacktrackColoringBase_prepareRootColoring_10453077381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1091 = new HashMap();
        term1082 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1083 = (int[]) newIntArray(1);
        Object term1086 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1087 = (long[]) newLongArray(1);
        setField(term1082, term1082.getClass(), "graph", null);
        setIntElement(term1083, 0, 479531250);
        setField(term1082, term1082.getClass(), "vertexColor", term1083);
        setIntField(term1082, term1082.getClass(), "numColoredVertices", 1320570890);
        setField(term1086, term1086.getClass(), "words", term1087);
        setIntField(term1086, term1086.getClass(), "wordsInUse", -130649791);
        setBooleanField(term1086, term1086.getClass(), "sizeIsSticky", true);
        setField(term1082, term1082.getClass(), "usedColors", term1086);
        setField(term1082, term1082.getClass(), "colorMap", term1091);
        term1104 = new Integer(252575029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.coloring.Coloring");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1082;
        args[1] = term1104;
        callMethod(klass, "prepareRootColoring", argTypes, null, args);
    }

};


