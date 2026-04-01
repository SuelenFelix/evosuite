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

public class Coloring_getColorClasses_24649260311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;

    public Coloring_getColorClasses_24649260311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1740 = new HashMap();
        term1731 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1732 = (int[]) newIntArray(1);
        Object term1735 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1736 = (long[]) newLongArray(1);
        setField(term1731, term1731.getClass(), "graph", null);
        setIntElement(term1732, 0, 1607082164);
        setField(term1731, term1731.getClass(), "vertexColor", term1732);
        setIntField(term1731, term1731.getClass(), "numColoredVertices", 1890399366);
        setField(term1735, term1735.getClass(), "words", term1736);
        setIntField(term1735, term1735.getClass(), "wordsInUse", -1867239125);
        setBooleanField(term1735, term1735.getClass(), "sizeIsSticky", false);
        setField(term1731, term1731.getClass(), "usedColors", term1735);
        setField(term1731, term1731.getClass(), "colorMap", term1740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorClasses", argTypes, term1731, args);
    }

};


