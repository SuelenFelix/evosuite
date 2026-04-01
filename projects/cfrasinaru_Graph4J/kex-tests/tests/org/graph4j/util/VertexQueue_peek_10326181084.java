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

public class VertexQueue_peek_10326181084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101191;

    public VertexQueue_peek_10326181084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101191 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term101192 = (int[]) newIntArray(0);
        Object term101195 = newInstance(Class.forName("java.util.BitSet"));
        long[] term101196 = (long[]) newLongArray(1);
        setField(term101191, term101191.getClass(), "graph", null);
        setField(term101191, term101191.getClass(), "vertices", term101192);
        setIntField(term101191, term101191.getClass(), "numVertices", 1578346029);
        setIntField(term101191, term101191.getClass(), "first", -1278952384);
        setField(term101195, term101195.getClass(), "words", term101196);
        setIntField(term101195, term101195.getClass(), "wordsInUse", -816405586);
        setBooleanField(term101195, term101195.getClass(), "sizeIsSticky", false);
        setField(term101191, term101191.getClass(), "bitset", term101195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term101191, args);
    }

};


