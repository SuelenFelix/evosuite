package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Node_toString_152868129219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;

    public Node_toString_152868129219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        setField(term938, term938.getClass(), "alg", null);
        setIntField(term938, term938.getClass(), "vertex", 0);
        setIntField(term938, term938.getClass(), "color", 0);
        setField(term938, term938.getClass(), "parent", null);
        setField(term938, term938.getClass(), "coloring", null);
        setField(term938, term938.getClass(), "domains", null);
        setField(term938, term938.getClass(), "minDomain", null);
        setBooleanField(term938, term938.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term938, term938.getClass(), "propagator", false);
        setBooleanField(term938, term938.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term938, args);
    }

};


