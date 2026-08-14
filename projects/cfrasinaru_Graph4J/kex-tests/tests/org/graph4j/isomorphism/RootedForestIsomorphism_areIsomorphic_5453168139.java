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

public class RootedForestIsomorphism_areIsomorphic_5453168139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3971;

    public RootedForestIsomorphism_areIsomorphic_5453168139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3971 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        setField(term3971, term3971.getClass(), "forest1", null);
        setField(term3971, term3971.getClass(), "forest2", null);
        setField(term3971, term3971.getClass(), "roots1", null);
        setField(term3971, term3971.getClass(), "roots2", null);
        setField(term3971, term3971.getClass(), "rootedTreeAlg", null);
        setField(term3971, term3971.getClass(), "tree1", null);
        setField(term3971, term3971.getClass(), "tree2", null);
        setIntField(term3971, term3971.getClass(), "root1", 0);
        setIntField(term3971, term3971.getClass(), "root2", 0);
        setField(term3971, term3971.getClass(), "isomorphic", null);
        setField(term3971, term3971.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "areIsomorphic", argTypes, term3971, args);
    }

};


