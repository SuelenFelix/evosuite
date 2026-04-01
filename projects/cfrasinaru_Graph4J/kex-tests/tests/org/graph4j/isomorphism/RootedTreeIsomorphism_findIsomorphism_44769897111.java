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

public class RootedTreeIsomorphism_findIsomorphism_44769897111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12231;

    public RootedTreeIsomorphism_findIsomorphism_44769897111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12231 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        setField(term12231, term12231.getClass(), "tree1", null);
        setField(term12231, term12231.getClass(), "tree2", null);
        setIntField(term12231, term12231.getClass(), "root1", 0);
        setIntField(term12231, term12231.getClass(), "root2", 0);
        setField(term12231, term12231.getClass(), "labels1", null);
        setField(term12231, term12231.getClass(), "labels2", null);
        setField(term12231, term12231.getClass(), "labelListToInt", null);
        setIntField(term12231, term12231.getClass(), "maxLabel", 0);
        setField(term12231, term12231.getClass(), "isomorphic", null);
        setField(term12231, term12231.getClass(), "isomorphism", null);
        setField(term12231, term12231.getClass(), "sortingAlgorithm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findIsomorphism", argTypes, term12231, args);
    }

};


