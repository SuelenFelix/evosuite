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

public class VertexQueue_poll_10231734005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101201;

    public VertexQueue_poll_10231734005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101201 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term101202 = (int[]) newIntArray(6);
        Object term101211 = newInstance(Class.forName("java.util.BitSet"));
        long[] term101212 = (long[]) newLongArray(1);
        setField(term101201, term101201.getClass(), "graph", null);
        setIntElement(term101202, 0, -1535935345);
        setIntElement(term101202, 1, -1386264680);
        setIntElement(term101202, 2, -1542924803);
        setIntElement(term101202, 3, 823893692);
        setIntElement(term101202, 4, 1766080609);
        setIntElement(term101202, 5, 642859580);
        setField(term101201, term101201.getClass(), "vertices", term101202);
        setIntField(term101201, term101201.getClass(), "numVertices", 1619698611);
        setIntField(term101201, term101201.getClass(), "first", -1637017242);
        setField(term101211, term101211.getClass(), "words", term101212);
        setIntField(term101211, term101211.getClass(), "wordsInUse", -1732584815);
        setBooleanField(term101211, term101211.getClass(), "sizeIsSticky", true);
        setField(term101201, term101201.getClass(), "bitset", term101211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "poll", argTypes, term101201, args);
    }

};


