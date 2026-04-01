package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RadiusCalculator_selectLargestUB_20893556585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6281;

    public RadiusCalculator_selectLargestUB_20893556585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6281 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        Object term6284 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6285 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6286 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6290 = (int[]) newIntArray(7);
        Object term6300 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6301 = (long[]) newLongArray(1);
        int[] term6305 = (int[]) newIntArray(2);
        int[] term6308 = (int[]) newIntArray(0);
        int[] term6309 = (int[]) newIntArray(9);
        setIntField(term6281, term6281.getClass(), "radiusLB", -348612876);
        setIntField(term6281, term6281.getClass(), "radiusUB", 1302807565);
        setField(term6285, term6285.getClass(), "table", term6286);
        setIntField(term6285, term6285.getClass(), "count", -838848221);
        setIntField(term6285, term6285.getClass(), "threshold", 15);
        setFloatField(term6285, term6285.getClass(), "loadFactor", 0.75F);
        setField(term6284, term6284.getClass(), "posMap", term6285);
        setField(term6284, term6284.getClass(), "graph", null);
        setIntElement(term6290, 0, 1163761623);
        setIntElement(term6290, 1, 718742281);
        setIntElement(term6290, 2, 1532723756);
        setIntElement(term6290, 3, -124088550);
        setIntElement(term6290, 4, 777492093);
        setIntElement(term6290, 5, 1414025609);
        setIntElement(term6290, 6, 255145822);
        setField(term6284, term6284.getClass(), "vertices", term6290);
        setIntField(term6284, term6284.getClass(), "numVertices", -573608449);
        setIntField(term6284, term6284.getClass(), "first", -1660057757);
        setField(term6300, term6300.getClass(), "words", term6301);
        setIntField(term6300, term6300.getClass(), "wordsInUse", 1816273440);
        setBooleanField(term6300, term6300.getClass(), "sizeIsSticky", false);
        setField(term6284, term6284.getClass(), "bitset", term6300);
        setField(term6281, term6281.getClass(), "vertexSet", term6284);
        setIntElement(term6305, 0, -96541009);
        setIntElement(term6305, 1, -43719302);
        setField(term6281, term6281.getClass(), "eccLB", term6305);
        setField(term6281, term6281.getClass(), "eccUB", term6308);
        setIntElement(term6309, 0, 1024134939);
        setIntElement(term6309, 1, 109078154);
        setIntElement(term6309, 2, -314165467);
        setIntElement(term6309, 3, 963694071);
        setIntElement(term6309, 4, -995785731);
        setIntElement(term6309, 5, 1349815364);
        setIntElement(term6309, 6, 2128383340);
        setIntElement(term6309, 7, 1238598518);
        setIntElement(term6309, 8, -558146961);
        setField(term6281, term6281.getClass(), "dist", term6309);
        setBooleanField(term6281, term6281.getClass(), "selector", true);
        setField(term6281, term6281.getClass(), "graph", null);
        setBooleanField(term6281, term6281.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectLargestUB", argTypes, term6281, args);
    }

};


