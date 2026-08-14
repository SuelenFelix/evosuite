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

public class RootedTree_isValid_5272124219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7311;

    public RootedTree_isValid_5272124219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7320 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7321 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7325 = (int[]) newIntArray(3);
        Object term7331 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7321, term7321.getClass(), "table", null);
        setIntField(term7321, term7321.getClass(), "count", -2117930201);
        setIntField(term7321, term7321.getClass(), "threshold", 15);
        setFloatField(term7321, term7321.getClass(), "loadFactor", 0.75F);
        setField(term7320, term7320.getClass(), "posMap", term7321);
        setField(term7320, term7320.getClass(), "graph", null);
        setIntElement(term7325, 0, 1839150896);
        setIntElement(term7325, 1, -1487860516);
        setIntElement(term7325, 2, 784631129);
        setField(term7320, term7320.getClass(), "vertices", term7325);
        setIntField(term7320, term7320.getClass(), "numVertices", 658285959);
        setIntField(term7320, term7320.getClass(), "first", -89362706);
        setField(term7331, term7331.getClass(), "words", null);
        setIntField(term7331, term7331.getClass(), "wordsInUse", 341388367);
        setBooleanField(term7331, term7331.getClass(), "sizeIsSticky", false);
        setField(term7320, term7320.getClass(), "bitset", term7331);
        Object term7334 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7335 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7339 = (int[]) newIntArray(0);
        Object term7342 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7335, term7335.getClass(), "table", null);
        setIntField(term7335, term7335.getClass(), "count", 1078807592);
        setIntField(term7335, term7335.getClass(), "threshold", 15);
        setFloatField(term7335, term7335.getClass(), "loadFactor", 0.75F);
        setField(term7334, term7334.getClass(), "posMap", term7335);
        setField(term7334, term7334.getClass(), "graph", null);
        setField(term7334, term7334.getClass(), "vertices", term7339);
        setIntField(term7334, term7334.getClass(), "numVertices", 1673044047);
        setIntField(term7334, term7334.getClass(), "first", -1835617743);
        setField(term7342, term7342.getClass(), "words", null);
        setIntField(term7342, term7342.getClass(), "wordsInUse", -337695922);
        setBooleanField(term7342, term7342.getClass(), "sizeIsSticky", true);
        setField(term7334, term7334.getClass(), "bitset", term7342);
        Object term7345 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7346 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7350 = (int[]) newIntArray(3);
        Object term7356 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7346, term7346.getClass(), "table", null);
        setIntField(term7346, term7346.getClass(), "count", 817836900);
        setIntField(term7346, term7346.getClass(), "threshold", 15);
        setFloatField(term7346, term7346.getClass(), "loadFactor", 0.75F);
        setField(term7345, term7345.getClass(), "posMap", term7346);
        setField(term7345, term7345.getClass(), "graph", null);
        setIntElement(term7350, 0, 1691654567);
        setIntElement(term7350, 1, -1604942135);
        setIntElement(term7350, 2, 2000275611);
        setField(term7345, term7345.getClass(), "vertices", term7350);
        setIntField(term7345, term7345.getClass(), "numVertices", 2060369122);
        setIntField(term7345, term7345.getClass(), "first", -1275204506);
        setField(term7356, term7356.getClass(), "words", null);
        setIntField(term7356, term7356.getClass(), "wordsInUse", 507439888);
        setBooleanField(term7356, term7356.getClass(), "sizeIsSticky", false);
        setField(term7345, term7345.getClass(), "bitset", term7356);
        Object term7359 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7360 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7364 = (int[]) newIntArray(3);
        Object term7370 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7360, term7360.getClass(), "table", null);
        setIntField(term7360, term7360.getClass(), "count", 1936798149);
        setIntField(term7360, term7360.getClass(), "threshold", 15);
        setFloatField(term7360, term7360.getClass(), "loadFactor", 0.75F);
        setField(term7359, term7359.getClass(), "posMap", term7360);
        setField(term7359, term7359.getClass(), "graph", null);
        setIntElement(term7364, 0, 188304401);
        setIntElement(term7364, 1, -40613160);
        setIntElement(term7364, 2, 1359973218);
        setField(term7359, term7359.getClass(), "vertices", term7364);
        setIntField(term7359, term7359.getClass(), "numVertices", -218759803);
        setIntField(term7359, term7359.getClass(), "first", 1288936083);
        setField(term7370, term7370.getClass(), "words", null);
        setIntField(term7370, term7370.getClass(), "wordsInUse", 4086209);
        setBooleanField(term7370, term7370.getClass(), "sizeIsSticky", false);
        setField(term7359, term7359.getClass(), "bitset", term7370);
        Object term7373 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7374 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7378 = (int[]) newIntArray(9);
        Object term7390 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7374, term7374.getClass(), "table", null);
        setIntField(term7374, term7374.getClass(), "count", 300964556);
        setIntField(term7374, term7374.getClass(), "threshold", 15);
        setFloatField(term7374, term7374.getClass(), "loadFactor", 0.75F);
        setField(term7373, term7373.getClass(), "posMap", term7374);
        setField(term7373, term7373.getClass(), "graph", null);
        setIntElement(term7378, 0, -958207893);
        setIntElement(term7378, 1, 674390543);
        setIntElement(term7378, 2, 1472100258);
        setIntElement(term7378, 3, 12681987);
        setIntElement(term7378, 4, -1987364934);
        setIntElement(term7378, 5, 1364414277);
        setIntElement(term7378, 6, -961137606);
        setIntElement(term7378, 7, 795205527);
        setIntElement(term7378, 8, 600958607);
        setField(term7373, term7373.getClass(), "vertices", term7378);
        setIntField(term7373, term7373.getClass(), "numVertices", 897159778);
        setIntField(term7373, term7373.getClass(), "first", -1934934961);
        setField(term7390, term7390.getClass(), "words", null);
        setIntField(term7390, term7390.getClass(), "wordsInUse", 2120054887);
        setBooleanField(term7390, term7390.getClass(), "sizeIsSticky", true);
        setField(term7373, term7373.getClass(), "bitset", term7390);
        Object term7393 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term7394 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term7398 = (int[]) newIntArray(0);
        Object term7401 = newInstance(Class.forName("java.util.BitSet"));
        setField(term7394, term7394.getClass(), "table", null);
        setIntField(term7394, term7394.getClass(), "count", 2145648967);
        setIntField(term7394, term7394.getClass(), "threshold", 15);
        setFloatField(term7394, term7394.getClass(), "loadFactor", 0.75F);
        setField(term7393, term7393.getClass(), "posMap", term7394);
        setField(term7393, term7393.getClass(), "graph", null);
        setField(term7393, term7393.getClass(), "vertices", term7398);
        setIntField(term7393, term7393.getClass(), "numVertices", 2060624021);
        setIntField(term7393, term7393.getClass(), "first", -1853309523);
        setField(term7401, term7401.getClass(), "words", null);
        setIntField(term7401, term7401.getClass(), "wordsInUse", 241741655);
        setBooleanField(term7401, term7401.getClass(), "sizeIsSticky", true);
        setField(term7393, term7393.getClass(), "bitset", term7401);
        ArrayList term7318 = new ArrayList();
        ((ArrayList) term7318).add(term7320);
        ((ArrayList) term7318).add(term7334);
        ((ArrayList) term7318).add(term7345);
        ((ArrayList) term7318).add(term7359);
        ((ArrayList) term7318).add(term7373);
        ((ArrayList) term7318).add(term7393);
        term7311 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term7313 = (int[]) newIntArray(4);
        setField(term7311, term7311.getClass(), "tree", null);
        setIntField(term7311, term7311.getClass(), "root", 1504187156);
        setIntElement(term7313, 0, -1713723083);
        setIntElement(term7313, 1, -1337690242);
        setIntElement(term7313, 2, 264872152);
        setIntElement(term7313, 3, 1645751151);
        setField(term7311, term7311.getClass(), "parents", term7313);
        setField(term7311, term7311.getClass(), "levels", term7318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term7311, args);
    }

};


