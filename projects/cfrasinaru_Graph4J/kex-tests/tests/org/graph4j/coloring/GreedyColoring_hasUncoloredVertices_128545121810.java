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

public class GreedyColoring_hasUncoloredVertices_128545121810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4408;

    public GreedyColoring_hasUncoloredVertices_128545121810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4408 = newInstance(Class.forName("org.graph4j.coloring.GreedyColoring"));
        setIntField(term4408, term4408.getClass(), "pos", 0);
        setField(term4408, term4408.getClass(), "vertexOrdering", null);
        setField(term4408, term4408.getClass(), "colors", null);
        setField(term4408, term4408.getClass(), "used", null);
        setIntField(term4408, term4408.getClass(), "numColors", 0);
        setIntField(term4408, term4408.getClass(), "maxColor", 0);
        setField(term4408, term4408.getClass(), "recolor", null);
        setField(term4408, term4408.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.GreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasUncoloredVertices", argTypes, term4408, args);
    }

};


