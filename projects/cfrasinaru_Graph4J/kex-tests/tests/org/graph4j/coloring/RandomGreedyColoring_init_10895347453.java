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

public class RandomGreedyColoring_init_10895347453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042;

    public RandomGreedyColoring_init_10895347453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1042 = newInstance(Class.forName("org.graph4j.coloring.RandomGreedyColoring"));
        setIntField(term1042, term1042.getClass(), "pos", 0);
        setField(term1042, term1042.getClass(), "vertexOrdering", null);
        setField(term1042, term1042.getClass(), "colors", null);
        setField(term1042, term1042.getClass(), "used", null);
        setIntField(term1042, term1042.getClass(), "numColors", 0);
        setIntField(term1042, term1042.getClass(), "maxColor", 0);
        setField(term1042, term1042.getClass(), "recolor", null);
        setField(term1042, term1042.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.RandomGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term1042, args);
    }

};


