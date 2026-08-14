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

public class DSaturGreedyColoring_update_47896272613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5400;
     Object term5403;

    public DSaturGreedyColoring_update_47896272613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5400 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        setField(term5400, term5400.getClass(), "heap", null);
        setField(term5400, term5400.getClass(), "degree", null);
        setField(term5400, term5400.getClass(), "dsatur", null);
        setField(term5400, term5400.getClass(), "colors", null);
        setField(term5400, term5400.getClass(), "used", null);
        setIntField(term5400, term5400.getClass(), "numColors", 0);
        setIntField(term5400, term5400.getClass(), "maxColor", 0);
        setField(term5400, term5400.getClass(), "recolor", null);
        setField(term5400, term5400.getClass(), "graph", null);
        term5403 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5403;
        callMethod(klass, "update", argTypes, term5400, args);
    }

};


