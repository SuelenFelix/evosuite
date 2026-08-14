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
import java.lang.Integer;

public class StableSet_checkEdge_2876211444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8771;
     Object term8790;
     Object term8792;

    public StableSet_checkEdge_2876211444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8771 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term8772 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8773 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term8777 = (int[]) newIntArray(5);
        Object term8785 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8786 = (long[]) newLongArray(1);
        setField(term8772, term8772.getClass(), "table", term8773);
        setIntField(term8772, term8772.getClass(), "count", 1997285343);
        setIntField(term8772, term8772.getClass(), "threshold", 15);
        setFloatField(term8772, term8772.getClass(), "loadFactor", 0.75F);
        setField(term8771, term8771.getClass(), "posMap", term8772);
        setField(term8771, term8771.getClass(), "graph", null);
        setIntElement(term8777, 0, -1814671855);
        setIntElement(term8777, 1, -614200166);
        setIntElement(term8777, 2, 1243129119);
        setIntElement(term8777, 3, 346014220);
        setIntElement(term8777, 4, 1379438950);
        setField(term8771, term8771.getClass(), "vertices", term8777);
        setIntField(term8771, term8771.getClass(), "numVertices", 1932258686);
        setIntField(term8771, term8771.getClass(), "first", -261366507);
        setField(term8785, term8785.getClass(), "words", term8786);
        setIntField(term8785, term8785.getClass(), "wordsInUse", 1015444772);
        setBooleanField(term8785, term8785.getClass(), "sizeIsSticky", true);
        setField(term8771, term8771.getClass(), "bitset", term8785);
        term8790 = new Integer(-815684619);
        term8792 = new Integer(-471499395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8790;
        args[1] = term8792;
        callMethod(klass, "checkEdge", argTypes, term8771, args);
    }

};


