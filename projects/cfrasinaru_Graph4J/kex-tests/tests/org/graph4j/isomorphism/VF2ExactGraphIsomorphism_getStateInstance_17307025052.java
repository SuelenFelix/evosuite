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

public class VF2ExactGraphIsomorphism_getStateInstance_17307025052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12285;
     Object term12287;

    public VF2ExactGraphIsomorphism_getStateInstance_17307025052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12285 = newInstance(Class.forName("org.graph4j.isomorphism.VF2ExactGraphIsomorphism"));
        setField(term12285, term12285.getClass(), "dg1", null);
        setField(term12285, term12285.getClass(), "dg2", null);
        setBooleanField(term12285, term12285.getClass(), "cache", false);
        term12287 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2ExactGraphIsomorphism");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Digraph");
        argTypes[1] = Class.forName("org.graph4j.Digraph");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term12287;
        callMethod(klass, "getStateInstance", argTypes, term12285, args);
    }

};


