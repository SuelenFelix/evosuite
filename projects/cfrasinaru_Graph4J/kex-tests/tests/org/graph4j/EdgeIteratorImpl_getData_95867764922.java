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
import java.lang.Integer;

public class EdgeIteratorImpl_getData_95867764922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173196;
     Object term173200;

    public EdgeIteratorImpl_getData_95867764922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173196 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173196, term173196.getClass(), "graph", null);
        setField(term173196, term173196.getClass(), "neighbors", null);
        setIntField(term173196, term173196.getClass(), "index", 0);
        setField(term173196, term173196.getClass(), "currentEdge", null);
        setBooleanField(term173196, term173196.getClass(), "directed", false);
        setIntField(term173196, term173196.getClass(), "numVertices", 0);
        term173200 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term173200;
        callMethod(klass, "getData", argTypes, term173196, args);
    }

};


