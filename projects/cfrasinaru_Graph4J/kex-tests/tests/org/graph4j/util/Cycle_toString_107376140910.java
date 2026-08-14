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

public class Cycle_toString_107376140910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public Cycle_toString_107376140910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term378 = (int[]) newIntArray(0);
        Object term381 = newInstance(Class.forName("java.util.BitSet"));
        long[] term382 = (long[]) newLongArray(1);
        setIntField(term376, term376.getClass(), "numEdges", -1263114719);
        setField(term376, term376.getClass(), "graph", null);
        setField(term376, term376.getClass(), "vertices", term378);
        setIntField(term376, term376.getClass(), "numVertices", -894662986);
        setIntField(term376, term376.getClass(), "first", 304775596);
        setField(term381, term381.getClass(), "words", term382);
        setIntField(term381, term381.getClass(), "wordsInUse", -1347665717);
        setBooleanField(term381, term381.getClass(), "sizeIsSticky", true);
        setField(term376, term376.getClass(), "bitset", term381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term376, args);
    }

};


