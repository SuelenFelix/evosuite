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

public class VertexQueue_add_521555649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;
     Object term4304;

    public VertexQueue_add_521555649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4301 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        setField(term4301, term4301.getClass(), "graph", null);
        setField(term4301, term4301.getClass(), "vertices", null);
        setIntField(term4301, term4301.getClass(), "numVertices", 0);
        setIntField(term4301, term4301.getClass(), "first", 0);
        setField(term4301, term4301.getClass(), "bitset", null);
        term4304 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4304;
        callMethod(klass, "add", argTypes, term4301, args);
    }

};


