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

public class BFSSinglePairShortestPath_getPathWeight_11234588616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2593;

    public BFSSinglePairShortestPath_getPathWeight_11234588616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2593 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2596 = (int[]) newIntArray(0);
        Object term2597 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2599 = (int[]) newIntArray(5);
        Object term2607 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2608 = (long[]) newLongArray(1);
        setIntField(term2593, term2593.getClass(), "source", -1224443634);
        setIntField(term2593, term2593.getClass(), "target", 1048451946);
        setField(term2593, term2593.getClass(), "forbiddenVertices", term2596);
        setIntField(term2597, term2597.getClass(), "numEdges", 5603560);
        setField(term2597, term2597.getClass(), "graph", null);
        setIntElement(term2599, 0, -1079020032);
        setIntElement(term2599, 1, -1973791064);
        setIntElement(term2599, 2, -2072158633);
        setIntElement(term2599, 3, -355469363);
        setIntElement(term2599, 4, 1465188553);
        setField(term2597, term2597.getClass(), "vertices", term2599);
        setIntField(term2597, term2597.getClass(), "numVertices", 1633913667);
        setIntField(term2597, term2597.getClass(), "first", 1292332296);
        setField(term2607, term2607.getClass(), "words", term2608);
        setIntField(term2607, term2607.getClass(), "wordsInUse", -1415256843);
        setBooleanField(term2607, term2607.getClass(), "sizeIsSticky", false);
        setField(term2597, term2597.getClass(), "bitset", term2607);
        setField(term2593, term2593.getClass(), "bestPath", term2597);
        setDoubleField(term2593, term2593.getClass(), "bestWeight", 0.4429892630967539);
        setField(term2593, term2593.getClass(), "graph", null);
        setBooleanField(term2593, term2593.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term2593, args);
    }

};


