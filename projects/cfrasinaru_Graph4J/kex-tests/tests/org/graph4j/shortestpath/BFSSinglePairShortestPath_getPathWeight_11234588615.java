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

public class BFSSinglePairShortestPath_getPathWeight_11234588615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2588;

    public BFSSinglePairShortestPath_getPathWeight_11234588615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2588 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2591 = (int[]) newIntArray(0);
        Object term2592 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2594 = (int[]) newIntArray(5);
        Object term2602 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2603 = (long[]) newLongArray(1);
        setIntField(term2588, term2588.getClass(), "source", -1224443634);
        setIntField(term2588, term2588.getClass(), "target", 1048451946);
        setField(term2588, term2588.getClass(), "forbiddenVertices", term2591);
        setIntField(term2592, term2592.getClass(), "numEdges", 5603560);
        setField(term2592, term2592.getClass(), "graph", null);
        setIntElement(term2594, 0, -1079020032);
        setIntElement(term2594, 1, -1973791064);
        setIntElement(term2594, 2, -2072158633);
        setIntElement(term2594, 3, -355469363);
        setIntElement(term2594, 4, 1465188553);
        setField(term2592, term2592.getClass(), "vertices", term2594);
        setIntField(term2592, term2592.getClass(), "numVertices", 1633913667);
        setIntField(term2592, term2592.getClass(), "first", 1292332296);
        setField(term2602, term2602.getClass(), "words", term2603);
        setIntField(term2602, term2602.getClass(), "wordsInUse", -1415256843);
        setBooleanField(term2602, term2602.getClass(), "sizeIsSticky", false);
        setField(term2592, term2592.getClass(), "bitset", term2602);
        setField(term2588, term2588.getClass(), "bestPath", term2592);
        setDoubleField(term2588, term2588.getClass(), "bestWeight", 0.4429892630967539);
        setField(term2588, term2588.getClass(), "graph", null);
        setBooleanField(term2588, term2588.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term2588, args);
    }

};


