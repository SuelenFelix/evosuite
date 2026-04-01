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

public class TreeIsomorphism_findIsomorphism_5044181722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2846;

    public TreeIsomorphism_findIsomorphism_5044181722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2855 = new HashMap();
        Boolean term2861 = new Boolean(false);
        Boolean term2868 = new Boolean(false);
        term2846 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        Object term2847 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term2850 = (int[]) newIntArray(2);
        int[] term2853 = (int[]) newIntArray(1);
        Object term2863 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term2864 = (int[]) newIntArray(0);
        int[] term2865 = (int[]) newIntArray(2);
        Object term2870 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term2846, term2846.getClass(), "tree1", null);
        setField(term2846, term2846.getClass(), "tree2", null);
        setField(term2847, term2847.getClass(), "tree1", null);
        setField(term2847, term2847.getClass(), "tree2", null);
        setIntField(term2847, term2847.getClass(), "root1", 273590437);
        setIntField(term2847, term2847.getClass(), "root2", -348612876);
        setIntElement(term2850, 0, 1302807565);
        setIntElement(term2850, 1, -838848221);
        setField(term2847, term2847.getClass(), "labels1", term2850);
        setIntElement(term2853, 0, 1163761623);
        setField(term2847, term2847.getClass(), "labels2", term2853);
        setField(term2847, term2847.getClass(), "labelListToInt", term2855);
        setIntField(term2847, term2847.getClass(), "maxLabel", 718742281);
        setField(term2847, term2847.getClass(), "isomorphic", term2861);
        setField(term2863, term2863.getClass(), "graph1", null);
        setField(term2863, term2863.getClass(), "graph2", null);
        setField(term2863, term2863.getClass(), "mapping", term2864);
        setIntElement(term2865, 0, 1532723756);
        setIntElement(term2865, 1, -124088550);
        setField(term2863, term2863.getClass(), "inverse", term2865);
        setField(term2847, term2847.getClass(), "isomorphism", term2863);
        setField(term2847, term2847.getClass(), "sortingAlgorithm", null);
        setField(term2846, term2846.getClass(), "rootedAlg", term2847);
        setField(term2846, term2846.getClass(), "isomorphic", term2868);
        setField(term2870, term2870.getClass(), "graph1", null);
        setField(term2870, term2870.getClass(), "graph2", null);
        setField(term2870, term2870.getClass(), "mapping", null);
        setField(term2870, term2870.getClass(), "inverse", null);
        setField(term2846, term2846.getClass(), "isomorphism", term2870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findIsomorphism", argTypes, term2846, args);
    }

};


