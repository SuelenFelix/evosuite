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
import java.lang.Integer;

public class RootedTreeIsomorphism_createLevels_182544220413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12239;
     Object term12243;

    public RootedTreeIsomorphism_createLevels_182544220413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12239 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        setField(term12239, term12239.getClass(), "tree1", null);
        setField(term12239, term12239.getClass(), "tree2", null);
        setIntField(term12239, term12239.getClass(), "root1", 0);
        setIntField(term12239, term12239.getClass(), "root2", 0);
        setField(term12239, term12239.getClass(), "labels1", null);
        setField(term12239, term12239.getClass(), "labels2", null);
        setField(term12239, term12239.getClass(), "labelListToInt", null);
        setIntField(term12239, term12239.getClass(), "maxLabel", 0);
        setField(term12239, term12239.getClass(), "isomorphic", null);
        setField(term12239, term12239.getClass(), "isomorphism", null);
        setField(term12239, term12239.getClass(), "sortingAlgorithm", null);
        term12243 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12243;
        callMethod(klass, "createLevels", argTypes, term12239, args);
    }

};


