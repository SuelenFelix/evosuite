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
import java.lang.Object;

public class MaximalCliqueFinder_chooseVertex_20836146753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term30;

    public MaximalCliqueFinder_chooseVertex_20836146753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.graph4j.clique.MaximalCliqueFinder"));
        boolean[] term26 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term26, 0, true);
        setBooleanElement(term26, 2, true);
        setField(term25, term25.getClass(), "visited", term26);
        setField(term25, term25.getClass(), "graph", null);
        term30 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term31 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term32 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term36 = (int[]) newIntArray(4);
        Object term43 = newInstance(Class.forName("java.util.BitSet"));
        long[] term44 = (long[]) newLongArray(1);
        setField(term31, term31.getClass(), "table", term32);
        setIntField(term31, term31.getClass(), "count", 1162663216);
        setIntField(term31, term31.getClass(), "threshold", 15);
        setFloatField(term31, term31.getClass(), "loadFactor", 0.75F);
        setField(term30, term30.getClass(), "posMap", term31);
        setField(term30, term30.getClass(), "graph", null);
        setIntElement(term36, 0, 1484323161);
        setIntElement(term36, 1, 391863371);
        setIntElement(term36, 2, -1922583790);
        setIntElement(term36, 3, -616727354);
        setField(term30, term30.getClass(), "vertices", term36);
        setIntField(term30, term30.getClass(), "numVertices", -1955890973);
        setIntField(term30, term30.getClass(), "first", -2038273078);
        setField(term43, term43.getClass(), "words", term44);
        setIntField(term43, term43.getClass(), "wordsInUse", 1227103734);
        setBooleanField(term43, term43.getClass(), "sizeIsSticky", false);
        setField(term30, term30.getClass(), "bitset", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.MaximalCliqueFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term30;
        callMethod(klass, "chooseVertex", argTypes, term25, args);
    }

};


