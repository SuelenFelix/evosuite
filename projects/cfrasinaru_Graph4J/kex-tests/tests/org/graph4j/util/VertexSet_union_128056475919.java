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

public class VertexSet_union_128056475919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150481;
     Object term150502;

    public VertexSet_union_128056475919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150481 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150482 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150483 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150487 = (int[]) newIntArray(7);
        Object term150497 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150498 = (long[]) newLongArray(1);
        setField(term150482, term150482.getClass(), "table", term150483);
        setIntField(term150482, term150482.getClass(), "count", 527142152);
        setIntField(term150482, term150482.getClass(), "threshold", 15);
        setFloatField(term150482, term150482.getClass(), "loadFactor", 0.75F);
        setField(term150481, term150481.getClass(), "posMap", term150482);
        setField(term150481, term150481.getClass(), "graph", null);
        setIntElement(term150487, 0, -113928847);
        setIntElement(term150487, 1, -1944174781);
        setIntElement(term150487, 2, 1492910201);
        setIntElement(term150487, 3, 461332708);
        setIntElement(term150487, 4, -1940451207);
        setIntElement(term150487, 5, -1094614944);
        setIntElement(term150487, 6, -1386011357);
        setField(term150481, term150481.getClass(), "vertices", term150487);
        setIntField(term150481, term150481.getClass(), "numVertices", 2091423467);
        setIntField(term150481, term150481.getClass(), "first", 247763514);
        setField(term150497, term150497.getClass(), "words", term150498);
        setIntField(term150497, term150497.getClass(), "wordsInUse", 1350190949);
        setBooleanField(term150497, term150497.getClass(), "sizeIsSticky", false);
        setField(term150481, term150481.getClass(), "bitset", term150497);
        term150502 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150503 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150504 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150508 = (int[]) newIntArray(1);
        Object term150512 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150513 = (long[]) newLongArray(1);
        setField(term150503, term150503.getClass(), "table", term150504);
        setIntField(term150503, term150503.getClass(), "count", -1342242251);
        setIntField(term150503, term150503.getClass(), "threshold", 15);
        setFloatField(term150503, term150503.getClass(), "loadFactor", 0.75F);
        setField(term150502, term150502.getClass(), "posMap", term150503);
        setField(term150502, term150502.getClass(), "graph", null);
        setIntElement(term150508, 0, 2082021306);
        setField(term150502, term150502.getClass(), "vertices", term150508);
        setIntField(term150502, term150502.getClass(), "numVertices", -1508690540);
        setIntField(term150502, term150502.getClass(), "first", -2143555254);
        setField(term150512, term150512.getClass(), "words", term150513);
        setIntField(term150512, term150512.getClass(), "wordsInUse", 2088229494);
        setBooleanField(term150512, term150512.getClass(), "sizeIsSticky", true);
        setField(term150502, term150502.getClass(), "bitset", term150512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term150502;
        callMethod(klass, "union", argTypes, term150481, args);
    }

};


