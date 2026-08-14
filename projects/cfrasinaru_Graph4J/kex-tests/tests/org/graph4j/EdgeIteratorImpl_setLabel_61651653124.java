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

public class EdgeIteratorImpl_setLabel_61651653124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173210;

    public EdgeIteratorImpl_setLabel_61651653124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173210 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173210, term173210.getClass(), "graph", null);
        setField(term173210, term173210.getClass(), "neighbors", null);
        setIntField(term173210, term173210.getClass(), "index", 0);
        setField(term173210, term173210.getClass(), "currentEdge", null);
        setBooleanField(term173210, term173210.getClass(), "directed", false);
        setIntField(term173210, term173210.getClass(), "numVertices", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLabel", argTypes, term173210, args);
    }

};


