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

public class RootedForestIsomorphism_findIsomorphism_11498638363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3587;

    public RootedForestIsomorphism_findIsomorphism_11498638363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3634 = new HashMap();
        Boolean term3640 = new Boolean(true);
        term3587 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3588 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3589 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3590 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3594 = (int[]) newIntArray(3);
        Object term3600 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3601 = (long[]) newLongArray(1);
        Object term3605 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3606 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3607 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3611 = (int[]) newIntArray(4);
        Object term3618 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3619 = (long[]) newLongArray(1);
        Object term3623 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3626 = (int[]) newIntArray(2);
        int[] term3629 = (int[]) newIntArray(4);
        Object term3642 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3587, term3587.getClass(), "forest1", null);
        setField(term3587, term3587.getClass(), "forest2", null);
        setField(term3589, term3589.getClass(), "table", term3590);
        setIntField(term3589, term3589.getClass(), "count", -20399281);
        setIntField(term3589, term3589.getClass(), "threshold", 15);
        setFloatField(term3589, term3589.getClass(), "loadFactor", 0.75F);
        setField(term3588, term3588.getClass(), "posMap", term3589);
        setField(term3588, term3588.getClass(), "graph", null);
        setIntElement(term3594, 0, -830170410);
        setIntElement(term3594, 1, -1742790308);
        setIntElement(term3594, 2, -1592093430);
        setField(term3588, term3588.getClass(), "vertices", term3594);
        setIntField(term3588, term3588.getClass(), "numVertices", 1178214545);
        setIntField(term3588, term3588.getClass(), "first", -985334541);
        setField(term3600, term3600.getClass(), "words", term3601);
        setIntField(term3600, term3600.getClass(), "wordsInUse", -1870004228);
        setBooleanField(term3600, term3600.getClass(), "sizeIsSticky", true);
        setField(term3588, term3588.getClass(), "bitset", term3600);
        setField(term3587, term3587.getClass(), "roots1", term3588);
        setField(term3606, term3606.getClass(), "table", term3607);
        setIntField(term3606, term3606.getClass(), "count", 380484139);
        setIntField(term3606, term3606.getClass(), "threshold", 15);
        setFloatField(term3606, term3606.getClass(), "loadFactor", 0.75F);
        setField(term3605, term3605.getClass(), "posMap", term3606);
        setField(term3605, term3605.getClass(), "graph", null);
        setIntElement(term3611, 0, 1822317628);
        setIntElement(term3611, 1, -608830309);
        setIntElement(term3611, 2, -537786484);
        setIntElement(term3611, 3, 263859424);
        setField(term3605, term3605.getClass(), "vertices", term3611);
        setIntField(term3605, term3605.getClass(), "numVertices", 1436978289);
        setIntField(term3605, term3605.getClass(), "first", 696225243);
        setField(term3618, term3618.getClass(), "words", term3619);
        setIntField(term3618, term3618.getClass(), "wordsInUse", -1421649118);
        setBooleanField(term3618, term3618.getClass(), "sizeIsSticky", false);
        setField(term3605, term3605.getClass(), "bitset", term3618);
        setField(term3587, term3587.getClass(), "roots2", term3605);
        setField(term3623, term3623.getClass(), "tree1", null);
        setField(term3623, term3623.getClass(), "tree2", null);
        setIntField(term3623, term3623.getClass(), "root1", -511248284);
        setIntField(term3623, term3623.getClass(), "root2", 788630042);
        setIntElement(term3626, 0, 1430066560);
        setIntElement(term3626, 1, 836734074);
        setField(term3623, term3623.getClass(), "labels1", term3626);
        setIntElement(term3629, 0, -1747711865);
        setIntElement(term3629, 1, 682812715);
        setIntElement(term3629, 2, -1092883950);
        setIntElement(term3629, 3, 950385621);
        setField(term3623, term3623.getClass(), "labels2", term3629);
        setField(term3623, term3623.getClass(), "labelListToInt", term3634);
        setIntField(term3623, term3623.getClass(), "maxLabel", -232352320);
        setField(term3623, term3623.getClass(), "isomorphic", term3640);
        setField(term3642, term3642.getClass(), "graph1", null);
        setField(term3642, term3642.getClass(), "graph2", null);
        setField(term3642, term3642.getClass(), "mapping", null);
        setField(term3642, term3642.getClass(), "inverse", null);
        setField(term3623, term3623.getClass(), "isomorphism", term3642);
        setField(term3623, term3623.getClass(), "sortingAlgorithm", null);
        setField(term3587, term3587.getClass(), "rootedTreeAlg", term3623);
        setField(term3587, term3587.getClass(), "tree1", null);
        setField(term3587, term3587.getClass(), "tree2", null);
        setIntField(term3587, term3587.getClass(), "root1", 0);
        setIntField(term3587, term3587.getClass(), "root2", 0);
        setField(term3587, term3587.getClass(), "isomorphic", null);
        setField(term3587, term3587.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findIsomorphism", argTypes, term3587, args);
    }

};


