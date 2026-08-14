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

public class Coloring_checkColorUsed_796307527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597;
     Object term1621;

    public Coloring_checkColorUsed_796307527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1608 = new HashMap();
        term1597 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1598 = (int[]) newIntArray(3);
        Object term1603 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1604 = (long[]) newLongArray(1);
        setField(term1597, term1597.getClass(), "graph", null);
        setIntElement(term1598, 0, -233024044);
        setIntElement(term1598, 1, 1820784228);
        setIntElement(term1598, 2, 1390820006);
        setField(term1597, term1597.getClass(), "vertexColor", term1598);
        setIntField(term1597, term1597.getClass(), "numColoredVertices", -828982065);
        setField(term1603, term1603.getClass(), "words", term1604);
        setIntField(term1603, term1603.getClass(), "wordsInUse", 1221443226);
        setBooleanField(term1603, term1603.getClass(), "sizeIsSticky", false);
        setField(term1597, term1597.getClass(), "usedColors", term1603);
        setField(term1597, term1597.getClass(), "colorMap", term1608);
        term1621 = new Integer(301401782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1621;
        callMethod(klass, "checkColorUsed", argTypes, term1597, args);
    }

};


