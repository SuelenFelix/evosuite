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

public class Cycle_isInduced_21029526864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;

    public Cycle_isInduced_21029526864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term267 = (int[]) newIntArray(6);
        Object term276 = newInstance(Class.forName("java.util.BitSet"));
        long[] term277 = (long[]) newLongArray(1);
        setIntField(term265, term265.getClass(), "numEdges", 454281060);
        setField(term265, term265.getClass(), "graph", null);
        setIntElement(term267, 0, -1786399638);
        setIntElement(term267, 1, 2055867847);
        setIntElement(term267, 2, -1048298087);
        setIntElement(term267, 3, 292681826);
        setIntElement(term267, 4, 458147407);
        setIntElement(term267, 5, -184153539);
        setField(term265, term265.getClass(), "vertices", term267);
        setIntField(term265, term265.getClass(), "numVertices", 493620644);
        setIntField(term265, term265.getClass(), "first", 1328271830);
        setField(term276, term276.getClass(), "words", term277);
        setIntField(term276, term276.getClass(), "wordsInUse", 1596070772);
        setBooleanField(term276, term276.getClass(), "sizeIsSticky", false);
        setField(term265, term265.getClass(), "bitset", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInduced", argTypes, term265, args);
    }

};


