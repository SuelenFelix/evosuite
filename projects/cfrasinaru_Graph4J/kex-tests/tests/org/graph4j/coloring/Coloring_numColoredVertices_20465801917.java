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

public class Coloring_numColoredVertices_20465801917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;
     Object term1946;

    public Coloring_numColoredVertices_20465801917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1933 = new HashMap();
        term1919 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1920 = (int[]) newIntArray(6);
        Object term1928 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1929 = (long[]) newLongArray(1);
        setField(term1919, term1919.getClass(), "graph", null);
        setIntElement(term1920, 0, -687282231);
        setIntElement(term1920, 1, 1200440315);
        setIntElement(term1920, 2, 40571662);
        setIntElement(term1920, 3, 1863910269);
        setIntElement(term1920, 4, 864645689);
        setIntElement(term1920, 5, 279384872);
        setField(term1919, term1919.getClass(), "vertexColor", term1920);
        setIntField(term1919, term1919.getClass(), "numColoredVertices", 1427305953);
        setField(term1928, term1928.getClass(), "words", term1929);
        setIntField(term1928, term1928.getClass(), "wordsInUse", -781832877);
        setBooleanField(term1928, term1928.getClass(), "sizeIsSticky", false);
        setField(term1919, term1919.getClass(), "usedColors", term1928);
        setField(term1919, term1919.getClass(), "colorMap", term1933);
        term1946 = new Integer(1048451946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1946;
        callMethod(klass, "numColoredVertices", argTypes, term1919, args);
    }

};


