package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DFSIterator_next_3082138999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101754;

    public DFSIterator_next_3082138999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101754 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        setField(term101754, term101754.getClass(), "graph", null);
        setIntField(term101754, term101754.getClass(), "numVertices", 0);
        setIntField(term101754, term101754.getClass(), "startVertex", 0);
        setField(term101754, term101754.getClass(), "stack", null);
        setField(term101754, term101754.getClass(), "visited", null);
        setField(term101754, term101754.getClass(), "nextPos", null);
        setIntField(term101754, term101754.getClass(), "restartIndex", 0);
        setIntField(term101754, term101754.getClass(), "numIterations", 0);
        setIntField(term101754, term101754.getClass(), "component", 0);
        setIntField(term101754, term101754.getClass(), "orderNumber", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term101754, args);
    }

};


