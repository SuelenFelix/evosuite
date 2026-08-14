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

public class BidirectionalDijkstra_getSource_2432928651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;

    public BidirectionalDijkstra_getSource_2432928651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        int[] term2249 = (int[]) newIntArray(0);
        Object term2250 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2252 = (int[]) newIntArray(7);
        Object term2262 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2263 = (long[]) newLongArray(1);
        setIntField(term2246, term2246.getClass(), "source", 200252898);
        setIntField(term2246, term2246.getClass(), "target", -1831826725);
        setField(term2246, term2246.getClass(), "vertices", term2249);
        setIntField(term2250, term2250.getClass(), "numEdges", 752152965);
        setField(term2250, term2250.getClass(), "graph", null);
        setIntElement(term2252, 0, -1577069773);
        setIntElement(term2252, 1, -266625190);
        setIntElement(term2252, 2, 489201218);
        setIntElement(term2252, 3, 464181937);
        setIntElement(term2252, 4, -1455526612);
        setIntElement(term2252, 5, -941356098);
        setIntElement(term2252, 6, -201517446);
        setField(term2250, term2250.getClass(), "vertices", term2252);
        setIntField(term2250, term2250.getClass(), "numVertices", -97742366);
        setIntField(term2250, term2250.getClass(), "first", 1638851942);
        setField(term2262, term2262.getClass(), "words", term2263);
        setIntField(term2262, term2262.getClass(), "wordsInUse", 1374790203);
        setBooleanField(term2262, term2262.getClass(), "sizeIsSticky", true);
        setField(term2250, term2250.getClass(), "bitset", term2262);
        setField(term2246, term2246.getClass(), "bestPath", term2250);
        setDoubleField(term2246, term2246.getClass(), "bestWeight", 0.061434557058998585);
        setField(term2246, term2246.getClass(), "graph", null);
        setBooleanField(term2246, term2246.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2246, args);
    }

};


