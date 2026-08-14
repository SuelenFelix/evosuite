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

public class TreeExtremaCalculator_getRadius_7847810914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11577;

    public TreeExtremaCalculator_getRadius_7847810914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11579 = new Integer(2055867847);
        term11577 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11581 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11582 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11583 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11587 = (int[]) newIntArray(3);
        Object term11593 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11594 = (long[]) newLongArray(1);
        Object term11598 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11599 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11600 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11604 = (int[]) newIntArray(3);
        Object term11610 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11611 = (long[]) newLongArray(1);
        setIntField(term11577, term11577.getClass(), "startVertex", 638046409);
        setField(term11577, term11577.getClass(), "diameter", term11579);
        setField(term11582, term11582.getClass(), "table", term11583);
        setIntField(term11582, term11582.getClass(), "count", 427274898);
        setIntField(term11582, term11582.getClass(), "threshold", 15);
        setFloatField(term11582, term11582.getClass(), "loadFactor", 0.75F);
        setField(term11581, term11581.getClass(), "posMap", term11582);
        setField(term11581, term11581.getClass(), "graph", null);
        setIntElement(term11587, 0, -1654552020);
        setIntElement(term11587, 1, -1049546692);
        setIntElement(term11587, 2, 1397781598);
        setField(term11581, term11581.getClass(), "vertices", term11587);
        setIntField(term11581, term11581.getClass(), "numVertices", -44720365);
        setIntField(term11581, term11581.getClass(), "first", 1963632911);
        setField(term11593, term11593.getClass(), "words", term11594);
        setIntField(term11593, term11593.getClass(), "wordsInUse", -1100497683);
        setBooleanField(term11593, term11593.getClass(), "sizeIsSticky", true);
        setField(term11581, term11581.getClass(), "bitset", term11593);
        setField(term11577, term11577.getClass(), "center", term11581);
        setField(term11599, term11599.getClass(), "table", term11600);
        setIntField(term11599, term11599.getClass(), "count", 155423433);
        setIntField(term11599, term11599.getClass(), "threshold", 15);
        setFloatField(term11599, term11599.getClass(), "loadFactor", 0.75F);
        setField(term11598, term11598.getClass(), "posMap", term11599);
        setField(term11598, term11598.getClass(), "graph", null);
        setIntElement(term11604, 0, -815471632);
        setIntElement(term11604, 1, -1469668708);
        setIntElement(term11604, 2, 1796950482);
        setField(term11598, term11598.getClass(), "vertices", term11604);
        setIntField(term11598, term11598.getClass(), "numVertices", -945759470);
        setIntField(term11598, term11598.getClass(), "first", 657342039);
        setField(term11610, term11610.getClass(), "words", term11611);
        setIntField(term11610, term11610.getClass(), "wordsInUse", 1483999606);
        setBooleanField(term11610, term11610.getClass(), "sizeIsSticky", false);
        setField(term11598, term11598.getClass(), "bitset", term11610);
        setField(term11577, term11577.getClass(), "periphery", term11598);
        setField(term11577, term11577.getClass(), "graph", null);
        setBooleanField(term11577, term11577.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRadius", argTypes, term11577, args);
    }

};


