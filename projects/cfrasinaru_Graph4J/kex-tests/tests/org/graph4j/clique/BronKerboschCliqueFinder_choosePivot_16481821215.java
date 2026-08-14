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
import java.util.ArrayList;

public class BronKerboschCliqueFinder_choosePivot_16481821215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151319;
     Object term151362;
     Object term151384;

    public BronKerboschCliqueFinder_choosePivot_16481821215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151344 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151345 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term151349 = (int[]) newIntArray(5);
        Object term151357 = newInstance(Class.forName("java.util.BitSet"));
        setField(term151345, term151345.getClass(), "table", null);
        setIntField(term151345, term151345.getClass(), "count", 1548079341);
        setIntField(term151345, term151345.getClass(), "threshold", 15);
        setFloatField(term151345, term151345.getClass(), "loadFactor", 0.75F);
        setField(term151344, term151344.getClass(), "posMap", term151345);
        setField(term151344, term151344.getClass(), "graph", null);
        setIntElement(term151349, 0, -1472400718);
        setIntElement(term151349, 1, -717179943);
        setIntElement(term151349, 2, 1497882035);
        setIntElement(term151349, 3, -1133081533);
        setIntElement(term151349, 4, 631516496);
        setField(term151344, term151344.getClass(), "vertices", term151349);
        setIntField(term151344, term151344.getClass(), "numVertices", -451078480);
        setIntField(term151344, term151344.getClass(), "first", 334308864);
        setField(term151357, term151357.getClass(), "words", null);
        setIntField(term151357, term151357.getClass(), "wordsInUse", 100189984);
        setBooleanField(term151357, term151357.getClass(), "sizeIsSticky", false);
        setField(term151344, term151344.getClass(), "bitset", term151357);
        ArrayList term151342 = new ArrayList();
        ((ArrayList) term151342).add(term151344);
        term151319 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueFinder"));
        Object term151320 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151321 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151322 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151326 = (int[]) newIntArray(8);
        Object term151337 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151338 = (long[]) newLongArray(1);
        setField(term151321, term151321.getClass(), "table", term151322);
        setIntField(term151321, term151321.getClass(), "count", 26718308);
        setIntField(term151321, term151321.getClass(), "threshold", 15);
        setFloatField(term151321, term151321.getClass(), "loadFactor", 0.75F);
        setField(term151320, term151320.getClass(), "posMap", term151321);
        setField(term151320, term151320.getClass(), "graph", null);
        setIntElement(term151326, 0, -1336791063);
        setIntElement(term151326, 1, -188219720);
        setIntElement(term151326, 2, -2110965014);
        setIntElement(term151326, 3, -659938719);
        setIntElement(term151326, 4, 1853775967);
        setIntElement(term151326, 5, -64024898);
        setIntElement(term151326, 6, 1256299609);
        setIntElement(term151326, 7, 1359753506);
        setField(term151320, term151320.getClass(), "vertices", term151326);
        setIntField(term151320, term151320.getClass(), "numVertices", 27475221);
        setIntField(term151320, term151320.getClass(), "first", -156622655);
        setField(term151337, term151337.getClass(), "words", term151338);
        setIntField(term151337, term151337.getClass(), "wordsInUse", 1370645079);
        setBooleanField(term151337, term151337.getClass(), "sizeIsSticky", false);
        setField(term151320, term151320.getClass(), "bitset", term151337);
        setField(term151319, term151319.getClass(), "workingClique", term151320);
        setField(term151319, term151319.getClass(), "cliques", term151342);
        setField(term151319, term151319.getClass(), "graph", null);
        term151362 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term151363 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151364 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151368 = (int[]) newIntArray(8);
        Object term151379 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151380 = (long[]) newLongArray(1);
        setField(term151363, term151363.getClass(), "table", term151364);
        setIntField(term151363, term151363.getClass(), "count", 498127983);
        setIntField(term151363, term151363.getClass(), "threshold", 15);
        setFloatField(term151363, term151363.getClass(), "loadFactor", 0.75F);
        setField(term151362, term151362.getClass(), "posMap", term151363);
        setField(term151362, term151362.getClass(), "graph", null);
        setIntElement(term151368, 0, -442259867);
        setIntElement(term151368, 1, 539408554);
        setIntElement(term151368, 2, 2095018624);
        setIntElement(term151368, 3, 1211634221);
        setIntElement(term151368, 4, -343631949);
        setIntElement(term151368, 5, 1462465865);
        setIntElement(term151368, 6, -1499663323);
        setIntElement(term151368, 7, 168237491);
        setField(term151362, term151362.getClass(), "vertices", term151368);
        setIntField(term151362, term151362.getClass(), "numVertices", 1556000338);
        setIntField(term151362, term151362.getClass(), "first", 1392544569);
        setField(term151379, term151379.getClass(), "words", term151380);
        setIntField(term151379, term151379.getClass(), "wordsInUse", -674609513);
        setBooleanField(term151379, term151379.getClass(), "sizeIsSticky", false);
        setField(term151362, term151362.getClass(), "bitset", term151379);
        term151384 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term151385 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151386 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151390 = (int[]) newIntArray(2);
        Object term151395 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151396 = (long[]) newLongArray(1);
        setField(term151385, term151385.getClass(), "table", term151386);
        setIntField(term151385, term151385.getClass(), "count", -1256234766);
        setIntField(term151385, term151385.getClass(), "threshold", 15);
        setFloatField(term151385, term151385.getClass(), "loadFactor", 0.75F);
        setField(term151384, term151384.getClass(), "posMap", term151385);
        setField(term151384, term151384.getClass(), "graph", null);
        setIntElement(term151390, 0, -1341421924);
        setIntElement(term151390, 1, 1424895082);
        setField(term151384, term151384.getClass(), "vertices", term151390);
        setIntField(term151384, term151384.getClass(), "numVertices", -537815700);
        setIntField(term151384, term151384.getClass(), "first", -1123008113);
        setField(term151395, term151395.getClass(), "words", term151396);
        setIntField(term151395, term151395.getClass(), "wordsInUse", 915690868);
        setBooleanField(term151395, term151395.getClass(), "sizeIsSticky", false);
        setField(term151384, term151384.getClass(), "bitset", term151395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term151362;
        args[1] = term151384;
        callMethod(klass, "choosePivot", argTypes, term151319, args);
    }

};


