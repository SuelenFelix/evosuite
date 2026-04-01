package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Coloring_getColorsUsedBy_108363120326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209;
     Object term2237;

    public Coloring_getColorsUsedBy_108363120326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2224 = new HashMap();
        term2209 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2210 = (int[]) newIntArray(7);
        Object term2219 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2220 = (long[]) newLongArray(1);
        setField(term2209, term2209.getClass(), "graph", null);
        setIntElement(term2210, 0, -1790275458);
        setIntElement(term2210, 1, -497534255);
        setIntElement(term2210, 2, 1588942911);
        setIntElement(term2210, 3, -2129828854);
        setIntElement(term2210, 4, -47438786);
        setIntElement(term2210, 5, -1955400589);
        setIntElement(term2210, 6, 626179200);
        setField(term2209, term2209.getClass(), "vertexColor", term2210);
        setIntField(term2209, term2209.getClass(), "numColoredVertices", -511077684);
        setField(term2219, term2219.getClass(), "words", term2220);
        setIntField(term2219, term2219.getClass(), "wordsInUse", -711507760);
        setBooleanField(term2219, term2219.getClass(), "sizeIsSticky", false);
        setField(term2209, term2209.getClass(), "usedColors", term2219);
        setField(term2209, term2209.getClass(), "colorMap", term2224);
        term2237 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2238 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2239 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2243 = (int[]) newIntArray(5);
        Object term2251 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2252 = (long[]) newLongArray(1);
        setField(term2238, term2238.getClass(), "table", term2239);
        setIntField(term2238, term2238.getClass(), "count", 1499735894);
        setIntField(term2238, term2238.getClass(), "threshold", 15);
        setFloatField(term2238, term2238.getClass(), "loadFactor", 0.75F);
        setField(term2237, term2237.getClass(), "posMap", term2238);
        setField(term2237, term2237.getClass(), "graph", null);
        setIntElement(term2243, 0, 716486048);
        setIntElement(term2243, 1, -466708718);
        setIntElement(term2243, 2, 1038029515);
        setIntElement(term2243, 3, 1137154606);
        setIntElement(term2243, 4, -100681578);
        setField(term2237, term2237.getClass(), "vertices", term2243);
        setIntField(term2237, term2237.getClass(), "numVertices", 296568835);
        setIntField(term2237, term2237.getClass(), "first", 1431951992);
        setField(term2251, term2251.getClass(), "words", term2252);
        setIntField(term2251, term2251.getClass(), "wordsInUse", -1608123016);
        setBooleanField(term2251, term2251.getClass(), "sizeIsSticky", false);
        setField(term2237, term2237.getClass(), "bitset", term2251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term2237;
        callMethod(klass, "getColorsUsedBy", argTypes, term2209, args);
    }

};


