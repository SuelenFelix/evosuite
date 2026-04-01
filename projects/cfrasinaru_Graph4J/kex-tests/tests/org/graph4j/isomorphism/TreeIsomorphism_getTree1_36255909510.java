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

public class TreeIsomorphism_getTree1_36255909510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;

    public TreeIsomorphism_getTree1_36255909510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3023 = newInstance(Class.forName("org.graph4j.isomorphism.TreeIsomorphism"));
        setField(term3023, term3023.getClass(), "tree1", null);
        setField(term3023, term3023.getClass(), "tree2", null);
        setField(term3023, term3023.getClass(), "rootedAlg", null);
        setField(term3023, term3023.getClass(), "isomorphic", null);
        setField(term3023, term3023.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.TreeIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree1", argTypes, term3023, args);
    }

};


