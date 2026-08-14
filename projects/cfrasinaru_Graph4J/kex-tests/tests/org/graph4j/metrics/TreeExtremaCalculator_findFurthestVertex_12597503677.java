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

public class TreeExtremaCalculator_findFurthestVertex_12597503677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11716;
     Object term11763;
     Object term11765;

    public TreeExtremaCalculator_findFurthestVertex_12597503677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11718 = new Integer(458147407);
        term11716 = newInstance(Class.forName("org.graph4j.metrics.TreeExtremaCalculator"));
        Object term11720 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11721 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11722 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11726 = (int[]) newIntArray(6);
        Object term11735 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11736 = (long[]) newLongArray(1);
        Object term11740 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term11741 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term11742 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term11746 = (int[]) newIntArray(8);
        Object term11757 = newInstance(Class.forName("java.util.BitSet"));
        long[] term11758 = (long[]) newLongArray(1);
        setIntField(term11716, term11716.getClass(), "startVertex", 1115327577);
        setField(term11716, term11716.getClass(), "diameter", term11718);
        setField(term11721, term11721.getClass(), "table", term11722);
        setIntField(term11721, term11721.getClass(), "count", 840704993);
        setIntField(term11721, term11721.getClass(), "threshold", 15);
        setFloatField(term11721, term11721.getClass(), "loadFactor", 0.75F);
        setField(term11720, term11720.getClass(), "posMap", term11721);
        setField(term11720, term11720.getClass(), "graph", null);
        setIntElement(term11726, 0, 1297035285);
        setIntElement(term11726, 1, -826239685);
        setIntElement(term11726, 2, -845551243);
        setIntElement(term11726, 3, 370671198);
        setIntElement(term11726, 4, 1426800646);
        setIntElement(term11726, 5, 954234820);
        setField(term11720, term11720.getClass(), "vertices", term11726);
        setIntField(term11720, term11720.getClass(), "numVertices", 1047346538);
        setIntField(term11720, term11720.getClass(), "first", 728436340);
        setField(term11735, term11735.getClass(), "words", term11736);
        setIntField(term11735, term11735.getClass(), "wordsInUse", 1841731593);
        setBooleanField(term11735, term11735.getClass(), "sizeIsSticky", true);
        setField(term11720, term11720.getClass(), "bitset", term11735);
        setField(term11716, term11716.getClass(), "center", term11720);
        setField(term11741, term11741.getClass(), "table", term11742);
        setIntField(term11741, term11741.getClass(), "count", -1854929057);
        setIntField(term11741, term11741.getClass(), "threshold", 15);
        setFloatField(term11741, term11741.getClass(), "loadFactor", 0.75F);
        setField(term11740, term11740.getClass(), "posMap", term11741);
        setField(term11740, term11740.getClass(), "graph", null);
        setIntElement(term11746, 0, 1703814701);
        setIntElement(term11746, 1, 1370246522);
        setIntElement(term11746, 2, -574611924);
        setIntElement(term11746, 3, 512521742);
        setIntElement(term11746, 4, 1291000976);
        setIntElement(term11746, 5, 1143522832);
        setIntElement(term11746, 6, 40965975);
        setIntElement(term11746, 7, -194718582);
        setField(term11740, term11740.getClass(), "vertices", term11746);
        setIntField(term11740, term11740.getClass(), "numVertices", 42982854);
        setIntField(term11740, term11740.getClass(), "first", -1129506480);
        setField(term11757, term11757.getClass(), "words", term11758);
        setIntField(term11757, term11757.getClass(), "wordsInUse", 301438568);
        setBooleanField(term11757, term11757.getClass(), "sizeIsSticky", false);
        setField(term11740, term11740.getClass(), "bitset", term11757);
        setField(term11716, term11716.getClass(), "periphery", term11740);
        setField(term11716, term11716.getClass(), "graph", null);
        setBooleanField(term11716, term11716.getClass(), "directed", true);
        term11763 = new Integer(-1667908453);
        term11765 = (int[]) newIntArray(6);
        setIntElement(term11765, 0, 315910438);
        setIntElement(term11765, 1, -1673157821);
        setIntElement(term11765, 2, 1217804703);
        setIntElement(term11765, 3, -1981494102);
        setIntElement(term11765, 4, -2064148945);
        setIntElement(term11765, 5, 494400151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.TreeExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11763;
        args[1] = term11765;
        callMethod(klass, "findFurthestVertex", argTypes, term11716, args);
    }

};


