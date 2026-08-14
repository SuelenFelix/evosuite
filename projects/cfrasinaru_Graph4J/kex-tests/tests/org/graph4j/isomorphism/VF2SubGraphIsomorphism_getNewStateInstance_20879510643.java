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

public class VF2SubGraphIsomorphism_getNewStateInstance_20879510643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12261;

    public VF2SubGraphIsomorphism_getNewStateInstance_20879510643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12261 = newInstance(Class.forName("org.graph4j.isomorphism.VF2SubGraphIsomorphism"));
        setField(term12261, term12261.getClass(), "dg1", null);
        setField(term12261, term12261.getClass(), "dg2", null);
        setBooleanField(term12261, term12261.getClass(), "cache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2SubGraphIsomorphism");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.isomorphism.State");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNewStateInstance", argTypes, term12261, args);
    }

};


