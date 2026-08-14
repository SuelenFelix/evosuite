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

public class RootedTree_leaves_13989585336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6898;

    public RootedTree_leaves_13989585336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6903 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6904 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6908 = (int[]) newIntArray(5);
        Object term6916 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6904, term6904.getClass(), "table", null);
        setIntField(term6904, term6904.getClass(), "count", 1875252647);
        setIntField(term6904, term6904.getClass(), "threshold", 15);
        setFloatField(term6904, term6904.getClass(), "loadFactor", 0.75F);
        setField(term6903, term6903.getClass(), "posMap", term6904);
        setField(term6903, term6903.getClass(), "graph", null);
        setIntElement(term6908, 0, -1298688401);
        setIntElement(term6908, 1, 1907832341);
        setIntElement(term6908, 2, 932199784);
        setIntElement(term6908, 3, 1953620444);
        setIntElement(term6908, 4, -1111307978);
        setField(term6903, term6903.getClass(), "vertices", term6908);
        setIntField(term6903, term6903.getClass(), "numVertices", 609697271);
        setIntField(term6903, term6903.getClass(), "first", 1121247998);
        setField(term6916, term6916.getClass(), "words", null);
        setIntField(term6916, term6916.getClass(), "wordsInUse", -710001354);
        setBooleanField(term6916, term6916.getClass(), "sizeIsSticky", true);
        setField(term6903, term6903.getClass(), "bitset", term6916);
        Object term6919 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6920 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6924 = (int[]) newIntArray(8);
        Object term6935 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6920, term6920.getClass(), "table", null);
        setIntField(term6920, term6920.getClass(), "count", 2007404429);
        setIntField(term6920, term6920.getClass(), "threshold", 15);
        setFloatField(term6920, term6920.getClass(), "loadFactor", 0.75F);
        setField(term6919, term6919.getClass(), "posMap", term6920);
        setField(term6919, term6919.getClass(), "graph", null);
        setIntElement(term6924, 0, 472580433);
        setIntElement(term6924, 1, 1189049164);
        setIntElement(term6924, 2, -673413879);
        setIntElement(term6924, 3, 1609778442);
        setIntElement(term6924, 4, 524850421);
        setIntElement(term6924, 5, -1833121756);
        setIntElement(term6924, 6, -1493632787);
        setIntElement(term6924, 7, -1056969264);
        setField(term6919, term6919.getClass(), "vertices", term6924);
        setIntField(term6919, term6919.getClass(), "numVertices", -709130701);
        setIntField(term6919, term6919.getClass(), "first", 86144663);
        setField(term6935, term6935.getClass(), "words", null);
        setIntField(term6935, term6935.getClass(), "wordsInUse", -1480903995);
        setBooleanField(term6935, term6935.getClass(), "sizeIsSticky", false);
        setField(term6919, term6919.getClass(), "bitset", term6935);
        Object term6938 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6939 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6943 = (int[]) newIntArray(9);
        Object term6955 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6939, term6939.getClass(), "table", null);
        setIntField(term6939, term6939.getClass(), "count", -2111772603);
        setIntField(term6939, term6939.getClass(), "threshold", 15);
        setFloatField(term6939, term6939.getClass(), "loadFactor", 0.75F);
        setField(term6938, term6938.getClass(), "posMap", term6939);
        setField(term6938, term6938.getClass(), "graph", null);
        setIntElement(term6943, 0, 637942911);
        setIntElement(term6943, 1, -395396657);
        setIntElement(term6943, 2, 1677171453);
        setIntElement(term6943, 3, -2108979704);
        setIntElement(term6943, 4, 1629835601);
        setIntElement(term6943, 5, 1866184476);
        setIntElement(term6943, 6, -17998574);
        setIntElement(term6943, 7, 145080354);
        setIntElement(term6943, 8, -2087321012);
        setField(term6938, term6938.getClass(), "vertices", term6943);
        setIntField(term6938, term6938.getClass(), "numVertices", -1613074612);
        setIntField(term6938, term6938.getClass(), "first", 1054908502);
        setField(term6955, term6955.getClass(), "words", null);
        setIntField(term6955, term6955.getClass(), "wordsInUse", -1226802566);
        setBooleanField(term6955, term6955.getClass(), "sizeIsSticky", false);
        setField(term6938, term6938.getClass(), "bitset", term6955);
        ArrayList term6901 = new ArrayList();
        ((ArrayList) term6901).add(term6903);
        ((ArrayList) term6901).add(term6919);
        ((ArrayList) term6901).add(term6938);
        term6898 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term6900 = (int[]) newIntArray(0);
        setField(term6898, term6898.getClass(), "tree", null);
        setIntField(term6898, term6898.getClass(), "root", 1674165862);
        setField(term6898, term6898.getClass(), "parents", term6900);
        setField(term6898, term6898.getClass(), "levels", term6901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leaves", argTypes, term6898, args);
    }

};


