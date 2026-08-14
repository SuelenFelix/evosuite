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

public class TreeExtremaCalculator_getCenter_8323784712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11453;

    public TreeExtremaCalculator_getCenter_8323784712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11455 = new Integer(454281060);
        term11453 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11457 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11458 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11459 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11463 = (int[]) newIntArray(8);
        Object term11474 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11475 = (long[]) newLongArray(1);
        Object term11479 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11480 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11481 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11485 = (int[]) newIntArray(4);
        Object term11492 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11493 = (long[]) newLongArray(1);
        setIntField(term11453, term11453.getClass(), "startVertex", -434230943);
        setField(term11453, term11453.getClass(), "diameter", term11455);
        setField(term11458, term11458.getClass(), "table", term11459);
        setIntField(term11458, term11458.getClass(), "count", 698633875);
        setIntField(term11458, term11458.getClass(), "threshold", 15);
        setFloatField(term11458, term11458.getClass(), "loadFactor", 0.75F);
        setField(term11457, term11457.getClass(), "posMap", term11458);
        setField(term11457, term11457.getClass(), "graph", null);
        setIntElement(term11463, 0, 548468113);
        setIntElement(term11463, 1, 1701819905);
        setIntElement(term11463, 2, 1721418943);
        setIntElement(term11463, 3, -111082612);
        setIntElement(term11463, 4, 1253334988);
        setIntElement(term11463, 5, 1086709736);
        setIntElement(term11463, 6, -1606698075);
        setIntElement(term11463, 7, 90996421);
        setField(term11457, term11457.getClass(), "vertices", term11463);
        setIntField(term11457, term11457.getClass(), "numVertices", -1805802783);
        setIntField(term11457, term11457.getClass(), "first", -529831900);
        setField(term11474, term11474.getClass(), "words", term11475);
        setIntField(term11474, term11474.getClass(), "wordsInUse", 1574493440);
        setBooleanField(term11474, term11474.getClass(), "sizeIsSticky", true);
        setField(term11457, term11457.getClass(), "bitset", term11474);
        setField(term11453, term11453.getClass(), "center", term11457);
        setField(term11480, term11480.getClass(), "table", term11481);
        setIntField(term11480, term11480.getClass(), "count", 1854694585);
        setIntField(term11480, term11480.getClass(), "threshold", 15);
        setFloatField(term11480, term11480.getClass(), "loadFactor", 0.75F);
        setField(term11479, term11479.getClass(), "posMap", term11480);
        setField(term11479, term11479.getClass(), "graph", null);
        setIntElement(term11485, 0, -1260562836);
        setIntElement(term11485, 1, 694100722);
        setIntElement(term11485, 2, -680529431);
        setIntElement(term11485, 3, 212698793);
        setField(term11479, term11479.getClass(), "vertices", term11485);
        setIntField(term11479, term11479.getClass(), "numVertices", 1169519385);
        setIntField(term11479, term11479.getClass(), "first", 1846078344);
        setField(term11492, term11492.getClass(), "words", term11493);
        setIntField(term11492, term11492.getClass(), "wordsInUse", 1692543802);
        setBooleanField(term11492, term11492.getClass(), "sizeIsSticky", true);
        setField(term11479, term11479.getClass(), "bitset", term11492);
        setField(term11453, term11453.getClass(), "periphery", term11479);
        setField(term11453, term11453.getClass(), "graph", null);
        setBooleanField(term11453, term11453.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenter", argTypes, term11453, args);
    }

};


