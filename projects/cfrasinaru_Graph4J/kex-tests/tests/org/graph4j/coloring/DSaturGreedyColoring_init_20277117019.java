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

public class DSaturGreedyColoring_init_20277117019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5384;

    public DSaturGreedyColoring_init_20277117019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5384 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        setField(term5384, term5384.getClass(), "heap", null);
        setField(term5384, term5384.getClass(), "degree", null);
        setField(term5384, term5384.getClass(), "dsatur", null);
        setField(term5384, term5384.getClass(), "colors", null);
        setField(term5384, term5384.getClass(), "used", null);
        setIntField(term5384, term5384.getClass(), "numColors", 0);
        setIntField(term5384, term5384.getClass(), "maxColor", 0);
        setField(term5384, term5384.getClass(), "recolor", null);
        setField(term5384, term5384.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term5384, args);
    }

};


