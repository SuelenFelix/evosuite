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

public class RootedForestIsomorphism_computeIsomorphic_19571961824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3660;

    public RootedForestIsomorphism_computeIsomorphic_19571961824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3715 = new HashMap();
        Boolean term3721 = new Boolean(true);
        term3660 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3661 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3662 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3663 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3667 = (int[]) newIntArray(1);
        Object term3671 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3672 = (long[]) newLongArray(1);
        Object term3676 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3677 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3678 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3682 = (int[]) newIntArray(6);
        Object term3691 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3692 = (long[]) newLongArray(1);
        Object term3696 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3699 = (int[]) newIntArray(8);
        int[] term3708 = (int[]) newIntArray(6);
        Object term3723 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3660, term3660.getClass(), "forest1", null);
        setField(term3660, term3660.getClass(), "forest2", null);
        setField(term3662, term3662.getClass(), "table", term3663);
        setIntField(term3662, term3662.getClass(), "count", -232333014);
        setIntField(term3662, term3662.getClass(), "threshold", 15);
        setFloatField(term3662, term3662.getClass(), "loadFactor", 0.75F);
        setField(term3661, term3661.getClass(), "posMap", term3662);
        setField(term3661, term3661.getClass(), "graph", null);
        setIntElement(term3667, 0, -139694079);
        setField(term3661, term3661.getClass(), "vertices", term3667);
        setIntField(term3661, term3661.getClass(), "numVertices", -1602072035);
        setIntField(term3661, term3661.getClass(), "first", 1902624392);
        setField(term3671, term3671.getClass(), "words", term3672);
        setIntField(term3671, term3671.getClass(), "wordsInUse", 904607217);
        setBooleanField(term3671, term3671.getClass(), "sizeIsSticky", false);
        setField(term3661, term3661.getClass(), "bitset", term3671);
        setField(term3660, term3660.getClass(), "roots1", term3661);
        setField(term3677, term3677.getClass(), "table", term3678);
        setIntField(term3677, term3677.getClass(), "count", 434914590);
        setIntField(term3677, term3677.getClass(), "threshold", 15);
        setFloatField(term3677, term3677.getClass(), "loadFactor", 0.75F);
        setField(term3676, term3676.getClass(), "posMap", term3677);
        setField(term3676, term3676.getClass(), "graph", null);
        setIntElement(term3682, 0, 1983756621);
        setIntElement(term3682, 1, -2134711835);
        setIntElement(term3682, 2, -1641244494);
        setIntElement(term3682, 3, 1124282188);
        setIntElement(term3682, 4, -489441521);
        setIntElement(term3682, 5, 225873732);
        setField(term3676, term3676.getClass(), "vertices", term3682);
        setIntField(term3676, term3676.getClass(), "numVertices", 529879356);
        setIntField(term3676, term3676.getClass(), "first", 18072182);
        setField(term3691, term3691.getClass(), "words", term3692);
        setIntField(term3691, term3691.getClass(), "wordsInUse", 1544768934);
        setBooleanField(term3691, term3691.getClass(), "sizeIsSticky", true);
        setField(term3676, term3676.getClass(), "bitset", term3691);
        setField(term3660, term3660.getClass(), "roots2", term3676);
        setField(term3696, term3696.getClass(), "tree1", null);
        setField(term3696, term3696.getClass(), "tree2", null);
        setIntField(term3696, term3696.getClass(), "root1", -383508597);
        setIntField(term3696, term3696.getClass(), "root2", -819372164);
        setIntElement(term3699, 0, 958132675);
        setIntElement(term3699, 1, -689879283);
        setIntElement(term3699, 2, 1985432430);
        setIntElement(term3699, 3, -1769933499);
        setIntElement(term3699, 4, -1510932472);
        setIntElement(term3699, 5, 1970654816);
        setIntElement(term3699, 6, 1354781442);
        setIntElement(term3699, 7, -393590701);
        setField(term3696, term3696.getClass(), "labels1", term3699);
        setIntElement(term3708, 0, 86344574);
        setIntElement(term3708, 1, -829441157);
        setIntElement(term3708, 2, -1489991025);
        setIntElement(term3708, 3, -1542979444);
        setIntElement(term3708, 4, -1130401612);
        setIntElement(term3708, 5, -316771104);
        setField(term3696, term3696.getClass(), "labels2", term3708);
        setField(term3696, term3696.getClass(), "labelListToInt", term3715);
        setIntField(term3696, term3696.getClass(), "maxLabel", -1374527319);
        setField(term3696, term3696.getClass(), "isomorphic", term3721);
        setField(term3723, term3723.getClass(), "graph1", null);
        setField(term3723, term3723.getClass(), "graph2", null);
        setField(term3723, term3723.getClass(), "mapping", null);
        setField(term3723, term3723.getClass(), "inverse", null);
        setField(term3696, term3696.getClass(), "isomorphism", term3723);
        setField(term3696, term3696.getClass(), "sortingAlgorithm", null);
        setField(term3660, term3660.getClass(), "rootedTreeAlg", term3696);
        setField(term3660, term3660.getClass(), "tree1", null);
        setField(term3660, term3660.getClass(), "tree2", null);
        setIntField(term3660, term3660.getClass(), "root1", 0);
        setIntField(term3660, term3660.getClass(), "root2", 0);
        setField(term3660, term3660.getClass(), "isomorphic", null);
        setField(term3660, term3660.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term3660, args);
    }

};


