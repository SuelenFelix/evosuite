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
import java.lang.Integer;

public class RadiusCalculator_computeEcc_6777505992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;
     Object term6153;

    public RadiusCalculator_computeEcc_6777505992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6122 = newInstance(Class.forName("org.graph4j.metrics.RadiusCalculator"));
        Object term6125 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6126 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6127 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6131 = (int[]) newIntArray(0);
        Object term6134 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6135 = (long[]) newLongArray(1);
        int[] term6139 = (int[]) newIntArray(6);
        int[] term6146 = (int[]) newIntArray(1);
        int[] term6148 = (int[]) newIntArray(2);
        setIntField(term6122, term6122.getClass(), "radiusLB", 1048451946);
        setIntField(term6122, term6122.getClass(), "radiusUB", 5603560);
        setField(term6126, term6126.getClass(), "table", term6127);
        setIntField(term6126, term6126.getClass(), "count", -1079020032);
        setIntField(term6126, term6126.getClass(), "threshold", 15);
        setFloatField(term6126, term6126.getClass(), "loadFactor", 0.75F);
        setField(term6125, term6125.getClass(), "posMap", term6126);
        setField(term6125, term6125.getClass(), "graph", null);
        setField(term6125, term6125.getClass(), "vertices", term6131);
        setIntField(term6125, term6125.getClass(), "numVertices", -1973791064);
        setIntField(term6125, term6125.getClass(), "first", -2072158633);
        setField(term6134, term6134.getClass(), "words", term6135);
        setIntField(term6134, term6134.getClass(), "wordsInUse", -355469363);
        setBooleanField(term6134, term6134.getClass(), "sizeIsSticky", true);
        setField(term6125, term6125.getClass(), "bitset", term6134);
        setField(term6122, term6122.getClass(), "vertexSet", term6125);
        setIntElement(term6139, 0, 1465188553);
        setIntElement(term6139, 1, 1633913667);
        setIntElement(term6139, 2, 1292332296);
        setIntElement(term6139, 3, -1415256843);
        setIntElement(term6139, 4, 612177768);
        setIntElement(term6139, 5, -1626451656);
        setField(term6122, term6122.getClass(), "eccLB", term6139);
        setIntElement(term6146, 0, 173952451);
        setField(term6122, term6122.getClass(), "eccUB", term6146);
        setIntElement(term6148, 0, -1972033388);
        setIntElement(term6148, 1, -1005024758);
        setField(term6122, term6122.getClass(), "dist", term6148);
        setBooleanField(term6122, term6122.getClass(), "selector", false);
        setField(term6122, term6122.getClass(), "graph", null);
        setBooleanField(term6122, term6122.getClass(), "directed", true);
        term6153 = new Integer(2634669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.RadiusCalculator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6153;
        callMethod(klass, "computeEcc", argTypes, term6122, args);
    }

};


