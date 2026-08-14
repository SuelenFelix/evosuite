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

public class EdgeIteratorImpl_remove_141834040613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173154;

    public EdgeIteratorImpl_remove_141834040613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173154 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173154, term173154.getClass(), "graph", null);
        setField(term173154, term173154.getClass(), "neighbors", null);
        setIntField(term173154, term173154.getClass(), "index", 0);
        setField(term173154, term173154.getClass(), "currentEdge", null);
        setBooleanField(term173154, term173154.getClass(), "directed", false);
        setIntField(term173154, term173154.getClass(), "numVertices", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remove", argTypes, term173154, args);
    }

};


