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
     Object term4275;

    public VertexQueue_poll_10231734005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4275 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term4276 = (int[]) newIntArray(7);
        Object term4286 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4287 = (long[]) newLongArray(1);
        setField(term4275, term4275.getClass(), "graph", null);
        setIntElement(term4276, 0, 693500318);
        setIntElement(term4276, 1, 1702404702);
        setIntElement(term4276, 2, 1141592999);
        setIntElement(term4276, 3, 848113442);
        setIntElement(term4276, 4, 793974213);
        setIntElement(term4276, 5, 722546287);
        setIntElement(term4276, 6, -2060284160);
        setField(term4275, term4275.getClass(), "vertices", term4276);
        setIntField(term4275, term4275.getClass(), "numVertices", -568450686);
        setIntField(term4275, term4275.getClass(), "first", 1314660281);
        setField(term4286, term4286.getClass(), "words", term4287);
        setIntField(term4286, term4286.getClass(), "wordsInUse", -126399768);
        setBooleanField(term4286, term4286.getClass(), "sizeIsSticky", false);
        setField(term4275, term4275.getClass(), "bitset", term4286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "poll", argTypes, term4275, args);
    }

};


