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
     Object term119460;

    public RootedTree_isValid_5272124219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119466 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119467 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119471 = (int[]) newIntArray(5);
        Object term119479 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119467, term119467.getClass(), "table", null);
        setIntField(term119467, term119467.getClass(), "count", -1455399102);
        setIntField(term119467, term119467.getClass(), "threshold", 15);
        setFloatField(term119467, term119467.getClass(), "loadFactor", 0.75F);
        setField(term119466, term119466.getClass(), "posMap", term119467);
        setField(term119466, term119466.getClass(), "graph", null);
        setIntElement(term119471, 0, -1590633148);
        setIntElement(term119471, 1, -38190522);
        setIntElement(term119471, 2, -2053739914);
        setIntElement(term119471, 3, -954895502);
        setIntElement(term119471, 4, -286306732);
        setField(term119466, term119466.getClass(), "vertices", term119471);
        setIntField(term119466, term119466.getClass(), "numVertices", -1837452912);
        setIntField(term119466, term119466.getClass(), "first", 1752149285);
        setField(term119479, term119479.getClass(), "words", null);
        setIntField(term119479, term119479.getClass(), "wordsInUse", -391897865);
        setBooleanField(term119479, term119479.getClass(), "sizeIsSticky", false);
        setField(term119466, term119466.getClass(), "bitset", term119479);
        Object term119482 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119483 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119487 = (int[]) newIntArray(3);
        Object term119493 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119483, term119483.getClass(), "table", null);
        setIntField(term119483, term119483.getClass(), "count", -967150129);
        setIntField(term119483, term119483.getClass(), "threshold", 15);
        setFloatField(term119483, term119483.getClass(), "loadFactor", 0.75F);
        setField(term119482, term119482.getClass(), "posMap", term119483);
        setField(term119482, term119482.getClass(), "graph", null);
        setIntElement(term119487, 0, -1298477574);
        setIntElement(term119487, 1, 2070493463);
        setIntElement(term119487, 2, -1515723538);
        setField(term119482, term119482.getClass(), "vertices", term119487);
        setIntField(term119482, term119482.getClass(), "numVertices", 1811430671);
        setIntField(term119482, term119482.getClass(), "first", 301560824);
        setField(term119493, term119493.getClass(), "words", null);
        setIntField(term119493, term119493.getClass(), "wordsInUse", -1830244942);
        setBooleanField(term119493, term119493.getClass(), "sizeIsSticky", false);
        setField(term119482, term119482.getClass(), "bitset", term119493);
        Object term119496 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119497 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119501 = (int[]) newIntArray(1);
        Object term119505 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119497, term119497.getClass(), "table", null);
        setIntField(term119497, term119497.getClass(), "count", -2054929667);
        setIntField(term119497, term119497.getClass(), "threshold", 15);
        setFloatField(term119497, term119497.getClass(), "loadFactor", 0.75F);
        setField(term119496, term119496.getClass(), "posMap", term119497);
        setField(term119496, term119496.getClass(), "graph", null);
        setIntElement(term119501, 0, 1547208430);
        setField(term119496, term119496.getClass(), "vertices", term119501);
        setIntField(term119496, term119496.getClass(), "numVertices", 2143332451);
        setIntField(term119496, term119496.getClass(), "first", 1883382194);
        setField(term119505, term119505.getClass(), "words", null);
        setIntField(term119505, term119505.getClass(), "wordsInUse", 1618154899);
        setBooleanField(term119505, term119505.getClass(), "sizeIsSticky", false);
        setField(term119496, term119496.getClass(), "bitset", term119505);
        ArrayList term119464 = new ArrayList();
        ((ArrayList) term119464).add(term119466);
        ((ArrayList) term119464).add(term119482);
        ((ArrayList) term119464).add(term119496);
        term119460 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term119462 = (int[]) newIntArray(1);
        setField(term119460, term119460.getClass(), "tree", null);
        setIntField(term119460, term119460.getClass(), "root", -1008531865);
        setIntElement(term119462, 0, -1757951451);
        setField(term119460, term119460.getClass(), "parents", term119462);
        setField(term119460, term119460.getClass(), "levels", term119464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term119460, args);
    }

};


