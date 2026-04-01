package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BipartiteGraphSupport_getSide_86521918715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104447;
     Object term104448;

    public BipartiteGraphSupport_getSide_86521918715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104447 = newInstance(Class.forName("org.graph4j.support.BipartiteGraphSupport"));
        setField(term104447, term104447.getClass(), "color", null);
        setField(term104447, term104447.getClass(), "bipartite", null);
        setField(term104447, term104447.getClass(), "oddCycle", null);
        setField(term104447, term104447.getClass(), "leftSide", null);
        setField(term104447, term104447.getClass(), "rightSide", null);
        setField(term104447, term104447.getClass(), "coloring", null);
        setField(term104447, term104447.getClass(), "maximumMatchingAlg", null);
        setField(term104447, term104447.getClass(), "graph", null);
        term104448 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.BipartiteGraphSupport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104448;
        callMethod(klass, "getSide", argTypes, term104447, args);
    }

};


