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

public class VertexSet1_contains_151723498615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71584;
     Object term71603;

    public VertexSet1_contains_151723498615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71584 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71585 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71586 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71590 = (int[]) newIntArray(5);
        Object term71598 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71599 = (long[]) newLongArray(1);
        setField(term71585, term71585.getClass(), "table", term71586);
        setIntField(term71585, term71585.getClass(), "count", -913545640);
        setIntField(term71585, term71585.getClass(), "threshold", 15);
        setFloatField(term71585, term71585.getClass(), "loadFactor", 0.75F);
        setField(term71584, term71584.getClass(), "posMap", term71585);
        setField(term71584, term71584.getClass(), "graph", null);
        setIntElement(term71590, 0, 1019617568);
        setIntElement(term71590, 1, -89684579);
        setIntElement(term71590, 2, -259140396);
        setIntElement(term71590, 3, 2058486253);
        setIntElement(term71590, 4, -1940345085);
        setField(term71584, term71584.getClass(), "vertices", term71590);
        setIntField(term71584, term71584.getClass(), "numVertices", -1732622094);
        setIntField(term71584, term71584.getClass(), "first", 2112663117);
        setField(term71598, term71598.getClass(), "words", term71599);
        setIntField(term71598, term71598.getClass(), "wordsInUse", 310553066);
        setBooleanField(term71598, term71598.getClass(), "sizeIsSticky", false);
        setField(term71584, term71584.getClass(), "bitset", term71598);
        term71603 = new Integer(-162362750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71603;
        callMethod(klass, "contains", argTypes, term71584, args);
    }

};


