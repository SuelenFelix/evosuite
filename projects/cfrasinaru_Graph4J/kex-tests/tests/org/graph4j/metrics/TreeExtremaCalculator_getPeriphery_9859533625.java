package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class TreeExtremaCalculator_getPeriphery_9859533625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11624;

    public TreeExtremaCalculator_getPeriphery_9859533625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11626 = new Integer(-1048298087);
        term11624 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11628 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11629 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11630 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11634 = (int[]) newIntArray(4);
        Object term11641 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11642 = (long[]) newLongArray(1);
        Object term11646 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11647 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11648 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11652 = (int[]) newIntArray(2);
        Object term11657 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11658 = (long[]) newLongArray(1);
        setIntField(term11624, term11624.getClass(), "startVertex", 1871761182);
        setField(term11624, term11624.getClass(), "diameter", term11626);
        setField(term11629, term11629.getClass(), "table", term11630);
        setIntField(term11629, term11629.getClass(), "count", 233983728);
        setIntField(term11629, term11629.getClass(), "threshold", 15);
        setFloatField(term11629, term11629.getClass(), "loadFactor", 0.75F);
        setField(term11628, term11628.getClass(), "posMap", term11629);
        setField(term11628, term11628.getClass(), "graph", null);
        setIntElement(term11634, 0, -1650132476);
        setIntElement(term11634, 1, 1719680265);
        setIntElement(term11634, 2, -1890898783);
        setIntElement(term11634, 3, 1357632911);
        setField(term11628, term11628.getClass(), "vertices", term11634);
        setIntField(term11628, term11628.getClass(), "numVertices", 1768195761);
        setIntField(term11628, term11628.getClass(), "first", -1382661134);
        setField(term11641, term11641.getClass(), "words", term11642);
        setIntField(term11641, term11641.getClass(), "wordsInUse", -1042022818);
        setBooleanField(term11641, term11641.getClass(), "sizeIsSticky", false);
        setField(term11628, term11628.getClass(), "bitset", term11641);
        setField(term11624, term11624.getClass(), "center", term11628);
        setField(term11647, term11647.getClass(), "table", term11648);
        setIntField(term11647, term11647.getClass(), "count", 317372051);
        setIntField(term11647, term11647.getClass(), "threshold", 15);
        setFloatField(term11647, term11647.getClass(), "loadFactor", 0.75F);
        setField(term11646, term11646.getClass(), "posMap", term11647);
        setField(term11646, term11646.getClass(), "graph", null);
        setIntElement(term11652, 0, 892170444);
        setIntElement(term11652, 1, -82417507);
        setField(term11646, term11646.getClass(), "vertices", term11652);
        setIntField(term11646, term11646.getClass(), "numVertices", -511400358);
        setIntField(term11646, term11646.getClass(), "first", -742178468);
        setField(term11657, term11657.getClass(), "words", term11658);
        setIntField(term11657, term11657.getClass(), "wordsInUse", 694989162);
        setBooleanField(term11657, term11657.getClass(), "sizeIsSticky", false);
        setField(term11646, term11646.getClass(), "bitset", term11657);
        setField(term11624, term11624.getClass(), "periphery", term11646);
        setField(term11624, term11624.getClass(), "graph", null);
        setBooleanField(term11624, term11624.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeriphery", argTypes, term11624, args);
    }

};


