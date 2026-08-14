package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpanningTreeIterator_Node_init_12325313191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1475;
     Object term1477;
     Object term1479;
     Object term1481;
     Object term1483;

    public SpanningTreeIterator_Node_init_12325313191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1475 = new Integer(0);
        term1477 = new Integer(0);
        term1479 = new Integer(0);
        term1481 = new Integer(0);
        term1483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator$Node");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.graph4j.spanning.SpanningTreeIterator");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term1475;
        args[2] = term1477;
        args[3] = term1479;
        args[4] = term1481;
        args[5] = term1483;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


