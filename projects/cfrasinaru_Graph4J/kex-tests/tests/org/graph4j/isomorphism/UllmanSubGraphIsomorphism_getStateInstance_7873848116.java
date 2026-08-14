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
import java.lang.Boolean;

public class UllmanSubGraphIsomorphism_getStateInstance_7873848116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2774;
     Object term2776;

    public UllmanSubGraphIsomorphism_getStateInstance_7873848116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2774 = newInstance(Class.forName("org.graph4j.isomorphism.UllmanSubGraphIsomorphism"));
        setField(term2774, term2774.getClass(), "dg1", null);
        setField(term2774, term2774.getClass(), "dg2", null);
        setBooleanField(term2774, term2774.getClass(), "cache", false);
        term2776 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.UllmanSubGraphIsomorphism");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Digraph");
        argTypes[1] = Class.forName("org.graph4j.Digraph");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2776;
        callMethod(klass, "getStateInstance", argTypes, term2774, args);
    }

};


