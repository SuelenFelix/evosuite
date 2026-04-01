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

public class Coloring_checkProper_164313633854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2472;

    public Coloring_checkProper_164313633854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2472 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        setField(term2472, term2472.getClass(), "graph", null);
        setField(term2472, term2472.getClass(), "vertexColor", null);
        setIntField(term2472, term2472.getClass(), "numColoredVertices", 0);
        setField(term2472, term2472.getClass(), "usedColors", null);
        setField(term2472, term2472.getClass(), "colorMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkProper", argTypes, term2472, args);
    }

};


