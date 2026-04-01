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

public class Walk_computeEdgesWeight_32091743311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143950;

    public Walk_computeEdgesWeight_32091743311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143950 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143952 = (int[]) newIntArray(4);
        Object term143959 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143960 = (long[]) newLongArray(1);
        setIntField(term143950, term143950.getClass(), "numEdges", 1812542977);
        setField(term143950, term143950.getClass(), "graph", null);
        setIntElement(term143952, 0, 2028856518);
        setIntElement(term143952, 1, -1387270272);
        setIntElement(term143952, 2, -1688321358);
        setIntElement(term143952, 3, 849306930);
        setField(term143950, term143950.getClass(), "vertices", term143952);
        setIntField(term143950, term143950.getClass(), "numVertices", 29730270);
        setIntField(term143950, term143950.getClass(), "first", 1963887327);
        setField(term143959, term143959.getClass(), "words", term143960);
        setIntField(term143959, term143959.getClass(), "wordsInUse", 1653366809);
        setBooleanField(term143959, term143959.getClass(), "sizeIsSticky", true);
        setField(term143950, term143950.getClass(), "bitset", term143959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term143950, args);
    }

};


