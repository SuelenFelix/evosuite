package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSCliqueIterator_hasNext_2876699885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444;

    public DFSCliqueIterator_hasNext_2876699885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1450 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator$Node"));
        Object term1451 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1454 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1451, term1451.getClass(), "posMap", null);
        setField(term1451, term1451.getClass(), "graph", null);
        setField(term1451, term1451.getClass(), "vertices", null);
        setIntField(term1451, term1451.getClass(), "numVertices", -532304223);
        setIntField(term1451, term1451.getClass(), "first", 666218293);
        setField(term1451, term1451.getClass(), "bitset", null);
        setField(term1450, term1450.getClass(), "clique", term1451);
        setField(term1454, term1454.getClass(), "posMap", null);
        setField(term1454, term1454.getClass(), "graph", null);
        setField(term1454, term1454.getClass(), "vertices", null);
        setIntField(term1454, term1454.getClass(), "numVertices", -428988337);
        setIntField(term1454, term1454.getClass(), "first", 48047085);
        setField(term1454, term1454.getClass(), "bitset", null);
        setField(term1450, term1450.getClass(), "cand", term1454);
        setField(term1450, term1450.getClass(), "this$0", null);
        Object term1457 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator$Node"));
        Object term1458 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1461 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        setField(term1458, term1458.getClass(), "posMap", null);
        setField(term1458, term1458.getClass(), "graph", null);
        setField(term1458, term1458.getClass(), "vertices", null);
        setIntField(term1458, term1458.getClass(), "numVertices", -1619435313);
        setIntField(term1458, term1458.getClass(), "first", 1013801066);
        setField(term1458, term1458.getClass(), "bitset", null);
        setField(term1457, term1457.getClass(), "clique", term1458);
        setField(term1461, term1461.getClass(), "posMap", null);
        setField(term1461, term1461.getClass(), "graph", null);
        setField(term1461, term1461.getClass(), "vertices", null);
        setIntField(term1461, term1461.getClass(), "numVertices", 892205855);
        setIntField(term1461, term1461.getClass(), "first", 1955560079);
        setField(term1461, term1461.getClass(), "bitset", null);
        setField(term1457, term1457.getClass(), "cand", term1461);
        setField(term1457, term1457.getClass(), "this$0", null);
        ArrayDeque term1448 = new ArrayDeque();
        ((ArrayDeque) term1448).add(term1450);
        ((ArrayDeque) term1448).add(term1457);
        term1444 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator"));
        Object term1466 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1467 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1468 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1472 = (int[]) newIntArray(3);
        Object term1478 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1479 = (long[]) newLongArray(1);
        setIntField(term1444, term1444.getClass(), "minSize", 1798354517);
        setIntField(term1444, term1444.getClass(), "maxSize", -1495693617);
        setLongField(term1444, term1444.getClass(), "timeout", 6811161968424632369L);
        setField(term1444, term1444.getClass(), "stack", term1448);
        setField(term1467, term1467.getClass(), "table", term1468);
        setIntField(term1467, term1467.getClass(), "count", 237134844);
        setIntField(term1467, term1467.getClass(), "threshold", 15);
        setFloatField(term1467, term1467.getClass(), "loadFactor", 0.75F);
        setField(term1466, term1466.getClass(), "posMap", term1467);
        setField(term1466, term1466.getClass(), "graph", null);
        setIntElement(term1472, 0, 2076413861);
        setIntElement(term1472, 1, 66817373);
        setIntElement(term1472, 2, 1459628013);
        setField(term1466, term1466.getClass(), "vertices", term1472);
        setIntField(term1466, term1466.getClass(), "numVertices", -1641507499);
        setIntField(term1466, term1466.getClass(), "first", -33436796);
        setField(term1478, term1478.getClass(), "words", term1479);
        setIntField(term1478, term1478.getClass(), "wordsInUse", -1527326823);
        setBooleanField(term1478, term1478.getClass(), "sizeIsSticky", false);
        setField(term1466, term1466.getClass(), "bitset", term1478);
        setField(term1444, term1444.getClass(), "currentClique", term1466);
        setField(term1444, term1444.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1444, args);
    }

};


