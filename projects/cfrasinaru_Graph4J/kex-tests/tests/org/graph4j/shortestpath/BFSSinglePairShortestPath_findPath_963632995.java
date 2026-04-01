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

public class BFSSinglePairShortestPath_findPath_963632995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2572;

    public BFSSinglePairShortestPath_findPath_963632995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2572 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2575 = (int[]) newIntArray(2);
        Object term2578 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2580 = (int[]) newIntArray(0);
        Object term2583 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2584 = (long[]) newLongArray(1);
        setIntField(term2572, term2572.getClass(), "source", 797203987);
        setIntField(term2572, term2572.getClass(), "target", 1973060703);
        setIntElement(term2575, 0, -138239905);
        setIntElement(term2575, 1, 1709474063);
        setField(term2572, term2572.getClass(), "forbiddenVertices", term2575);
        setIntField(term2578, term2578.getClass(), "numEdges", 1406617209);
        setField(term2578, term2578.getClass(), "graph", null);
        setField(term2578, term2578.getClass(), "vertices", term2580);
        setIntField(term2578, term2578.getClass(), "numVertices", 1706047059);
        setIntField(term2578, term2578.getClass(), "first", 590451710);
        setField(term2583, term2583.getClass(), "words", term2584);
        setIntField(term2583, term2583.getClass(), "wordsInUse", -1999787419);
        setBooleanField(term2583, term2583.getClass(), "sizeIsSticky", true);
        setField(term2578, term2578.getClass(), "bitset", term2583);
        setField(term2572, term2572.getClass(), "bestPath", term2578);
        setDoubleField(term2572, term2572.getClass(), "bestWeight", 0.967474946781822);
        setField(term2572, term2572.getClass(), "graph", null);
        setBooleanField(term2572, term2572.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2572, args);
    }

};


