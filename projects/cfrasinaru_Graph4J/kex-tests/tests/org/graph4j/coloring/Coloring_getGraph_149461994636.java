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

public class Coloring_getGraph_149461994636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2418;

    public Coloring_getGraph_149461994636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2418 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2418, term2418.getClass(), "graph", null);
        setField(term2418, term2418.getClass(), "vertexColor", null);
        setIntField(term2418, term2418.getClass(), "numColoredVertices", 0);
        setField(term2418, term2418.getClass(), "usedColors", null);
        setField(term2418, term2418.getClass(), "colorMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGraph", argTypes, term2418, args);
    }

};


