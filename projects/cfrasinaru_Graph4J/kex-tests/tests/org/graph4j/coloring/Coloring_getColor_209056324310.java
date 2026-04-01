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

public class Coloring_getColor_209056324310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1701;
     Object term1725;

    public Coloring_getColor_209056324310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1712 = new HashMap();
        term1701 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1702 = (int[]) newIntArray(3);
        Object term1707 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1708 = (long[]) newLongArray(1);
        setField(term1701, term1701.getClass(), "graph", null);
        setIntElement(term1702, 0, -1577069773);
        setIntElement(term1702, 1, -266625190);
        setIntElement(term1702, 2, 489201218);
        setField(term1701, term1701.getClass(), "vertexColor", term1702);
        setIntField(term1701, term1701.getClass(), "numColoredVertices", 464181937);
        setField(term1707, term1707.getClass(), "words", term1708);
        setIntField(term1707, term1707.getClass(), "wordsInUse", -1455526612);
        setBooleanField(term1707, term1707.getClass(), "sizeIsSticky", false);
        setField(term1701, term1701.getClass(), "usedColors", term1707);
        setField(term1701, term1701.getClass(), "colorMap", term1712);
        term1725 = new Integer(1168633950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1725;
        callMethod(klass, "getColor", argTypes, term1701, args);
    }

};


