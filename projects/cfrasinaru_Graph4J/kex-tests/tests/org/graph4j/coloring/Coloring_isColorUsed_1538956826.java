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

public class Coloring_isColorUsed_1538956826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1563;
     Object term1589;

    public Coloring_isColorUsed_1538956826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1576 = new HashMap();
        term1563 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1564 = (int[]) newIntArray(5);
        Object term1571 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1572 = (long[]) newLongArray(1);
        setField(term1563, term1563.getClass(), "graph", null);
        setIntElement(term1564, 0, 1116576792);
        setIntElement(term1564, 1, -942194446);
        setIntElement(term1564, 2, -938508470);
        setIntElement(term1564, 3, 1242676024);
        setIntElement(term1564, 4, -1865023308);
        setField(term1563, term1563.getClass(), "vertexColor", term1564);
        setIntField(term1563, term1563.getClass(), "numColoredVertices", 1698510819);
        setField(term1571, term1571.getClass(), "words", term1572);
        setIntField(term1571, term1571.getClass(), "wordsInUse", -1553893255);
        setBooleanField(term1571, term1571.getClass(), "sizeIsSticky", true);
        setField(term1563, term1563.getClass(), "usedColors", term1571);
        setField(term1563, term1563.getClass(), "colorMap", term1576);
        term1589 = new Integer(-1148142995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1589;
        callMethod(klass, "isColorUsed", argTypes, term1563, args);
    }

};


