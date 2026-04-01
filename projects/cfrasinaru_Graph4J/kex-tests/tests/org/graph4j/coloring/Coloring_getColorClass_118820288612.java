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

public class Coloring_getColorClass_118820288612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1755;
     Object term1779;

    public Coloring_getColorClass_118820288612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1766 = new HashMap();
        term1755 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1756 = (int[]) newIntArray(3);
        Object term1761 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1762 = (long[]) newLongArray(1);
        setField(term1755, term1755.getClass(), "graph", null);
        setIntElement(term1756, 0, 1365087144);
        setIntElement(term1756, 1, -1537255112);
        setIntElement(term1756, 2, 934477462);
        setField(term1755, term1755.getClass(), "vertexColor", term1756);
        setIntField(term1755, term1755.getClass(), "numColoredVertices", 4900410);
        setField(term1761, term1761.getClass(), "words", term1762);
        setIntField(term1761, term1761.getClass(), "wordsInUse", -1252345779);
        setBooleanField(term1761, term1761.getClass(), "sizeIsSticky", false);
        setField(term1755, term1755.getClass(), "usedColors", term1761);
        setField(term1755, term1755.getClass(), "colorMap", term1766);
        term1779 = new Integer(-128490829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1779;
        callMethod(klass, "getColorClass", argTypes, term1755, args);
    }

};


