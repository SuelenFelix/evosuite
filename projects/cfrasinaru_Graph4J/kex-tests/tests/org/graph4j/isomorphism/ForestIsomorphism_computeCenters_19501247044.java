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
import java.util.LinkedList;

public class ForestIsomorphism_computeCenters_19501247044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3179;
     Object term3222;

    public ForestIsomorphism_computeCenters_19501247044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3198 = new HashMap();
        Boolean term3204 = new Boolean(true);
        Boolean term3219 = new Boolean(true);
        term3179 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        Object term3180 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3183 = (int[]) newIntArray(4);
        int[] term3188 = (int[]) newIntArray(9);
        Object term3206 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term3207 = (int[]) newIntArray(4);
        int[] term3212 = (int[]) newIntArray(6);
        Object term3221 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3179, term3179.getClass(), "forest1", null);
        setField(term3179, term3179.getClass(), "forest2", null);
        setField(term3180, term3180.getClass(), "tree1", null);
        setField(term3180, term3180.getClass(), "tree2", null);
        setIntField(term3180, term3180.getClass(), "root1", -1858909368);
        setIntField(term3180, term3180.getClass(), "root2", -280113263);
        setIntElement(term3183, 0, 529625347);
        setIntElement(term3183, 1, 1409095253);
        setIntElement(term3183, 2, 315179039);
        setIntElement(term3183, 3, -1835923897);
        setField(term3180, term3180.getClass(), "labels1", term3183);
        setIntElement(term3188, 0, -341287775);
        setIntElement(term3188, 1, -1651110911);
        setIntElement(term3188, 2, -1934033808);
        setIntElement(term3188, 3, 950322609);
        setIntElement(term3188, 4, -2023791789);
        setIntElement(term3188, 5, 353974456);
        setIntElement(term3188, 6, -485108462);
        setIntElement(term3188, 7, 1418551216);
        setIntElement(term3188, 8, -626779272);
        setField(term3180, term3180.getClass(), "labels2", term3188);
        setField(term3180, term3180.getClass(), "labelListToInt", term3198);
        setIntField(term3180, term3180.getClass(), "maxLabel", -1150062870);
        setField(term3180, term3180.getClass(), "isomorphic", term3204);
        setField(term3206, term3206.getClass(), "graph1", null);
        setField(term3206, term3206.getClass(), "graph2", null);
        setIntElement(term3207, 0, -886200503);
        setIntElement(term3207, 1, 1136393691);
        setIntElement(term3207, 2, -1288536479);
        setIntElement(term3207, 3, 1092038167);
        setField(term3206, term3206.getClass(), "mapping", term3207);
        setIntElement(term3212, 0, 1879729823);
        setIntElement(term3212, 1, 1443855558);
        setIntElement(term3212, 2, -1933419449);
        setIntElement(term3212, 3, -1804322375);
        setIntElement(term3212, 4, 1595814906);
        setIntElement(term3212, 5, -834193529);
        setField(term3206, term3206.getClass(), "inverse", term3212);
        setField(term3180, term3180.getClass(), "isomorphism", term3206);
        setField(term3180, term3180.getClass(), "sortingAlgorithm", null);
        setField(term3179, term3179.getClass(), "rootedTreeAlg", term3180);
        setField(term3179, term3179.getClass(), "isomorphic", term3219);
        setField(term3221, term3221.getClass(), "graph1", null);
        setField(term3221, term3221.getClass(), "graph2", null);
        setField(term3221, term3221.getClass(), "mapping", null);
        setField(term3221, term3221.getClass(), "inverse", null);
        setField(term3179, term3179.getClass(), "isomorphism", term3221);
        term3222 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3222;
        callMethod(klass, "computeCenters", argTypes, term3179, args);
    }

};


