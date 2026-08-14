package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Path_lastVertex_15705986274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6464;

    public Path_lastVertex_15705986274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6464 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term6466 = (int[]) newIntArray(7);
        Object term6476 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6477 = (long[]) newLongArray(1);
        setIntField(term6464, term6464.getClass(), "numEdges", -650288950);
        setField(term6464, term6464.getClass(), "graph", null);
        setIntElement(term6466, 0, 433039357);
        setIntElement(term6466, 1, 1469939797);
        setIntElement(term6466, 2, 252799294);
        setIntElement(term6466, 3, -2072618022);
        setIntElement(term6466, 4, -269909549);
        setIntElement(term6466, 5, 686286032);
        setIntElement(term6466, 6, -1277201854);
        setField(term6464, term6464.getClass(), "vertices", term6466);
        setIntField(term6464, term6464.getClass(), "numVertices", 1691516034);
        setIntField(term6464, term6464.getClass(), "first", 335681723);
        setField(term6476, term6476.getClass(), "words", term6477);
        setIntField(term6476, term6476.getClass(), "wordsInUse", -773707674);
        setBooleanField(term6476, term6476.getClass(), "sizeIsSticky", false);
        setField(term6464, term6464.getClass(), "bitset", term6476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "lastVertex", argTypes, term6464, args);
    }

};


