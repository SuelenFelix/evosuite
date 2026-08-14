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

public class DSaturGreedyColoring_compareUncoloredVertices_32315107610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5387;
     Object term5390;
     Object term5392;

    public DSaturGreedyColoring_compareUncoloredVertices_32315107610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5387 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        setField(term5387, term5387.getClass(), "heap", null);
        setField(term5387, term5387.getClass(), "degree", null);
        setField(term5387, term5387.getClass(), "dsatur", null);
        setField(term5387, term5387.getClass(), "colors", null);
        setField(term5387, term5387.getClass(), "used", null);
        setIntField(term5387, term5387.getClass(), "numColors", 0);
        setIntField(term5387, term5387.getClass(), "maxColor", 0);
        setField(term5387, term5387.getClass(), "recolor", null);
        setField(term5387, term5387.getClass(), "graph", null);
        term5390 = new Integer(0);
        term5392 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5390;
        args[1] = term5392;
        callMethod(klass, "compareUncoloredVertices", argTypes, term5387, args);
    }

};


