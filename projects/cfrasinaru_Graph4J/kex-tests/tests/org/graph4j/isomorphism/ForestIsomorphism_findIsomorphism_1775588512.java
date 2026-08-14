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

public class ForestIsomorphism_findIsomorphism_1775588512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3081;

    public ForestIsomorphism_findIsomorphism_1775588512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3097 = new HashMap();
        Boolean term3103 = new Boolean(false);
        Boolean term3114 = new Boolean(true);
        term3081 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        Object term3082 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3085 = (int[]) newIntArray(8);
        int[] term3094 = (int[]) newIntArray(2);
        Object term3105 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3106 = (int[]) newIntArray(4);
        int[] term3111 = (int[]) newIntArray(2);
        Object term3116 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3081, term3081.getClass(), "forest1", null);
        setField(term3081, term3081.getClass(), "forest2", null);
        setField(term3082, term3082.getClass(), "tree1", null);
        setField(term3082, term3082.getClass(), "tree2", null);
        setIntField(term3082, term3082.getClass(), "root1", 401203924);
        setIntField(term3082, term3082.getClass(), "root2", -1212399479);
        setIntElement(term3085, 0, 2107679041);
        setIntElement(term3085, 1, 2040965507);
        setIntElement(term3085, 2, -1281083262);
        setIntElement(term3085, 3, 1059930704);
        setIntElement(term3085, 4, -1967153290);
        setIntElement(term3085, 5, -1397251956);
        setIntElement(term3085, 6, -796934571);
        setIntElement(term3085, 7, 405295896);
        setField(term3082, term3082.getClass(), "labels1", term3085);
        setIntElement(term3094, 0, -814977075);
        setIntElement(term3094, 1, 808614267);
        setField(term3082, term3082.getClass(), "labels2", term3094);
        setField(term3082, term3082.getClass(), "labelListToInt", term3097);
        setIntField(term3082, term3082.getClass(), "maxLabel", 1611734632);
        setField(term3082, term3082.getClass(), "isomorphic", term3103);
        setField(term3105, term3105.getClass(), "graph1", null);
        setField(term3105, term3105.getClass(), "graph2", null);
        setIntElement(term3106, 0, 868908117);
        setIntElement(term3106, 1, 1789351397);
        setIntElement(term3106, 2, 2145528170);
        setIntElement(term3106, 3, -585773976);
        setField(term3105, term3105.getClass(), "mapping", term3106);
        setIntElement(term3111, 0, 852806940);
        setIntElement(term3111, 1, 698551724);
        setField(term3105, term3105.getClass(), "inverse", term3111);
        setField(term3082, term3082.getClass(), "isomorphism", term3105);
        setField(term3082, term3082.getClass(), "sortingAlgorithm", null);
        setField(term3081, term3081.getClass(), "rootedTreeAlg", term3082);
        setField(term3081, term3081.getClass(), "isomorphic", term3114);
        setField(term3116, term3116.getClass(), "graph1", null);
        setField(term3116, term3116.getClass(), "graph2", null);
        setField(term3116, term3116.getClass(), "mapping", null);
        setField(term3116, term3116.getClass(), "inverse", null);
        setField(term3081, term3081.getClass(), "isomorphism", term3116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findIsomorphism", argTypes, term3081, args);
    }

};


