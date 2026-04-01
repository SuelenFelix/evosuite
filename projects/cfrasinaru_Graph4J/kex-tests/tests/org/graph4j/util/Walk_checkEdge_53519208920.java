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

public class Walk_checkEdge_53519208920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144038;

    public Walk_checkEdge_53519208920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144038 = newInstance(Class.forName("org.graph4j.util.Walk"));
        setIntField(term144038, term144038.getClass(), "numEdges", 0);
        setField(term144038, term144038.getClass(), "graph", null);
        setField(term144038, term144038.getClass(), "vertices", null);
        setIntField(term144038, term144038.getClass(), "numVertices", 0);
        setIntField(term144038, term144038.getClass(), "first", 0);
        setField(term144038, term144038.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkEdge", argTypes, term144038, args);
    }

};


