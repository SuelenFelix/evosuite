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

public class BidirectionalDijkstra_getPathWeight_6824453564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2345;

    public BidirectionalDijkstra_getPathWeight_6824453564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2345 = newInstance(Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra"));
        int[] term2348 = (int[]) newIntArray(8);
        Object term2357 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2359 = (int[]) newIntArray(8);
        Object term2370 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2371 = (long[]) newLongArray(1);
        setIntField(term2345, term2345.getClass(), "source", -1133405894);
        setIntField(term2345, term2345.getClass(), "target", 1289741214);
        setIntElement(term2348, 0, 243280944);
        setIntElement(term2348, 1, -726681073);
        setIntElement(term2348, 2, -1724487863);
        setIntElement(term2348, 3, -128490829);
        setIntElement(term2348, 4, 202214133);
        setIntElement(term2348, 5, 1543091617);
        setIntElement(term2348, 6, -763166094);
        setIntElement(term2348, 7, -222941705);
        setField(term2345, term2345.getClass(), "vertices", term2348);
        setIntField(term2357, term2357.getClass(), "numEdges", 291864719);
        setField(term2357, term2357.getClass(), "graph", null);
        setIntElement(term2359, 0, -1549607466);
        setIntElement(term2359, 1, 853609788);
        setIntElement(term2359, 2, -197820800);
        setIntElement(term2359, 3, 723812297);
        setIntElement(term2359, 4, 1639448749);
        setIntElement(term2359, 5, 873659088);
        setIntElement(term2359, 6, -975748721);
        setIntElement(term2359, 7, 433248783);
        setField(term2357, term2357.getClass(), "vertices", term2359);
        setIntField(term2357, term2357.getClass(), "numVertices", -507944154);
        setIntField(term2357, term2357.getClass(), "first", -1736183862);
        setField(term2370, term2370.getClass(), "words", term2371);
        setIntField(term2370, term2370.getClass(), "wordsInUse", 897010381);
        setBooleanField(term2370, term2370.getClass(), "sizeIsSticky", false);
        setField(term2357, term2357.getClass(), "bitset", term2370);
        setField(term2345, term2345.getClass(), "bestPath", term2357);
        setDoubleField(term2345, term2345.getClass(), "bestWeight", 0.33296332053567956);
        setField(term2345, term2345.getClass(), "graph", null);
        setBooleanField(term2345, term2345.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BidirectionalDijkstra");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term2345, args);
    }

};


