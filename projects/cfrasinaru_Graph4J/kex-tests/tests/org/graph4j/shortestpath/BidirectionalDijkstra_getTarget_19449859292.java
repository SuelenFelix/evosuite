package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BidirectionalDijkstra_getTarget_19449859292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2277;

    public BidirectionalDijkstra_getTarget_19449859292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2277 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        int[] term2280 = (int[]) newIntArray(3);
        Object term2284 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2286 = (int[]) newIntArray(6);
        Object term2295 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2296 = (long[]) newLongArray(1);
        setIntField(term2277, term2277.getClass(), "source", 1160010161);
        setIntField(term2277, term2277.getClass(), "target", -423900705);
        setIntElement(term2280, 0, -525570815);
        setIntElement(term2280, 1, 754055848);
        setIntElement(term2280, 2, -19246901);
        setField(term2277, term2277.getClass(), "vertices", term2280);
        setIntField(term2284, term2284.getClass(), "numEdges", -370828664);
        setField(term2284, term2284.getClass(), "graph", null);
        setIntElement(term2286, 0, 1168633950);
        setIntElement(term2286, 1, 1607082164);
        setIntElement(term2286, 2, 1890399366);
        setIntElement(term2286, 3, -1867239125);
        setIntElement(term2286, 4, 952869601);
        setIntElement(term2286, 5, 91958879);
        setField(term2284, term2284.getClass(), "vertices", term2286);
        setIntField(term2284, term2284.getClass(), "numVertices", -645429025);
        setIntField(term2284, term2284.getClass(), "first", -688213483);
        setField(term2295, term2295.getClass(), "words", term2296);
        setIntField(term2295, term2295.getClass(), "wordsInUse", 644154104);
        setBooleanField(term2295, term2295.getClass(), "sizeIsSticky", false);
        setField(term2284, term2284.getClass(), "bitset", term2295);
        setField(term2277, term2277.getClass(), "bestPath", term2284);
        setDoubleField(term2277, term2277.getClass(), "bestWeight", 0.1621025751381594);
        setField(term2277, term2277.getClass(), "graph", null);
        setBooleanField(term2277, term2277.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term2277, args);
    }

};


