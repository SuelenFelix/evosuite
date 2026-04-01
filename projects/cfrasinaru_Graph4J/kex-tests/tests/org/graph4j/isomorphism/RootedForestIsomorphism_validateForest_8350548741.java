package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class RootedForestIsomorphism_validateForest_8350548741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;
     Object term3438;

    public RootedForestIsomorphism_validateForest_8350548741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3427 = new HashMap();
        Boolean term3433 = new Boolean(true);
        term3368 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3369 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3370 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3371 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3375 = (int[]) newIntArray(8);
        Object term3386 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3387 = (long[]) newLongArray(1);
        Object term3391 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3392 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3393 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3397 = (int[]) newIntArray(7);
        Object term3407 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3408 = (long[]) newLongArray(1);
        Object term3412 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3415 = (int[]) newIntArray(3);
        int[] term3419 = (int[]) newIntArray(7);
        Object term3435 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3368, term3368.getClass(), "forest1", null);
        setField(term3368, term3368.getClass(), "forest2", null);
        setField(term3370, term3370.getClass(), "table", term3371);
        setIntField(term3370, term3370.getClass(), "count", 654195547);
        setIntField(term3370, term3370.getClass(), "threshold", 15);
        setFloatField(term3370, term3370.getClass(), "loadFactor", 0.75F);
        setField(term3369, term3369.getClass(), "posMap", term3370);
        setField(term3369, term3369.getClass(), "graph", null);
        setIntElement(term3375, 0, 1622857008);
        setIntElement(term3375, 1, 934338954);
        setIntElement(term3375, 2, 598635505);
        setIntElement(term3375, 3, -944986533);
        setIntElement(term3375, 4, 1894454926);
        setIntElement(term3375, 5, 1415142780);
        setIntElement(term3375, 6, -574105759);
        setIntElement(term3375, 7, -1165271567);
        setField(term3369, term3369.getClass(), "vertices", term3375);
        setIntField(term3369, term3369.getClass(), "numVertices", 376834234);
        setIntField(term3369, term3369.getClass(), "first", -1911972560);
        setField(term3386, term3386.getClass(), "words", term3387);
        setIntField(term3386, term3386.getClass(), "wordsInUse", -642716895);
        setBooleanField(term3386, term3386.getClass(), "sizeIsSticky", true);
        setField(term3369, term3369.getClass(), "bitset", term3386);
        setField(term3368, term3368.getClass(), "roots1", term3369);
        setField(term3392, term3392.getClass(), "table", term3393);
        setIntField(term3392, term3392.getClass(), "count", 1743398246);
        setIntField(term3392, term3392.getClass(), "threshold", 15);
        setFloatField(term3392, term3392.getClass(), "loadFactor", 0.75F);
        setField(term3391, term3391.getClass(), "posMap", term3392);
        setField(term3391, term3391.getClass(), "graph", null);
        setIntElement(term3397, 0, -934658823);
        setIntElement(term3397, 1, 1632177303);
        setIntElement(term3397, 2, -802592348);
        setIntElement(term3397, 3, -1576584269);
        setIntElement(term3397, 4, 1474899591);
        setIntElement(term3397, 5, 297582552);
        setIntElement(term3397, 6, -1485916498);
        setField(term3391, term3391.getClass(), "vertices", term3397);
        setIntField(term3391, term3391.getClass(), "numVertices", 722787672);
        setIntField(term3391, term3391.getClass(), "first", 2077491675);
        setField(term3407, term3407.getClass(), "words", term3408);
        setIntField(term3407, term3407.getClass(), "wordsInUse", -1728316609);
        setBooleanField(term3407, term3407.getClass(), "sizeIsSticky", true);
        setField(term3391, term3391.getClass(), "bitset", term3407);
        setField(term3368, term3368.getClass(), "roots2", term3391);
        setField(term3412, term3412.getClass(), "tree1", null);
        setField(term3412, term3412.getClass(), "tree2", null);
        setIntField(term3412, term3412.getClass(), "root1", 47118909);
        setIntField(term3412, term3412.getClass(), "root2", -2093707412);
        setIntElement(term3415, 0, -680627153);
        setIntElement(term3415, 1, 722519669);
        setIntElement(term3415, 2, -40335961);
        setField(term3412, term3412.getClass(), "labels1", term3415);
        setIntElement(term3419, 0, 175343605);
        setIntElement(term3419, 1, 1050853183);
        setIntElement(term3419, 2, 848428785);
        setIntElement(term3419, 3, -1984436481);
        setIntElement(term3419, 4, -407582855);
        setIntElement(term3419, 5, 1190753616);
        setIntElement(term3419, 6, -752378450);
        setField(term3412, term3412.getClass(), "labels2", term3419);
        setField(term3412, term3412.getClass(), "labelListToInt", term3427);
        setIntField(term3412, term3412.getClass(), "maxLabel", 848907965);
        setField(term3412, term3412.getClass(), "isomorphic", term3433);
        setField(term3435, term3435.getClass(), "graph1", null);
        setField(term3435, term3435.getClass(), "graph2", null);
        setField(term3435, term3435.getClass(), "mapping", null);
        setField(term3435, term3435.getClass(), "inverse", null);
        setField(term3412, term3412.getClass(), "isomorphism", term3435);
        setField(term3412, term3412.getClass(), "sortingAlgorithm", null);
        setField(term3368, term3368.getClass(), "rootedTreeAlg", term3412);
        setField(term3368, term3368.getClass(), "tree1", null);
        setField(term3368, term3368.getClass(), "tree2", null);
        setIntField(term3368, term3368.getClass(), "root1", 0);
        setIntField(term3368, term3368.getClass(), "root2", 0);
        setField(term3368, term3368.getClass(), "isomorphic", null);
        setField(term3368, term3368.getClass(), "isomorphism", null);
        term3438 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3439 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3440 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3444 = (int[]) newIntArray(8);
        Object term3455 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3456 = (long[]) newLongArray(1);
        setField(term3439, term3439.getClass(), "table", term3440);
        setIntField(term3439, term3439.getClass(), "count", 1865070548);
        setIntField(term3439, term3439.getClass(), "threshold", 15);
        setFloatField(term3439, term3439.getClass(), "loadFactor", 0.75F);
        setField(term3438, term3438.getClass(), "posMap", term3439);
        setField(term3438, term3438.getClass(), "graph", null);
        setIntElement(term3444, 0, 1904515443);
        setIntElement(term3444, 1, 1361126430);
        setIntElement(term3444, 2, 1728588701);
        setIntElement(term3444, 3, -355769268);
        setIntElement(term3444, 4, -114460662);
        setIntElement(term3444, 5, -355376034);
        setIntElement(term3444, 6, 588390599);
        setIntElement(term3444, 7, -95969566);
        setField(term3438, term3438.getClass(), "vertices", term3444);
        setIntField(term3438, term3438.getClass(), "numVertices", -68615285);
        setIntField(term3438, term3438.getClass(), "first", -337504086);
        setField(term3455, term3455.getClass(), "words", term3456);
        setIntField(term3455, term3455.getClass(), "wordsInUse", 2074130991);
        setBooleanField(term3455, term3455.getClass(), "sizeIsSticky", true);
        setField(term3438, term3438.getClass(), "bitset", term3455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3438;
        callMethod(klass, "validateForest", argTypes, term3368, args);
    }

};


