package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Edge_isAdjacentTo_163886099037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108497;

    public Edge_isAdjacentTo_163886099037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108497 = newInstance(Class.forName("org.graph4j.Edge"));
        setBooleanField(term108497, term108497.getClass(), "directed", false);
        setIntField(term108497, term108497.getClass(), "source", 0);
        setIntField(term108497, term108497.getClass(), "target", 0);
        setField(term108497, term108497.getClass(), "data", null);
        setField(term108497, term108497.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isAdjacentTo", argTypes, term108497, args);
    }

};


