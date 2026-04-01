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

public class RootedForestIsomorphism_createRootedTreeAlg_3882510315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3749;

    public RootedForestIsomorphism_createRootedTreeAlg_3882510315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3809 = new HashMap();
        Boolean term3815 = new Boolean(true);
        term3749 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3750 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3751 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3752 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3756 = (int[]) newIntArray(8);
        Object term3767 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3768 = (long[]) newLongArray(1);
        Object term3772 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3773 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3774 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3778 = (int[]) newIntArray(6);
        Object term3787 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3788 = (long[]) newLongArray(1);
        Object term3792 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3795 = (int[]) newIntArray(3);
        int[] term3799 = (int[]) newIntArray(9);
        Object term3817 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3749, term3749.getClass(), "forest1", null);
        setField(term3749, term3749.getClass(), "forest2", null);
        setField(term3751, term3751.getClass(), "table", term3752);
        setIntField(term3751, term3751.getClass(), "count", -1735276919);
        setIntField(term3751, term3751.getClass(), "threshold", 15);
        setFloatField(term3751, term3751.getClass(), "loadFactor", 0.75F);
        setField(term3750, term3750.getClass(), "posMap", term3751);
        setField(term3750, term3750.getClass(), "graph", null);
        setIntElement(term3756, 0, -712023865);
        setIntElement(term3756, 1, 613256157);
        setIntElement(term3756, 2, 454242689);
        setIntElement(term3756, 3, 1798354517);
        setIntElement(term3756, 4, -1495693617);
        setIntElement(term3756, 5, -890538258);
        setIntElement(term3756, 6, -1085899912);
        setIntElement(term3756, 7, -1458980236);
        setField(term3750, term3750.getClass(), "vertices", term3756);
        setIntField(term3750, term3750.getClass(), "numVertices", 890505372);
        setIntField(term3750, term3750.getClass(), "first", 2044137055);
        setField(term3767, term3767.getClass(), "words", term3768);
        setIntField(term3767, term3767.getClass(), "wordsInUse", -1452324619);
        setBooleanField(term3767, term3767.getClass(), "sizeIsSticky", true);
        setField(term3750, term3750.getClass(), "bitset", term3767);
        setField(term3749, term3749.getClass(), "roots1", term3750);
        setField(term3773, term3773.getClass(), "table", term3774);
        setIntField(term3773, term3773.getClass(), "count", -1121709274);
        setIntField(term3773, term3773.getClass(), "threshold", 15);
        setFloatField(term3773, term3773.getClass(), "loadFactor", 0.75F);
        setField(term3772, term3772.getClass(), "posMap", term3773);
        setField(term3772, term3772.getClass(), "graph", null);
        setIntElement(term3778, 0, -532304223);
        setIntElement(term3778, 1, 666218293);
        setIntElement(term3778, 2, 1737876343);
        setIntElement(term3778, 3, -897937940);
        setIntElement(term3778, 4, 1523261232);
        setIntElement(term3778, 5, -428988337);
        setField(term3772, term3772.getClass(), "vertices", term3778);
        setIntField(term3772, term3772.getClass(), "numVertices", 48047085);
        setIntField(term3772, term3772.getClass(), "first", 1902784843);
        setField(term3787, term3787.getClass(), "words", term3788);
        setIntField(term3787, term3787.getClass(), "wordsInUse", 2021136615);
        setBooleanField(term3787, term3787.getClass(), "sizeIsSticky", true);
        setField(term3772, term3772.getClass(), "bitset", term3787);
        setField(term3749, term3749.getClass(), "roots2", term3772);
        setField(term3792, term3792.getClass(), "tree1", null);
        setField(term3792, term3792.getClass(), "tree2", null);
        setIntField(term3792, term3792.getClass(), "root1", 1778570695);
        setIntField(term3792, term3792.getClass(), "root2", -1142164411);
        setIntElement(term3795, 0, -1619435313);
        setIntElement(term3795, 1, 1013801066);
        setIntElement(term3795, 2, 1512541853);
        setField(term3792, term3792.getClass(), "labels1", term3795);
        setIntElement(term3799, 0, -965421502);
        setIntElement(term3799, 1, 1319026002);
        setIntElement(term3799, 2, -1368173231);
        setIntElement(term3799, 3, 1956006038);
        setIntElement(term3799, 4, -1062304878);
        setIntElement(term3799, 5, -1377876610);
        setIntElement(term3799, 6, -1456184732);
        setIntElement(term3799, 7, 1689228897);
        setIntElement(term3799, 8, 892205855);
        setField(term3792, term3792.getClass(), "labels2", term3799);
        setField(term3792, term3792.getClass(), "labelListToInt", term3809);
        setIntField(term3792, term3792.getClass(), "maxLabel", 1955560079);
        setField(term3792, term3792.getClass(), "isomorphic", term3815);
        setField(term3817, term3817.getClass(), "graph1", null);
        setField(term3817, term3817.getClass(), "graph2", null);
        setField(term3817, term3817.getClass(), "mapping", null);
        setField(term3817, term3817.getClass(), "inverse", null);
        setField(term3792, term3792.getClass(), "isomorphism", term3817);
        setField(term3792, term3792.getClass(), "sortingAlgorithm", null);
        setField(term3749, term3749.getClass(), "rootedTreeAlg", term3792);
        setField(term3749, term3749.getClass(), "tree1", null);
        setField(term3749, term3749.getClass(), "tree2", null);
        setIntField(term3749, term3749.getClass(), "root1", 0);
        setIntField(term3749, term3749.getClass(), "root2", 0);
        setField(term3749, term3749.getClass(), "isomorphic", null);
        setField(term3749, term3749.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createRootedTreeAlg", argTypes, term3749, args);
    }

};


