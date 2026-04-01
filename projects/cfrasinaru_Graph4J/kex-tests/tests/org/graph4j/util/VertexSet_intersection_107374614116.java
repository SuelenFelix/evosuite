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

public class VertexSet_intersection_107374614116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150355;
     Object term150378;

    public VertexSet_intersection_107374614116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150355 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150356 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150357 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150361 = (int[]) newIntArray(9);
        Object term150373 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150374 = (long[]) newLongArray(1);
        setField(term150356, term150356.getClass(), "table", term150357);
        setIntField(term150356, term150356.getClass(), "count", -974287449);
        setIntField(term150356, term150356.getClass(), "threshold", 15);
        setFloatField(term150356, term150356.getClass(), "loadFactor", 0.75F);
        setField(term150355, term150355.getClass(), "posMap", term150356);
        setField(term150355, term150355.getClass(), "graph", null);
        setIntElement(term150361, 0, 1410202028);
        setIntElement(term150361, 1, -190450927);
        setIntElement(term150361, 2, -1837578404);
        setIntElement(term150361, 3, 620403025);
        setIntElement(term150361, 4, 371744544);
        setIntElement(term150361, 5, 1051003157);
        setIntElement(term150361, 6, 1309716703);
        setIntElement(term150361, 7, 1119355754);
        setIntElement(term150361, 8, -1432457770);
        setField(term150355, term150355.getClass(), "vertices", term150361);
        setIntField(term150355, term150355.getClass(), "numVertices", -1549550148);
        setIntField(term150355, term150355.getClass(), "first", -934914144);
        setField(term150373, term150373.getClass(), "words", term150374);
        setIntField(term150373, term150373.getClass(), "wordsInUse", -1956234380);
        setBooleanField(term150373, term150373.getClass(), "sizeIsSticky", true);
        setField(term150355, term150355.getClass(), "bitset", term150373);
        term150378 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term150379 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term150380 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term150384 = (int[]) newIntArray(1);
        Object term150388 = newInstance(Class.forName("java.util.BitSet"));
        long[] term150389 = (long[]) newLongArray(1);
        setField(term150379, term150379.getClass(), "table", term150380);
        setIntField(term150379, term150379.getClass(), "count", -1957755344);
        setIntField(term150379, term150379.getClass(), "threshold", 15);
        setFloatField(term150379, term150379.getClass(), "loadFactor", 0.75F);
        setField(term150378, term150378.getClass(), "posMap", term150379);
        setField(term150378, term150378.getClass(), "graph", null);
        setIntElement(term150384, 0, 2119986156);
        setField(term150378, term150378.getClass(), "vertices", term150384);
        setIntField(term150378, term150378.getClass(), "numVertices", 1427835474);
        setIntField(term150378, term150378.getClass(), "first", -703662178);
        setField(term150388, term150388.getClass(), "words", term150389);
        setIntField(term150388, term150388.getClass(), "wordsInUse", 1167450469);
        setBooleanField(term150388, term150388.getClass(), "sizeIsSticky", false);
        setField(term150378, term150378.getClass(), "bitset", term150388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term150378;
        callMethod(klass, "intersection", argTypes, term150355, args);
    }

};


