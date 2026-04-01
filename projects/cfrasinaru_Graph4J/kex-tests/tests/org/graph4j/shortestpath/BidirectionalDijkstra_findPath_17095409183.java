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

public class BidirectionalDijkstra_findPath_17095409183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2312;

    public BidirectionalDijkstra_findPath_17095409183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2312 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        int[] term2315 = (int[]) newIntArray(6);
        Object term2322 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2324 = (int[]) newIntArray(2);
        Object term2329 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2330 = (long[]) newLongArray(1);
        setIntField(term2312, term2312.getClass(), "source", 76650923);
        setIntField(term2312, term2312.getClass(), "target", 1003743923);
        setIntElement(term2315, 0, 1887772522);
        setIntElement(term2315, 1, 354196060);
        setIntElement(term2315, 2, -1840305774);
        setIntElement(term2315, 3, 1365087144);
        setIntElement(term2315, 4, -1537255112);
        setIntElement(term2315, 5, 934477462);
        setField(term2312, term2312.getClass(), "vertices", term2315);
        setIntField(term2322, term2322.getClass(), "numEdges", 4900410);
        setField(term2322, term2322.getClass(), "graph", null);
        setIntElement(term2324, 0, -1252345779);
        setIntElement(term2324, 1, -2063365430);
        setField(term2322, term2322.getClass(), "vertices", term2324);
        setIntField(term2322, term2322.getClass(), "numVertices", 812570053);
        setIntField(term2322, term2322.getClass(), "first", -1488938905);
        setField(term2329, term2329.getClass(), "words", term2330);
        setIntField(term2329, term2329.getClass(), "wordsInUse", 1916544127);
        setBooleanField(term2329, term2329.getClass(), "sizeIsSticky", false);
        setField(term2322, term2322.getClass(), "bitset", term2329);
        setField(term2312, term2312.getClass(), "bestPath", term2322);
        setDoubleField(term2312, term2312.getClass(), "bestWeight", 0.8809657273235505);
        setField(term2312, term2312.getClass(), "graph", null);
        setBooleanField(term2312, term2312.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPath", argTypes, term2312, args);
    }

};


