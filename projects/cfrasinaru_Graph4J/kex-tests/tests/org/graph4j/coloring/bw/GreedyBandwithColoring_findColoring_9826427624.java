package org.graph4j.coloring.bw;

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
import static org.graph4j.coloring.bw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GreedyBandwithColoring_findColoring_9826427624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000;

    public GreedyBandwithColoring_findColoring_9826427624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1000 = newInstance(Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring"));
        setIntField(term1000, term1000.getClass(), "pos", 0);
        setField(term1000, term1000.getClass(), "vertexOrdering", null);
        setField(term1000, term1000.getClass(), "colors", null);
        setField(term1000, term1000.getClass(), "used", null);
        setIntField(term1000, term1000.getClass(), "numColors", 0);
        setIntField(term1000, term1000.getClass(), "maxColor", 0);
        setField(term1000, term1000.getClass(), "recolor", null);
        setField(term1000, term1000.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.bw.GreedyBandwithColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findColoring", argTypes, term1000, args);
    }

};


