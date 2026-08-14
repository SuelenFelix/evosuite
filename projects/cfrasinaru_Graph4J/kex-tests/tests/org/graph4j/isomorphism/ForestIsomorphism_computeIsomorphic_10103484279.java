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

public class ForestIsomorphism_computeIsomorphic_10103484279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3319;

    public ForestIsomorphism_computeIsomorphic_10103484279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3319 = newInstance(Class.forName("org.graph4j.isomorphism.ForestIsomorphism"));
        setField(term3319, term3319.getClass(), "forest1", null);
        setField(term3319, term3319.getClass(), "forest2", null);
        setField(term3319, term3319.getClass(), "rootedTreeAlg", null);
        setField(term3319, term3319.getClass(), "isomorphic", null);
        setField(term3319, term3319.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.ForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeIsomorphic", argTypes, term3319, args);
    }

};


