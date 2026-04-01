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

public class RootedForestIsomorphism_computeIsomorphic_195719618211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3977;

    public RootedForestIsomorphism_computeIsomorphic_195719618211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3977 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        setField(term3977, term3977.getClass(), "forest1", null);
        setField(term3977, term3977.getClass(), "forest2", null);
        setField(term3977, term3977.getClass(), "roots1", null);
        setField(term3977, term3977.getClass(), "roots2", null);
        setField(term3977, term3977.getClass(), "rootedTreeAlg", null);
        setField(term3977, term3977.getClass(), "tree1", null);
        setField(term3977, term3977.getClass(), "tree2", null);
        setIntField(term3977, term3977.getClass(), "root1", 0);
        setIntField(term3977, term3977.getClass(), "root2", 0);
        setField(term3977, term3977.getClass(), "isomorphic", null);
        setField(term3977, term3977.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term3977, args);
    }

};


