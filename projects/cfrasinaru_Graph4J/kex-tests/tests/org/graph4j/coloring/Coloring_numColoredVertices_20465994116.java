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

public class Coloring_numColoredVertices_20465994116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public Coloring_numColoredVertices_20465994116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1904 = new HashMap();
        term1895 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1896 = (int[]) newIntArray(1);
        Object term1899 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1900 = (long[]) newLongArray(1);
        setField(term1895, term1895.getClass(), "graph", null);
        setIntElement(term1896, 0, 550892835);
        setField(term1895, term1895.getClass(), "vertexColor", term1896);
        setIntField(term1895, term1895.getClass(), "numColoredVertices", 1237549886);
        setField(term1899, term1899.getClass(), "words", term1900);
        setIntField(term1899, term1899.getClass(), "wordsInUse", -1945635750);
        setBooleanField(term1899, term1899.getClass(), "sizeIsSticky", false);
        setField(term1895, term1895.getClass(), "usedColors", term1899);
        setField(term1895, term1895.getClass(), "colorMap", term1904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numColoredVertices", argTypes, term1895, args);
    }

};


