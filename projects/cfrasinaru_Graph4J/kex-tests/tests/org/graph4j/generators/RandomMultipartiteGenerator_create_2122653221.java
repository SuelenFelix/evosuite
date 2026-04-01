package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RandomMultipartiteGenerator_create_2122653221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1124;

    public RandomMultipartiteGenerator_create_2122653221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1124 = newInstance(Class.forName("org.graph4j.generators.RandomMultipartiteGenerator"));
        int[] term1126 = (int[]) newIntArray(7);
        Object[] term1134 = (Object[]) newArray("org.graph4j.util.StableSet", 2);
        Object term1135 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term1136 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1137 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1141 = (int[]) newIntArray(9);
        Object term1153 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1154 = (long[]) newLongArray(1);
        Object term1158 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term1159 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term1160 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term1164 = (int[]) newIntArray(7);
        Object term1174 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1175 = (long[]) newLongArray(1);
        int[] term1179 = (int[]) newIntArray(6);
        setDoubleField(term1124, term1124.getClass(), "edgeProbability", 0.6397214730945112);
        setIntElement(term1126, 0, 1215150180);
        setIntElement(term1126, 1, -1422859977);
        setIntElement(term1126, 2, -1972436591);
        setIntElement(term1126, 3, 68922753);
        setIntElement(term1126, 4, -220791533);
        setIntElement(term1126, 5, 1741500243);
        setIntElement(term1126, 6, -2070466617);
        setField(term1124, term1124.getClass(), "numVertices", term1126);
        setField(term1136, term1136.getClass(), "table", term1137);
        setIntField(term1136, term1136.getClass(), "count", -1127721881);
        setIntField(term1136, term1136.getClass(), "threshold", 15);
        setFloatField(term1136, term1136.getClass(), "loadFactor", 0.75F);
        setField(term1135, term1135.getClass(), "posMap", term1136);
        setField(term1135, term1135.getClass(), "graph", null);
        setIntElement(term1141, 0, 1074848808);
        setIntElement(term1141, 1, -146054762);
        setIntElement(term1141, 2, 798043553);
        setIntElement(term1141, 3, 533197381);
        setIntElement(term1141, 4, 1048271679);
        setIntElement(term1141, 5, -1529797673);
        setIntElement(term1141, 6, -868676396);
        setIntElement(term1141, 7, 1922684808);
        setIntElement(term1141, 8, -2005784375);
        setField(term1135, term1135.getClass(), "vertices", term1141);
        setIntField(term1135, term1135.getClass(), "numVertices", -288604325);
        setIntField(term1135, term1135.getClass(), "first", -1268314569);
        setField(term1153, term1153.getClass(), "words", term1154);
        setIntField(term1153, term1153.getClass(), "wordsInUse", 877649659);
        setBooleanField(term1153, term1153.getClass(), "sizeIsSticky", true);
        setField(term1135, term1135.getClass(), "bitset", term1153);
        setElement(term1134, 0, term1135);
        setField(term1159, term1159.getClass(), "table", term1160);
        setIntField(term1159, term1159.getClass(), "count", -1332748804);
        setIntField(term1159, term1159.getClass(), "threshold", 15);
        setFloatField(term1159, term1159.getClass(), "loadFactor", 0.75F);
        setField(term1158, term1158.getClass(), "posMap", term1159);
        setField(term1158, term1158.getClass(), "graph", null);
        setIntElement(term1164, 0, 1774507971);
        setIntElement(term1164, 1, -1420269858);
        setIntElement(term1164, 2, -2119545015);
        setIntElement(term1164, 3, 1272542218);
        setIntElement(term1164, 4, 1209799204);
        setIntElement(term1164, 5, 1094107751);
        setIntElement(term1164, 6, 844222656);
        setField(term1158, term1158.getClass(), "vertices", term1164);
        setIntField(term1158, term1158.getClass(), "numVertices", -18216811);
        setIntField(term1158, term1158.getClass(), "first", -1813280137);
        setField(term1174, term1174.getClass(), "words", term1175);
        setIntField(term1174, term1174.getClass(), "wordsInUse", 719656595);
        setBooleanField(term1174, term1174.getClass(), "sizeIsSticky", true);
        setField(term1158, term1158.getClass(), "bitset", term1174);
        setElement(term1134, 1, term1158);
        setField(term1124, term1124.getClass(), "stableSets", term1134);
        setIntElement(term1179, 0, -1516995753);
        setIntElement(term1179, 1, -390501023);
        setIntElement(term1179, 2, -1667482829);
        setIntElement(term1179, 3, 1116576792);
        setIntElement(term1179, 4, -942194446);
        setIntElement(term1179, 5, -938508470);
        setField(term1124, term1124.getClass(), "vertices", term1179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomMultipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term1124, args);
    }

};


