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

public class RootedTreeIsomorphism_computeLabels_211308645614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12245;
     Object term12249;

    public RootedTreeIsomorphism_computeLabels_211308645614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12245 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        setField(term12245, term12245.getClass(), "tree1", null);
        setField(term12245, term12245.getClass(), "tree2", null);
        setIntField(term12245, term12245.getClass(), "root1", 0);
        setIntField(term12245, term12245.getClass(), "root2", 0);
        setField(term12245, term12245.getClass(), "labels1", null);
        setField(term12245, term12245.getClass(), "labels2", null);
        setField(term12245, term12245.getClass(), "labelListToInt", null);
        setIntField(term12245, term12245.getClass(), "maxLabel", 0);
        setField(term12245, term12245.getClass(), "isomorphic", null);
        setField(term12245, term12245.getClass(), "isomorphism", null);
        setField(term12245, term12245.getClass(), "sortingAlgorithm", null);
        term12249 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.util.VertexList");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term12249;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "computeLabels", argTypes, term12245, args);
    }

};


