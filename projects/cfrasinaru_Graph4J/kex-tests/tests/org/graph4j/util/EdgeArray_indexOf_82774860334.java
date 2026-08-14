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
import java.lang.Integer;

public class EdgeArray_indexOf_82774860334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;
     Object term2254;
     Object term2256;
     Object term2258;

    public EdgeArray_indexOf_82774860334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2252 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        setField(term2252, term2252.getClass(), "graph", null);
        setField(term2252, term2252.getClass(), "edges", null);
        setIntField(term2252, term2252.getClass(), "numEdges", 0);
        term2254 = new Integer(0);
        term2256 = new Integer(0);
        term2258 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2254;
        args[1] = term2256;
        args[2] = term2258;
        callMethod(klass, "indexOf", argTypes, term2252, args);
    }

};


