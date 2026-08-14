package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Clique_checkEdges_18718319776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7580;

    public Clique_checkEdges_18718319776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7580 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term7581 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term7582 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term7586 = (int[]) newIntArray(0);
        Object term7589 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7590 = (long[]) newLongArray(1);
        setField(term7581, term7581.getClass(), "table", term7582);
        setIntField(term7581, term7581.getClass(), "count", 957091706);
        setIntField(term7581, term7581.getClass(), "threshold", 15);
        setFloatField(term7581, term7581.getClass(), "loadFactor", 0.75F);
        setField(term7580, term7580.getClass(), "posMap", term7581);
        setField(term7580, term7580.getClass(), "graph", null);
        setField(term7580, term7580.getClass(), "vertices", term7586);
        setIntField(term7580, term7580.getClass(), "numVertices", -2011802805);
        setIntField(term7580, term7580.getClass(), "first", -1683802689);
        setField(term7589, term7589.getClass(), "words", term7590);
        setIntField(term7589, term7589.getClass(), "wordsInUse", -1949346221);
        setBooleanField(term7589, term7589.getClass(), "sizeIsSticky", false);
        setField(term7580, term7580.getClass(), "bitset", term7589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term7580, args);
    }

};


