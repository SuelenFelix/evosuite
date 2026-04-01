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
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;

public class RootedTreeIsomorphism_findIsomorphism_4476989713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11928;

    public RootedTreeIsomorphism_findIsomorphism_4476989713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11934 = new HashMap();
        Boolean term11940 = new Boolean(false);
        term11928 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term11931 = (int[]) newIntArray(0);
        int[] term11932 = (int[]) newIntArray(1);
        Object term11942 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term11943 = (int[]) newIntArray(6);
        int[] term11950 = (int[]) newIntArray(2);
        setField(term11928, term11928.getClass(), "tree1", null);
        setField(term11928, term11928.getClass(), "tree2", null);
        setIntField(term11928, term11928.getClass(), "root1", 1848496553);
        setIntField(term11928, term11928.getClass(), "root2", 79714955);
        setField(term11928, term11928.getClass(), "labels1", term11931);
        setIntElement(term11932, 0, -1409613044);
        setField(term11928, term11928.getClass(), "labels2", term11932);
        setField(term11928, term11928.getClass(), "labelListToInt", term11934);
        setIntField(term11928, term11928.getClass(), "maxLabel", -1594530234);
        setField(term11928, term11928.getClass(), "isomorphic", term11940);
        setField(term11942, term11942.getClass(), "graph1", null);
        setField(term11942, term11942.getClass(), "graph2", null);
        setIntElement(term11943, 0, -414324261);
        setIntElement(term11943, 1, -1729893211);
        setIntElement(term11943, 2, -1648760670);
        setIntElement(term11943, 3, 590703291);
        setIntElement(term11943, 4, -2033199492);
        setIntElement(term11943, 5, 350096397);
        setField(term11942, term11942.getClass(), "mapping", term11943);
        setIntElement(term11950, 0, -325295536);
        setIntElement(term11950, 1, -411068820);
        setField(term11942, term11942.getClass(), "inverse", term11950);
        setField(term11928, term11928.getClass(), "isomorphism", term11942);
        setField(term11928, term11928.getClass(), "sortingAlgorithm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findIsomorphism", argTypes, term11928, args);
    }

};


