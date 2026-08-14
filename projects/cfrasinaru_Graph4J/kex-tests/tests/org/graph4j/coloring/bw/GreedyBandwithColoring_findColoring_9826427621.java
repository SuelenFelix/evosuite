package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GreedyBandwithColoring_findColoring_9826427621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;

    public GreedyBandwithColoring_findColoring_9826427621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922 = newInstance(Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring"));
        int[] term924 = (int[]) newIntArray(3);
        int[] term928 = (int[]) newIntArray(9);
        Object term938 = newInstance(Class.forName("java.util.BitSet"));
        long[] term939 = (long[]) newLongArray(1);
        setIntField(term922, term922.getClass(), "pos", 2007134147);
        setIntElement(term924, 0, 993388358);
        setIntElement(term924, 1, -765191335);
        setIntElement(term924, 2, -1697741155);
        setField(term922, term922.getClass(), "vertexOrdering", term924);
        setIntElement(term928, 0, 1295839803);
        setIntElement(term928, 1, -1891015523);
        setIntElement(term928, 2, -1560631747);
        setIntElement(term928, 3, 1215150180);
        setIntElement(term928, 4, -1422859977);
        setIntElement(term928, 5, -1972436591);
        setIntElement(term928, 6, 68922753);
        setIntElement(term928, 7, -220791533);
        setIntElement(term928, 8, 1741500243);
        setField(term922, term922.getClass(), "colors", term928);
        setField(term938, term938.getClass(), "words", term939);
        setIntField(term938, term938.getClass(), "wordsInUse", -2070466617);
        setBooleanField(term938, term938.getClass(), "sizeIsSticky", true);
        setField(term922, term922.getClass(), "used", term938);
        setIntField(term922, term922.getClass(), "numColors", -1127721881);
        setIntField(term922, term922.getClass(), "maxColor", 1074848808);
        setField(term922, term922.getClass(), "recolor", null);
        setField(term922, term922.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findColoring", argTypes, term922, args);
    }

};


