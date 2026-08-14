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

public class ForestIsomorphism_areIsomorphic_7821058741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025;

    public ForestIsomorphism_areIsomorphic_7821058741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3037 = new HashMap();
        Boolean term3043 = new Boolean(false);
        Boolean term3060 = new Boolean(true);
        term3025 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        Object term3026 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3029 = (int[]) newIntArray(0);
        int[] term3030 = (int[]) newIntArray(6);
        Object term3045 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3046 = (int[]) newIntArray(7);
        int[] term3054 = (int[]) newIntArray(5);
        Object term3062 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3025, term3025.getClass(), "forest1", null);
        setField(term3025, term3025.getClass(), "forest2", null);
        setField(term3026, term3026.getClass(), "tree1", null);
        setField(term3026, term3026.getClass(), "tree2", null);
        setIntField(term3026, term3026.getClass(), "root1", -751079123);
        setIntField(term3026, term3026.getClass(), "root2", -110837188);
        setField(term3026, term3026.getClass(), "labels1", term3029);
        setIntElement(term3030, 0, -271094506);
        setIntElement(term3030, 1, 455632030);
        setIntElement(term3030, 2, -1632929393);
        setIntElement(term3030, 3, -431440129);
        setIntElement(term3030, 4, -763576148);
        setIntElement(term3030, 5, 1568948514);
        setField(term3026, term3026.getClass(), "labels2", term3030);
        setField(term3026, term3026.getClass(), "labelListToInt", term3037);
        setIntField(term3026, term3026.getClass(), "maxLabel", -1511130237);
        setField(term3026, term3026.getClass(), "isomorphic", term3043);
        setField(term3045, term3045.getClass(), "graph1", null);
        setField(term3045, term3045.getClass(), "graph2", null);
        setIntElement(term3046, 0, 452088587);
        setIntElement(term3046, 1, -1630069454);
        setIntElement(term3046, 2, 1499735894);
        setIntElement(term3046, 3, 716486048);
        setIntElement(term3046, 4, -466708718);
        setIntElement(term3046, 5, 1038029515);
        setIntElement(term3046, 6, 1137154606);
        setField(term3045, term3045.getClass(), "mapping", term3046);
        setIntElement(term3054, 0, -100681578);
        setIntElement(term3054, 1, 296568835);
        setIntElement(term3054, 2, 1431951992);
        setIntElement(term3054, 3, -1608123016);
        setIntElement(term3054, 4, -896473214);
        setField(term3045, term3045.getClass(), "inverse", term3054);
        setField(term3026, term3026.getClass(), "isomorphism", term3045);
        setField(term3026, term3026.getClass(), "sortingAlgorithm", null);
        setField(term3025, term3025.getClass(), "rootedTreeAlg", term3026);
        setField(term3025, term3025.getClass(), "isomorphic", term3060);
        setField(term3062, term3062.getClass(), "graph1", null);
        setField(term3062, term3062.getClass(), "graph2", null);
        setField(term3062, term3062.getClass(), "mapping", null);
        setField(term3062, term3062.getClass(), "inverse", null);
        setField(term3025, term3025.getClass(), "isomorphism", term3062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "areIsomorphic", argTypes, term3025, args);
    }

};


