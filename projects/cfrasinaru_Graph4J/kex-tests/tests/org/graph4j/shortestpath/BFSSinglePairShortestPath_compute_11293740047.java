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

public class BFSSinglePairShortestPath_compute_11293740047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2620;

    public BFSSinglePairShortestPath_compute_11293740047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2620 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2623 = (int[]) newIntArray(6);
        Object term2630 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2632 = (int[]) newIntArray(8);
        Object term2643 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2644 = (long[]) newLongArray(1);
        setIntField(term2620, term2620.getClass(), "source", 612177768);
        setIntField(term2620, term2620.getClass(), "target", -1626451656);
        setIntElement(term2623, 0, 173952451);
        setIntElement(term2623, 1, -1972033388);
        setIntElement(term2623, 2, -1005024758);
        setIntElement(term2623, 3, 2634669);
        setIntElement(term2623, 4, -1912429941);
        setIntElement(term2623, 5, 1801052257);
        setField(term2620, term2620.getClass(), "forbiddenVertices", term2623);
        setIntField(term2630, term2630.getClass(), "numEdges", -2110556060);
        setField(term2630, term2630.getClass(), "graph", null);
        setIntElement(term2632, 0, 313459791);
        setIntElement(term2632, 1, 752615112);
        setIntElement(term2632, 2, -1674430871);
        setIntElement(term2632, 3, 794352120);
        setIntElement(term2632, 4, 340719678);
        setIntElement(term2632, 5, 299791142);
        setIntElement(term2632, 6, 1862191391);
        setIntElement(term2632, 7, 1131398807);
        setField(term2630, term2630.getClass(), "vertices", term2632);
        setIntField(term2630, term2630.getClass(), "numVertices", -344907703);
        setIntField(term2630, term2630.getClass(), "first", 824341437);
        setField(term2643, term2643.getClass(), "words", term2644);
        setIntField(term2643, term2643.getClass(), "wordsInUse", -1794965320);
        setBooleanField(term2643, term2643.getClass(), "sizeIsSticky", false);
        setField(term2630, term2630.getClass(), "bitset", term2643);
        setField(term2620, term2620.getClass(), "bestPath", term2630);
        setDoubleField(term2620, term2620.getClass(), "bestWeight", 0.10126144382177782);
        setField(term2620, term2620.getClass(), "graph", null);
        setBooleanField(term2620, term2620.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2620, args);
    }

};


