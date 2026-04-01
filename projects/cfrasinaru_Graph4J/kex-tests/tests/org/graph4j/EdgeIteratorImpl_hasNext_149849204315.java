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

public class EdgeIteratorImpl_hasNext_149849204315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173155;

    public EdgeIteratorImpl_hasNext_149849204315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173155 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        setField(term173155, term173155.getClass(), "graph", null);
        setField(term173155, term173155.getClass(), "neighbors", null);
        setIntField(term173155, term173155.getClass(), "index", 0);
        setField(term173155, term173155.getClass(), "currentEdge", null);
        setBooleanField(term173155, term173155.getClass(), "directed", false);
        setIntField(term173155, term173155.getClass(), "numVertices", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term173155, args);
    }

};


