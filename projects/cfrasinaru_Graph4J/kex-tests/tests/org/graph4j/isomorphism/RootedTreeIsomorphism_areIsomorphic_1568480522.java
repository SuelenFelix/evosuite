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

public class RootedTreeIsomorphism_areIsomorphic_1568480522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11884;

    public RootedTreeIsomorphism_areIsomorphic_1568480522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11893 = new HashMap();
        Boolean term11899 = new Boolean(false);
        term11884 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term11887 = (int[]) newIntArray(4);
        int[] term11892 = (int[]) newIntArray(0);
        Object term11901 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term11902 = (int[]) newIntArray(6);
        int[] term11909 = (int[]) newIntArray(4);
        setField(term11884, term11884.getClass(), "tree1", null);
        setField(term11884, term11884.getClass(), "tree2", null);
        setIntField(term11884, term11884.getClass(), "root1", -231030486);
        setIntField(term11884, term11884.getClass(), "root2", 908016119);
        setIntElement(term11887, 0, 110988463);
        setIntElement(term11887, 1, 955685902);
        setIntElement(term11887, 2, 462054815);
        setIntElement(term11887, 3, 406100677);
        setField(term11884, term11884.getClass(), "labels1", term11887);
        setField(term11884, term11884.getClass(), "labels2", term11892);
        setField(term11884, term11884.getClass(), "labelListToInt", term11893);
        setIntField(term11884, term11884.getClass(), "maxLabel", 778368290);
        setField(term11884, term11884.getClass(), "isomorphic", term11899);
        setField(term11901, term11901.getClass(), "graph1", null);
        setField(term11901, term11901.getClass(), "graph2", null);
        setIntElement(term11902, 0, 963185413);
        setIntElement(term11902, 1, 1937434591);
        setIntElement(term11902, 2, 759908235);
        setIntElement(term11902, 3, -1220035028);
        setIntElement(term11902, 4, 211574528);
        setIntElement(term11902, 5, 984819165);
        setField(term11901, term11901.getClass(), "mapping", term11902);
        setIntElement(term11909, 0, 1276438509);
        setIntElement(term11909, 1, -934156422);
        setIntElement(term11909, 2, -1644931931);
        setIntElement(term11909, 3, -1890108963);
        setField(term11901, term11901.getClass(), "inverse", term11909);
        setField(term11884, term11884.getClass(), "isomorphism", term11901);
        setField(term11884, term11884.getClass(), "sortingAlgorithm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "areIsomorphic", argTypes, term11884, args);
    }

};


