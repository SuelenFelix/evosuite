package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WeightedSpanningTreeIterator_refine_64840712511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;

    public WeightedSpanningTreeIterator_refine_64840712511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1018 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        setField(term1018, term1018.getClass(), "graph", null);
        setIntField(term1018, term1018.getClass(), "numVertices", 0);
        setField(term1018, term1018.getClass(), "edges", null);
        setField(term1018, term1018.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "refine", argTypes, term1018, args);
    }

};


