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

public class BFSSinglePairShortestPath_compute_11293740046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2615;

    public BFSSinglePairShortestPath_compute_11293740046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2615 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term2618 = (int[]) newIntArray(6);
        Object term2625 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term2627 = (int[]) newIntArray(8);
        Object term2638 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2639 = (long[]) newLongArray(1);
        setIntField(term2615, term2615.getClass(), "source", 612177768);
        setIntField(term2615, term2615.getClass(), "target", -1626451656);
        setIntElement(term2618, 0, 173952451);
        setIntElement(term2618, 1, -1972033388);
        setIntElement(term2618, 2, -1005024758);
        setIntElement(term2618, 3, 2634669);
        setIntElement(term2618, 4, -1912429941);
        setIntElement(term2618, 5, 1801052257);
        setField(term2615, term2615.getClass(), "forbiddenVertices", term2618);
        setIntField(term2625, term2625.getClass(), "numEdges", -2110556060);
        setField(term2625, term2625.getClass(), "graph", null);
        setIntElement(term2627, 0, 313459791);
        setIntElement(term2627, 1, 752615112);
        setIntElement(term2627, 2, -1674430871);
        setIntElement(term2627, 3, 794352120);
        setIntElement(term2627, 4, 340719678);
        setIntElement(term2627, 5, 299791142);
        setIntElement(term2627, 6, 1862191391);
        setIntElement(term2627, 7, 1131398807);
        setField(term2625, term2625.getClass(), "vertices", term2627);
        setIntField(term2625, term2625.getClass(), "numVertices", -344907703);
        setIntField(term2625, term2625.getClass(), "first", 824341437);
        setField(term2638, term2638.getClass(), "words", term2639);
        setIntField(term2638, term2638.getClass(), "wordsInUse", -1794965320);
        setBooleanField(term2638, term2638.getClass(), "sizeIsSticky", false);
        setField(term2625, term2625.getClass(), "bitset", term2638);
        setField(term2615, term2615.getClass(), "bestPath", term2625);
        setDoubleField(term2615, term2615.getClass(), "bestWeight", 0.10126144382177782);
        setField(term2615, term2615.getClass(), "graph", null);
        setBooleanField(term2615, term2615.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term2615, args);
    }

};


