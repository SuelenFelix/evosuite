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

public class VertexSet_union_43563304018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150441;
     Object term150462;

    public VertexSet_union_43563304018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150441 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150442 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150443 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150447 = (int[]) newIntArray(7);
        Object term150457 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150458 = (long[]) newLongArray(1);
        setField(term150442, term150442.getClass(), "table", term150443);
        setIntField(term150442, term150442.getClass(), "count", -482067802);
        setIntField(term150442, term150442.getClass(), "threshold", 15);
        setFloatField(term150442, term150442.getClass(), "loadFactor", 0.75F);
        setField(term150441, term150441.getClass(), "posMap", term150442);
        setField(term150441, term150441.getClass(), "graph", null);
        setIntElement(term150447, 0, -1094832395);
        setIntElement(term150447, 1, 1561234031);
        setIntElement(term150447, 2, -1689665127);
        setIntElement(term150447, 3, 1577707482);
        setIntElement(term150447, 4, 813432927);
        setIntElement(term150447, 5, 612763336);
        setIntElement(term150447, 6, 986205059);
        setField(term150441, term150441.getClass(), "vertices", term150447);
        setIntField(term150441, term150441.getClass(), "numVertices", 1326801100);
        setIntField(term150441, term150441.getClass(), "first", -501506948);
        setField(term150457, term150457.getClass(), "words", term150458);
        setIntField(term150457, term150457.getClass(), "wordsInUse", -910684551);
        setBooleanField(term150457, term150457.getClass(), "sizeIsSticky", false);
        setField(term150441, term150441.getClass(), "bitset", term150457);
        term150462 = (int[]) newIntArray(5);
        setIntElement(term150462, 0, 2096279580);
        setIntElement(term150462, 1, 17286864);
        setIntElement(term150462, 2, -436058601);
        setIntElement(term150462, 3, -88465528);
        setIntElement(term150462, 4, -192888942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term150462;
        callMethod(klass, "union", argTypes, term150441, args);
    }

};


