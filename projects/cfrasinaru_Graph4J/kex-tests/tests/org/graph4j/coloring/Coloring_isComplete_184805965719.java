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

public class Coloring_isComplete_184805965719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;

    public Coloring_isComplete_184805965719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2010 = new HashMap();
        term1995 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1996 = (int[]) newIntArray(7);
        Object term2005 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2006 = (long[]) newLongArray(1);
        setField(term1995, term1995.getClass(), "graph", null);
        setIntElement(term1996, 0, -2110556060);
        setIntElement(term1996, 1, 313459791);
        setIntElement(term1996, 2, 752615112);
        setIntElement(term1996, 3, -1674430871);
        setIntElement(term1996, 4, 794352120);
        setIntElement(term1996, 5, 340719678);
        setIntElement(term1996, 6, 299791142);
        setField(term1995, term1995.getClass(), "vertexColor", term1996);
        setIntField(term1995, term1995.getClass(), "numColoredVertices", 1862191391);
        setField(term2005, term2005.getClass(), "words", term2006);
        setIntField(term2005, term2005.getClass(), "wordsInUse", 1131398807);
        setBooleanField(term2005, term2005.getClass(), "sizeIsSticky", false);
        setField(term1995, term1995.getClass(), "usedColors", term2005);
        setField(term1995, term1995.getClass(), "colorMap", term2010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term1995, args);
    }

};


