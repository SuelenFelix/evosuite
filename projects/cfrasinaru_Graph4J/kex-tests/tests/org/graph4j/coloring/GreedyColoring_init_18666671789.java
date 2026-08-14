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

public class GreedyColoring_init_18666671789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4404;

    public GreedyColoring_init_18666671789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4404 = newInstance(Class.forName("org.graph4j.coloring.GreedyColoring"));
        setIntField(term4404, term4404.getClass(), "pos", 0);
        setField(term4404, term4404.getClass(), "vertexOrdering", null);
        setField(term4404, term4404.getClass(), "colors", null);
        setField(term4404, term4404.getClass(), "used", null);
        setIntField(term4404, term4404.getClass(), "numColors", 0);
        setIntField(term4404, term4404.getClass(), "maxColor", 0);
        setField(term4404, term4404.getClass(), "recolor", null);
        setField(term4404, term4404.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.GreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term4404, args);
    }

};


