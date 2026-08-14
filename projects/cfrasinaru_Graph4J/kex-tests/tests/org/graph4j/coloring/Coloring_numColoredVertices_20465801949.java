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

public class Coloring_numColoredVertices_20465801949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;
     Object term2462;

    public Coloring_numColoredVertices_20465801949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2460 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2460, term2460.getClass(), "graph", null);
        setField(term2460, term2460.getClass(), "vertexColor", null);
        setIntField(term2460, term2460.getClass(), "numColoredVertices", 0);
        setField(term2460, term2460.getClass(), "usedColors", null);
        setField(term2460, term2460.getClass(), "colorMap", null);
        term2462 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2462;
        callMethod(klass, "numColoredVertices", argTypes, term2460, args);
    }

};


