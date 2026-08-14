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

public class BFSSinglePairShortestPath_getSource_20491970822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2493;

    public BFSSinglePairShortestPath_getSource_20491970822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2493 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2496 = (int[]) newIntArray(7);
        Object term2504 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2506 = (int[]) newIntArray(6);
        Object term2515 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2516 = (long[]) newLongArray(1);
        setIntField(term2493, term2493.getClass(), "source", 1862841859);
        setIntField(term2493, term2493.getClass(), "target", -1114668574);
        setIntElement(term2496, 0, 514511037);
        setIntElement(term2496, 1, 1713573821);
        setIntElement(term2496, 2, 1956590498);
        setIntElement(term2496, 3, 1467356494);
        setIntElement(term2496, 4, -26316536);
        setIntElement(term2496, 5, 1716165145);
        setIntElement(term2496, 6, 1692937831);
        setField(term2493, term2493.getClass(), "forbiddenVertices", term2496);
        setIntField(term2504, term2504.getClass(), "numEdges", -1539747985);
        setField(term2504, term2504.getClass(), "graph", null);
        setIntElement(term2506, 0, -1982489643);
        setIntElement(term2506, 1, 550892835);
        setIntElement(term2506, 2, 1237549886);
        setIntElement(term2506, 3, -1945635750);
        setIntElement(term2506, 4, -1622760744);
        setIntElement(term2506, 5, 2068435279);
        setField(term2504, term2504.getClass(), "vertices", term2506);
        setIntField(term2504, term2504.getClass(), "numVertices", -1556527718);
        setIntField(term2504, term2504.getClass(), "first", 895255351);
        setField(term2515, term2515.getClass(), "words", term2516);
        setIntField(term2515, term2515.getClass(), "wordsInUse", -1317044799);
        setBooleanField(term2515, term2515.getClass(), "sizeIsSticky", false);
        setField(term2504, term2504.getClass(), "bitset", term2515);
        setField(term2493, term2493.getClass(), "bestPath", term2504);
        setDoubleField(term2493, term2493.getClass(), "bestWeight", 0.7455431255888774);
        setField(term2493, term2493.getClass(), "graph", null);
        setBooleanField(term2493, term2493.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2493, args);
    }

};


