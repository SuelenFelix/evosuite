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

public class RootedTree_height_10620447845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119034;

    public RootedTree_height_10620447845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119041 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119042 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119046 = (int[]) newIntArray(1);
        Object term119050 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119042, term119042.getClass(), "table", null);
        setIntField(term119042, term119042.getClass(), "count", -1643361354);
        setIntField(term119042, term119042.getClass(), "threshold", 15);
        setFloatField(term119042, term119042.getClass(), "loadFactor", 0.75F);
        setField(term119041, term119041.getClass(), "posMap", term119042);
        setField(term119041, term119041.getClass(), "graph", null);
        setIntElement(term119046, 0, 904240893);
        setField(term119041, term119041.getClass(), "vertices", term119046);
        setIntField(term119041, term119041.getClass(), "numVertices", 1068238371);
        setIntField(term119041, term119041.getClass(), "first", -842184632);
        setField(term119050, term119050.getClass(), "words", null);
        setIntField(term119050, term119050.getClass(), "wordsInUse", 210567920);
        setBooleanField(term119050, term119050.getClass(), "sizeIsSticky", true);
        setField(term119041, term119041.getClass(), "bitset", term119050);
        Object term119053 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119054 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119058 = (int[]) newIntArray(1);
        Object term119062 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119054, term119054.getClass(), "table", null);
        setIntField(term119054, term119054.getClass(), "count", -609764574);
        setIntField(term119054, term119054.getClass(), "threshold", 15);
        setFloatField(term119054, term119054.getClass(), "loadFactor", 0.75F);
        setField(term119053, term119053.getClass(), "posMap", term119054);
        setField(term119053, term119053.getClass(), "graph", null);
        setIntElement(term119058, 0, 1358153489);
        setField(term119053, term119053.getClass(), "vertices", term119058);
        setIntField(term119053, term119053.getClass(), "numVertices", 2010586898);
        setIntField(term119053, term119053.getClass(), "first", 1026821857);
        setField(term119062, term119062.getClass(), "words", null);
        setIntField(term119062, term119062.getClass(), "wordsInUse", -1030821042);
        setBooleanField(term119062, term119062.getClass(), "sizeIsSticky", true);
        setField(term119053, term119053.getClass(), "bitset", term119062);
        Object term119065 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119066 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119070 = (int[]) newIntArray(8);
        Object term119081 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119066, term119066.getClass(), "table", null);
        setIntField(term119066, term119066.getClass(), "count", 1812520602);
        setIntField(term119066, term119066.getClass(), "threshold", 15);
        setFloatField(term119066, term119066.getClass(), "loadFactor", 0.75F);
        setField(term119065, term119065.getClass(), "posMap", term119066);
        setField(term119065, term119065.getClass(), "graph", null);
        setIntElement(term119070, 0, 1925351875);
        setIntElement(term119070, 1, -1474043899);
        setIntElement(term119070, 2, 423668511);
        setIntElement(term119070, 3, -1555050440);
        setIntElement(term119070, 4, 2053958383);
        setIntElement(term119070, 5, 124039507);
        setIntElement(term119070, 6, -1637246125);
        setIntElement(term119070, 7, 953018273);
        setField(term119065, term119065.getClass(), "vertices", term119070);
        setIntField(term119065, term119065.getClass(), "numVertices", 1043145184);
        setIntField(term119065, term119065.getClass(), "first", -1527042419);
        setField(term119081, term119081.getClass(), "words", null);
        setIntField(term119081, term119081.getClass(), "wordsInUse", 1732365199);
        setBooleanField(term119081, term119081.getClass(), "sizeIsSticky", true);
        setField(term119065, term119065.getClass(), "bitset", term119081);
        Object term119084 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119085 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119089 = (int[]) newIntArray(8);
        Object term119100 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119085, term119085.getClass(), "table", null);
        setIntField(term119085, term119085.getClass(), "count", -143476420);
        setIntField(term119085, term119085.getClass(), "threshold", 15);
        setFloatField(term119085, term119085.getClass(), "loadFactor", 0.75F);
        setField(term119084, term119084.getClass(), "posMap", term119085);
        setField(term119084, term119084.getClass(), "graph", null);
        setIntElement(term119089, 0, 1903653889);
        setIntElement(term119089, 1, -1802327080);
        setIntElement(term119089, 2, -278569893);
        setIntElement(term119089, 3, 1737799120);
        setIntElement(term119089, 4, 1401694335);
        setIntElement(term119089, 5, 198886031);
        setIntElement(term119089, 6, 1057406321);
        setIntElement(term119089, 7, -1795766914);
        setField(term119084, term119084.getClass(), "vertices", term119089);
        setIntField(term119084, term119084.getClass(), "numVertices", 2046933548);
        setIntField(term119084, term119084.getClass(), "first", 2120312659);
        setField(term119100, term119100.getClass(), "words", null);
        setIntField(term119100, term119100.getClass(), "wordsInUse", 1762659383);
        setBooleanField(term119100, term119100.getClass(), "sizeIsSticky", false);
        setField(term119084, term119084.getClass(), "bitset", term119100);
        ArrayList term119039 = new ArrayList();
        ((ArrayList) term119039).add(term119041);
        ((ArrayList) term119039).add(term119053);
        ((ArrayList) term119039).add(term119065);
        ((ArrayList) term119039).add(term119084);
        term119034 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term119036 = (int[]) newIntArray(2);
        setField(term119034, term119034.getClass(), "tree", null);
        setIntField(term119034, term119034.getClass(), "root", 1350650589);
        setIntElement(term119036, 0, 1874378587);
        setIntElement(term119036, 1, 1851606122);
        setField(term119034, term119034.getClass(), "parents", term119036);
        setField(term119034, term119034.getClass(), "levels", term119039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "height", argTypes, term119034, args);
    }

};


