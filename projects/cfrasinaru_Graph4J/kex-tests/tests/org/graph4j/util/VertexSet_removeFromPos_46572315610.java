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
import java.lang.Integer;

public class VertexSet_removeFromPos_46572315610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150209;
     Object term150225;

    public VertexSet_removeFromPos_46572315610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150209 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150210 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150211 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150215 = (int[]) newIntArray(2);
        Object term150220 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150221 = (long[]) newLongArray(1);
        setField(term150210, term150210.getClass(), "table", term150211);
        setIntField(term150210, term150210.getClass(), "count", 331966492);
        setIntField(term150210, term150210.getClass(), "threshold", 15);
        setFloatField(term150210, term150210.getClass(), "loadFactor", 0.75F);
        setField(term150209, term150209.getClass(), "posMap", term150210);
        setField(term150209, term150209.getClass(), "graph", null);
        setIntElement(term150215, 0, -915093532);
        setIntElement(term150215, 1, 229012335);
        setField(term150209, term150209.getClass(), "vertices", term150215);
        setIntField(term150209, term150209.getClass(), "numVertices", 145722440);
        setIntField(term150209, term150209.getClass(), "first", 1986369294);
        setField(term150220, term150220.getClass(), "words", term150221);
        setIntField(term150220, term150220.getClass(), "wordsInUse", 1413815157);
        setBooleanField(term150220, term150220.getClass(), "sizeIsSticky", true);
        setField(term150209, term150209.getClass(), "bitset", term150220);
        term150225 = new Integer(-1815309730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150225;
        callMethod(klass, "removeFromPos", argTypes, term150209, args);
    }

};


