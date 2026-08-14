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

public class DFSIterator_init_20678315957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088;

    public DFSIterator_init_20678315957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1088 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        setField(term1088, term1088.getClass(), "graph", null);
        setIntField(term1088, term1088.getClass(), "numVertices", 0);
        setIntField(term1088, term1088.getClass(), "startVertex", 0);
        setField(term1088, term1088.getClass(), "stack", null);
        setField(term1088, term1088.getClass(), "visited", null);
        setField(term1088, term1088.getClass(), "nextPos", null);
        setIntField(term1088, term1088.getClass(), "restartIndex", 0);
        setIntField(term1088, term1088.getClass(), "numIterations", 0);
        setIntField(term1088, term1088.getClass(), "component", 0);
        setIntField(term1088, term1088.getClass(), "orderNumber", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1088, args);
    }

};


