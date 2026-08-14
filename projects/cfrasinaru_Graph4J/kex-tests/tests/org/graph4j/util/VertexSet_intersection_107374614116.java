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

public class VertexSet_intersection_107374614116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8294;
     Object term8308;

    public VertexSet_intersection_107374614116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8294 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8295 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8296 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8300 = (int[]) newIntArray(0);
        Object term8303 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8304 = (long[]) newLongArray(1);
        setField(term8295, term8295.getClass(), "table", term8296);
        setIntField(term8295, term8295.getClass(), "count", 868436312);
        setIntField(term8295, term8295.getClass(), "threshold", 15);
        setFloatField(term8295, term8295.getClass(), "loadFactor", 0.75F);
        setField(term8294, term8294.getClass(), "posMap", term8295);
        setField(term8294, term8294.getClass(), "graph", null);
        setField(term8294, term8294.getClass(), "vertices", term8300);
        setIntField(term8294, term8294.getClass(), "numVertices", 1737963071);
        setIntField(term8294, term8294.getClass(), "first", 6456997);
        setField(term8303, term8303.getClass(), "words", term8304);
        setIntField(term8303, term8303.getClass(), "wordsInUse", -797269627);
        setBooleanField(term8303, term8303.getClass(), "sizeIsSticky", false);
        setField(term8294, term8294.getClass(), "bitset", term8303);
        term8308 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term8309 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8310 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8314 = (int[]) newIntArray(6);
        Object term8323 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8324 = (long[]) newLongArray(1);
        setField(term8309, term8309.getClass(), "table", term8310);
        setIntField(term8309, term8309.getClass(), "count", -224331928);
        setIntField(term8309, term8309.getClass(), "threshold", 15);
        setFloatField(term8309, term8309.getClass(), "loadFactor", 0.75F);
        setField(term8308, term8308.getClass(), "posMap", term8309);
        setField(term8308, term8308.getClass(), "graph", null);
        setIntElement(term8314, 0, -587857163);
        setIntElement(term8314, 1, -2018093075);
        setIntElement(term8314, 2, 135879009);
        setIntElement(term8314, 3, 1923027847);
        setIntElement(term8314, 4, -1652693609);
        setIntElement(term8314, 5, -824893512);
        setField(term8308, term8308.getClass(), "vertices", term8314);
        setIntField(term8308, term8308.getClass(), "numVertices", -55435071);
        setIntField(term8308, term8308.getClass(), "first", -673356166);
        setField(term8323, term8323.getClass(), "words", term8324);
        setIntField(term8323, term8323.getClass(), "wordsInUse", 1876812694);
        setBooleanField(term8323, term8323.getClass(), "sizeIsSticky", true);
        setField(term8308, term8308.getClass(), "bitset", term8323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term8308;
        callMethod(klass, "intersection", argTypes, term8294, args);
    }

};


