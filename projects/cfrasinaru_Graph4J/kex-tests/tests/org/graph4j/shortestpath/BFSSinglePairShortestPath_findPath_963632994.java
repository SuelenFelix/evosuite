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

public class BFSSinglePairShortestPath_findPath_963632994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567;

    public BFSSinglePairShortestPath_findPath_963632994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2567 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2570 = (int[]) newIntArray(2);
        Object term2573 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2575 = (int[]) newIntArray(0);
        Object term2578 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2579 = (long[]) newLongArray(1);
        setIntField(term2567, term2567.getClass(), "source", 797203987);
        setIntField(term2567, term2567.getClass(), "target", 1973060703);
        setIntElement(term2570, 0, -138239905);
        setIntElement(term2570, 1, 1709474063);
        setField(term2567, term2567.getClass(), "forbiddenVertices", term2570);
        setIntField(term2573, term2573.getClass(), "numEdges", 1406617209);
        setField(term2573, term2573.getClass(), "graph", null);
        setField(term2573, term2573.getClass(), "vertices", term2575);
        setIntField(term2573, term2573.getClass(), "numVertices", 1706047059);
        setIntField(term2573, term2573.getClass(), "first", 590451710);
        setField(term2578, term2578.getClass(), "words", term2579);
        setIntField(term2578, term2578.getClass(), "wordsInUse", -1999787419);
        setBooleanField(term2578, term2578.getClass(), "sizeIsSticky", true);
        setField(term2573, term2573.getClass(), "bitset", term2578);
        setField(term2567, term2567.getClass(), "bestPath", term2573);
        setDoubleField(term2567, term2567.getClass(), "bestWeight", 0.967474946781822);
        setField(term2567, term2567.getClass(), "graph", null);
        setBooleanField(term2567, term2567.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2567, args);
    }

};


