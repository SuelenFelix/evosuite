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
import java.lang.Integer;

public class Coloring_checkColorUsed_7963075239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2428;
     Object term2430;

    public Coloring_checkColorUsed_7963075239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2428 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2428, term2428.getClass(), "graph", null);
        setField(term2428, term2428.getClass(), "vertexColor", null);
        setIntField(term2428, term2428.getClass(), "numColoredVertices", 0);
        setField(term2428, term2428.getClass(), "usedColors", null);
        setField(term2428, term2428.getClass(), "colorMap", null);
        term2430 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2430;
        callMethod(klass, "checkColorUsed", argTypes, term2428, args);
    }

};


