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

public class Coloring_getColorsUsedBy_108363120358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2480;

    public Coloring_getColorsUsedBy_108363120358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2480 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2480, term2480.getClass(), "graph", null);
        setField(term2480, term2480.getClass(), "vertexColor", null);
        setIntField(term2480, term2480.getClass(), "numColoredVertices", 0);
        setField(term2480, term2480.getClass(), "usedColors", null);
        setField(term2480, term2480.getClass(), "colorMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getColorsUsedBy", argTypes, term2480, args);
    }

};


