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

public class TreeIsomorphism_computeIsomorphic_16923254503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2876;

    public TreeIsomorphism_computeIsomorphic_16923254503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2889 = new HashMap();
        Boolean term2895 = new Boolean(true);
        Boolean term2905 = new Boolean(true);
        term2876 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        Object term2877 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term2880 = (int[]) newIntArray(5);
        int[] term2886 = (int[]) newIntArray(2);
        Object term2897 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term2898 = (int[]) newIntArray(0);
        int[] term2899 = (int[]) newIntArray(5);
        Object term2907 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term2876, term2876.getClass(), "tree1", null);
        setField(term2876, term2876.getClass(), "tree2", null);
        setField(term2877, term2877.getClass(), "tree1", null);
        setField(term2877, term2877.getClass(), "tree2", null);
        setIntField(term2877, term2877.getClass(), "root1", 777492093);
        setIntField(term2877, term2877.getClass(), "root2", 1414025609);
        setIntElement(term2880, 0, 255145822);
        setIntElement(term2880, 1, -573608449);
        setIntElement(term2880, 2, -1660057757);
        setIntElement(term2880, 3, 1816273440);
        setIntElement(term2880, 4, -96541009);
        setField(term2877, term2877.getClass(), "labels1", term2880);
        setIntElement(term2886, 0, -43719302);
        setIntElement(term2886, 1, 1024134939);
        setField(term2877, term2877.getClass(), "labels2", term2886);
        setField(term2877, term2877.getClass(), "labelListToInt", term2889);
        setIntField(term2877, term2877.getClass(), "maxLabel", 109078154);
        setField(term2877, term2877.getClass(), "isomorphic", term2895);
        setField(term2897, term2897.getClass(), "graph1", null);
        setField(term2897, term2897.getClass(), "graph2", null);
        setField(term2897, term2897.getClass(), "mapping", term2898);
        setIntElement(term2899, 0, -314165467);
        setIntElement(term2899, 1, 963694071);
        setIntElement(term2899, 2, -995785731);
        setIntElement(term2899, 3, 1349815364);
        setIntElement(term2899, 4, 2128383340);
        setField(term2897, term2897.getClass(), "inverse", term2899);
        setField(term2877, term2877.getClass(), "isomorphism", term2897);
        setField(term2877, term2877.getClass(), "sortingAlgorithm", null);
        setField(term2876, term2876.getClass(), "rootedAlg", term2877);
        setField(term2876, term2876.getClass(), "isomorphic", term2905);
        setField(term2907, term2907.getClass(), "graph1", null);
        setField(term2907, term2907.getClass(), "graph2", null);
        setField(term2907, term2907.getClass(), "mapping", null);
        setField(term2907, term2907.getClass(), "inverse", null);
        setField(term2876, term2876.getClass(), "isomorphism", term2907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term2876, args);
    }

};


