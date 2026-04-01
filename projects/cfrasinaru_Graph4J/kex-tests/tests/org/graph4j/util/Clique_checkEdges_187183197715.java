package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Clique_checkEdges_187183197715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141667;

    public Clique_checkEdges_187183197715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141667 = newInstance(Class.forName("org.graph4j.util.Clique"));
        setField(term141667, term141667.getClass(), "posMap", null);
        setField(term141667, term141667.getClass(), "graph", null);
        setField(term141667, term141667.getClass(), "vertices", null);
        setIntField(term141667, term141667.getClass(), "numVertices", 0);
        setIntField(term141667, term141667.getClass(), "first", 0);
        setField(term141667, term141667.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term141667, args);
    }

};


