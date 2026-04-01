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
import java.lang.Integer;

public class RootedTreeIsomorphism_createLevels_18254422045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12022;
     Object term12057;

    public RootedTreeIsomorphism_createLevels_18254422045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12032 = new HashMap();
        Boolean term12038 = new Boolean(true);
        term12022 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term12025 = (int[]) newIntArray(0);
        int[] term12026 = (int[]) newIntArray(5);
        Object term12040 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term12041 = (int[]) newIntArray(8);
        int[] term12050 = (int[]) newIntArray(6);
        setField(term12022, term12022.getClass(), "tree1", null);
        setField(term12022, term12022.getClass(), "tree2", null);
        setIntField(term12022, term12022.getClass(), "root1", -2018441502);
        setIntField(term12022, term12022.getClass(), "root2", -762480882);
        setField(term12022, term12022.getClass(), "labels1", term12025);
        setIntElement(term12026, 0, -263338308);
        setIntElement(term12026, 1, 1496385296);
        setIntElement(term12026, 2, -1339659575);
        setIntElement(term12026, 3, 2123597267);
        setIntElement(term12026, 4, -147077267);
        setField(term12022, term12022.getClass(), "labels2", term12026);
        setField(term12022, term12022.getClass(), "labelListToInt", term12032);
        setIntField(term12022, term12022.getClass(), "maxLabel", -550222549);
        setField(term12022, term12022.getClass(), "isomorphic", term12038);
        setField(term12040, term12040.getClass(), "graph1", null);
        setField(term12040, term12040.getClass(), "graph2", null);
        setIntElement(term12041, 0, -499576898);
        setIntElement(term12041, 1, -686129078);
        setIntElement(term12041, 2, 1016118972);
        setIntElement(term12041, 3, 1276607451);
        setIntElement(term12041, 4, -547325184);
        setIntElement(term12041, 5, 1470261214);
        setIntElement(term12041, 6, 1402619496);
        setIntElement(term12041, 7, 1253501512);
        setField(term12040, term12040.getClass(), "mapping", term12041);
        setIntElement(term12050, 0, 594655877);
        setIntElement(term12050, 1, 281155455);
        setIntElement(term12050, 2, 85079003);
        setIntElement(term12050, 3, -2010823131);
        setIntElement(term12050, 4, -1368198865);
        setIntElement(term12050, 5, -14635574);
        setField(term12040, term12040.getClass(), "inverse", term12050);
        setField(term12022, term12022.getClass(), "isomorphism", term12040);
        setField(term12022, term12022.getClass(), "sortingAlgorithm", null);
        term12057 = new Integer(2111644026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12057;
        callMethod(klass, "createLevels", argTypes, term12022, args);
    }

};


