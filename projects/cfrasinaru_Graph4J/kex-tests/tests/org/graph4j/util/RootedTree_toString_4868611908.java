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
import java.util.ArrayList;
import java.lang.Object;

public class RootedTree_toString_4868611908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119367;

    public RootedTree_toString_4868611908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119378 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119379 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119383 = (int[]) newIntArray(2);
        Object term119388 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119379, term119379.getClass(), "table", null);
        setIntField(term119379, term119379.getClass(), "count", 1085421816);
        setIntField(term119379, term119379.getClass(), "threshold", 15);
        setFloatField(term119379, term119379.getClass(), "loadFactor", 0.75F);
        setField(term119378, term119378.getClass(), "posMap", term119379);
        setField(term119378, term119378.getClass(), "graph", null);
        setIntElement(term119383, 0, 1255911049);
        setIntElement(term119383, 1, -839027611);
        setField(term119378, term119378.getClass(), "vertices", term119383);
        setIntField(term119378, term119378.getClass(), "numVertices", -1124162495);
        setIntField(term119378, term119378.getClass(), "first", 1340944720);
        setField(term119388, term119388.getClass(), "words", null);
        setIntField(term119388, term119388.getClass(), "wordsInUse", -909139484);
        setBooleanField(term119388, term119388.getClass(), "sizeIsSticky", true);
        setField(term119378, term119378.getClass(), "bitset", term119388);
        Object term119391 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119392 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119396 = (int[]) newIntArray(6);
        Object term119405 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119392, term119392.getClass(), "table", null);
        setIntField(term119392, term119392.getClass(), "count", -1976139427);
        setIntField(term119392, term119392.getClass(), "threshold", 15);
        setFloatField(term119392, term119392.getClass(), "loadFactor", 0.75F);
        setField(term119391, term119391.getClass(), "posMap", term119392);
        setField(term119391, term119391.getClass(), "graph", null);
        setIntElement(term119396, 0, 303991487);
        setIntElement(term119396, 1, 1367064616);
        setIntElement(term119396, 2, 203718519);
        setIntElement(term119396, 3, 537247387);
        setIntElement(term119396, 4, 1914948652);
        setIntElement(term119396, 5, -239857621);
        setField(term119391, term119391.getClass(), "vertices", term119396);
        setIntField(term119391, term119391.getClass(), "numVertices", 1772736429);
        setIntField(term119391, term119391.getClass(), "first", -1816339027);
        setField(term119405, term119405.getClass(), "words", null);
        setIntField(term119405, term119405.getClass(), "wordsInUse", -1235548167);
        setBooleanField(term119405, term119405.getClass(), "sizeIsSticky", true);
        setField(term119391, term119391.getClass(), "bitset", term119405);
        Object term119408 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119409 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119413 = (int[]) newIntArray(7);
        Object term119423 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119409, term119409.getClass(), "table", null);
        setIntField(term119409, term119409.getClass(), "count", -1314719002);
        setIntField(term119409, term119409.getClass(), "threshold", 15);
        setFloatField(term119409, term119409.getClass(), "loadFactor", 0.75F);
        setField(term119408, term119408.getClass(), "posMap", term119409);
        setField(term119408, term119408.getClass(), "graph", null);
        setIntElement(term119413, 0, -1170411431);
        setIntElement(term119413, 1, 1088952067);
        setIntElement(term119413, 2, 472610780);
        setIntElement(term119413, 3, -2133619302);
        setIntElement(term119413, 4, 1552095995);
        setIntElement(term119413, 5, -1747718939);
        setIntElement(term119413, 6, 1965173166);
        setField(term119408, term119408.getClass(), "vertices", term119413);
        setIntField(term119408, term119408.getClass(), "numVertices", 1581877075);
        setIntField(term119408, term119408.getClass(), "first", 1615268673);
        setField(term119423, term119423.getClass(), "words", null);
        setIntField(term119423, term119423.getClass(), "wordsInUse", 1152887206);
        setBooleanField(term119423, term119423.getClass(), "sizeIsSticky", false);
        setField(term119408, term119408.getClass(), "bitset", term119423);
        Object term119426 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119427 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119431 = (int[]) newIntArray(0);
        Object term119434 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119427, term119427.getClass(), "table", null);
        setIntField(term119427, term119427.getClass(), "count", 1901884310);
        setIntField(term119427, term119427.getClass(), "threshold", 15);
        setFloatField(term119427, term119427.getClass(), "loadFactor", 0.75F);
        setField(term119426, term119426.getClass(), "posMap", term119427);
        setField(term119426, term119426.getClass(), "graph", null);
        setField(term119426, term119426.getClass(), "vertices", term119431);
        setIntField(term119426, term119426.getClass(), "numVertices", -178445255);
        setIntField(term119426, term119426.getClass(), "first", 304875983);
        setField(term119434, term119434.getClass(), "words", null);
        setIntField(term119434, term119434.getClass(), "wordsInUse", 1800211738);
        setBooleanField(term119434, term119434.getClass(), "sizeIsSticky", true);
        setField(term119426, term119426.getClass(), "bitset", term119434);
        ArrayList term119376 = new ArrayList();
        ((ArrayList) term119376).add(term119378);
        ((ArrayList) term119376).add(term119391);
        ((ArrayList) term119376).add(term119408);
        ((ArrayList) term119376).add(term119426);
        term119367 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term119369 = (int[]) newIntArray(6);
        setField(term119367, term119367.getClass(), "tree", null);
        setIntField(term119367, term119367.getClass(), "root", -1285624829);
        setIntElement(term119369, 0, -575933303);
        setIntElement(term119369, 1, 220842489);
        setIntElement(term119369, 2, 509983681);
        setIntElement(term119369, 3, 949160032);
        setIntElement(term119369, 4, -663146155);
        setIntElement(term119369, 5, -756879395);
        setField(term119367, term119367.getClass(), "parents", term119369);
        setField(term119367, term119367.getClass(), "levels", term119376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term119367, args);
    }

};


