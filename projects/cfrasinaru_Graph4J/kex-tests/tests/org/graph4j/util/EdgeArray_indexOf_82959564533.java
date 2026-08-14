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

public class EdgeArray_indexOf_82959564533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;
     Object term2248;
     Object term2250;

    public EdgeArray_indexOf_82959564533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        setField(term2246, term2246.getClass(), "graph", null);
        setField(term2246, term2246.getClass(), "edges", null);
        setIntField(term2246, term2246.getClass(), "numEdges", 0);
        term2248 = new Integer(0);
        term2250 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2248;
        args[1] = term2250;
        callMethod(klass, "indexOf", argTypes, term2246, args);
    }

};


