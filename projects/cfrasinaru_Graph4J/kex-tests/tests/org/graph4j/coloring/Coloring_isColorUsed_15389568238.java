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

public class Coloring_isColorUsed_15389568238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2424;
     Object term2426;

    public Coloring_isColorUsed_15389568238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2424 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2424, term2424.getClass(), "graph", null);
        setField(term2424, term2424.getClass(), "vertexColor", null);
        setIntField(term2424, term2424.getClass(), "numColoredVertices", 0);
        setField(term2424, term2424.getClass(), "usedColors", null);
        setField(term2424, term2424.getClass(), "colorMap", null);
        term2426 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2426;
        callMethod(klass, "isColorUsed", argTypes, term2424, args);
    }

};


