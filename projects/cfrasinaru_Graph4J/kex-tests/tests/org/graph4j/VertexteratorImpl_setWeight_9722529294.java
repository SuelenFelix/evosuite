package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class VertexteratorImpl_setWeight_9722529294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47640;
     Object term47643;

    public VertexteratorImpl_setWeight_9722529294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47640 = newInstance(Class.forName("org.graph4j.VertexteratorImpl"));
        setField(term47640, term47640.getClass(), "graph", null);
        setIntField(term47640, term47640.getClass(), "index", -2069135847);
        setIntField(term47640, term47640.getClass(), "vertex", -2030631838);
        term47643 = new Double(0.838312188315318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexteratorImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term47643;
        callMethod(klass, "setWeight", argTypes, term47640, args);
    }

};


