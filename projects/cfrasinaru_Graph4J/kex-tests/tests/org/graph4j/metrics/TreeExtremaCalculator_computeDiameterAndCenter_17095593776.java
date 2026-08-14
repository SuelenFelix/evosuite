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

public class TreeExtremaCalculator_computeDiameterAndCenter_17095593776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11671;

    public TreeExtremaCalculator_computeDiameterAndCenter_17095593776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11673 = new Integer(292681826);
        term11671 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11675 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11676 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11677 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11681 = (int[]) newIntArray(4);
        Object term11688 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11689 = (long[]) newLongArray(1);
        Object term11693 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11694 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11695 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11699 = (int[]) newIntArray(1);
        Object term11703 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11704 = (long[]) newLongArray(1);
        setIntField(term11671, term11671.getClass(), "startVertex", -65504209);
        setField(term11671, term11671.getClass(), "diameter", term11673);
        setField(term11676, term11676.getClass(), "table", term11677);
        setIntField(term11676, term11676.getClass(), "count", 1745199030);
        setIntField(term11676, term11676.getClass(), "threshold", 15);
        setFloatField(term11676, term11676.getClass(), "loadFactor", 0.75F);
        setField(term11675, term11675.getClass(), "posMap", term11676);
        setField(term11675, term11675.getClass(), "graph", null);
        setIntElement(term11681, 0, -1440013173);
        setIntElement(term11681, 1, -288126597);
        setIntElement(term11681, 2, -218831961);
        setIntElement(term11681, 3, 826765055);
        setField(term11675, term11675.getClass(), "vertices", term11681);
        setIntField(term11675, term11675.getClass(), "numVertices", 1358117317);
        setIntField(term11675, term11675.getClass(), "first", 229989439);
        setField(term11688, term11688.getClass(), "words", term11689);
        setIntField(term11688, term11688.getClass(), "wordsInUse", -1620126913);
        setBooleanField(term11688, term11688.getClass(), "sizeIsSticky", false);
        setField(term11675, term11675.getClass(), "bitset", term11688);
        setField(term11671, term11671.getClass(), "center", term11675);
        setField(term11694, term11694.getClass(), "table", term11695);
        setIntField(term11694, term11694.getClass(), "count", -1095121979);
        setIntField(term11694, term11694.getClass(), "threshold", 15);
        setFloatField(term11694, term11694.getClass(), "loadFactor", 0.75F);
        setField(term11693, term11693.getClass(), "posMap", term11694);
        setField(term11693, term11693.getClass(), "graph", null);
        setIntElement(term11699, 0, -1674851914);
        setField(term11693, term11693.getClass(), "vertices", term11699);
        setIntField(term11693, term11693.getClass(), "numVertices", -1891353352);
        setIntField(term11693, term11693.getClass(), "first", 113007640);
        setField(term11703, term11703.getClass(), "words", term11704);
        setIntField(term11703, term11703.getClass(), "wordsInUse", 1782226794);
        setBooleanField(term11703, term11703.getClass(), "sizeIsSticky", false);
        setField(term11693, term11693.getClass(), "bitset", term11703);
        setField(term11671, term11671.getClass(), "periphery", term11693);
        setField(term11671, term11671.getClass(), "graph", null);
        setBooleanField(term11671, term11671.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeDiameterAndCenter", argTypes, term11671, args);
    }

};


