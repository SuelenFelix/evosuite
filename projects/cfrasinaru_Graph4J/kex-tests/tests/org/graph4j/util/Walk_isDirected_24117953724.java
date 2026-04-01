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

public class Walk_isDirected_24117953724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144056;

    public Walk_isDirected_24117953724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144056 = newInstance(Class.forName("org.graph4j.util.Walk"));
        setIntField(term144056, term144056.getClass(), "numEdges", 0);
        setField(term144056, term144056.getClass(), "graph", null);
        setField(term144056, term144056.getClass(), "vertices", null);
        setIntField(term144056, term144056.getClass(), "numVertices", 0);
        setIntField(term144056, term144056.getClass(), "first", 0);
        setField(term144056, term144056.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term144056, args);
    }

};


