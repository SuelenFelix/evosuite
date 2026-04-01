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

public class Coloring_getVertexClass_45241214113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1785;
     Object term1815;

    public Coloring_getVertexClass_45241214113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1802 = new HashMap();
        term1785 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1786 = (int[]) newIntArray(9);
        Object term1797 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1798 = (long[]) newLongArray(1);
        setField(term1785, term1785.getClass(), "graph", null);
        setIntElement(term1786, 0, 202214133);
        setIntElement(term1786, 1, 1543091617);
        setIntElement(term1786, 2, -763166094);
        setIntElement(term1786, 3, -222941705);
        setIntElement(term1786, 4, 291864719);
        setIntElement(term1786, 5, -1549607466);
        setIntElement(term1786, 6, 853609788);
        setIntElement(term1786, 7, -197820800);
        setIntElement(term1786, 8, 723812297);
        setField(term1785, term1785.getClass(), "vertexColor", term1786);
        setIntField(term1785, term1785.getClass(), "numColoredVertices", 1639448749);
        setField(term1797, term1797.getClass(), "words", term1798);
        setIntField(term1797, term1797.getClass(), "wordsInUse", 873659088);
        setBooleanField(term1797, term1797.getClass(), "sizeIsSticky", false);
        setField(term1785, term1785.getClass(), "usedColors", term1797);
        setField(term1785, term1785.getClass(), "colorMap", term1802);
        term1815 = new Integer(-1097563716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1815;
        callMethod(klass, "getVertexClass", argTypes, term1785, args);
    }

};


