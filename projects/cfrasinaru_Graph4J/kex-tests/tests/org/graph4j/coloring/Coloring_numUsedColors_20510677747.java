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

public class Coloring_numUsedColors_20510677747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2456;

    public Coloring_numUsedColors_20510677747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2456 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2456, term2456.getClass(), "graph", null);
        setField(term2456, term2456.getClass(), "vertexColor", null);
        setIntField(term2456, term2456.getClass(), "numColoredVertices", 0);
        setField(term2456, term2456.getClass(), "usedColors", null);
        setField(term2456, term2456.getClass(), "colorMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numUsedColors", argTypes, term2456, args);
    }

};


