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

public class RootedForestIsomorphism_createRootedTreeAlg_38825103112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3980;

    public RootedForestIsomorphism_createRootedTreeAlg_38825103112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3980 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        setField(term3980, term3980.getClass(), "forest1", null);
        setField(term3980, term3980.getClass(), "forest2", null);
        setField(term3980, term3980.getClass(), "roots1", null);
        setField(term3980, term3980.getClass(), "roots2", null);
        setField(term3980, term3980.getClass(), "rootedTreeAlg", null);
        setField(term3980, term3980.getClass(), "tree1", null);
        setField(term3980, term3980.getClass(), "tree2", null);
        setIntField(term3980, term3980.getClass(), "root1", 0);
        setIntField(term3980, term3980.getClass(), "root2", 0);
        setField(term3980, term3980.getClass(), "isomorphic", null);
        setField(term3980, term3980.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createRootedTreeAlg", argTypes, term3980, args);
    }

};


