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

public class EdgeIteratorImpl_checkCurrentEdge_1383888014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173151;

    public EdgeIteratorImpl_checkCurrentEdge_1383888014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173151 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173151, term173151.getClass(), "graph", null);
        setField(term173151, term173151.getClass(), "neighbors", null);
        setIntField(term173151, term173151.getClass(), "index", 0);
        setField(term173151, term173151.getClass(), "currentEdge", null);
        setBooleanField(term173151, term173151.getClass(), "directed", false);
        setIntField(term173151, term173151.getClass(), "numVertices", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkCurrentEdge", argTypes, term173151, args);
    }

};


