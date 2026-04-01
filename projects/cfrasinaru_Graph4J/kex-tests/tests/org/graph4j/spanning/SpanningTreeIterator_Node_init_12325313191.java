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
     Object term141924;
     Object term141926;
     Object term141928;
     Object term141930;
     Object term141932;

    public SpanningTreeIterator_Node_init_12325313191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141924 = new Integer(0);
        term141926 = new Integer(0);
        term141928 = new Integer(0);
        term141930 = new Integer(0);
        term141932 = new Integer(0);
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
        args[1] = term141924;
        args[2] = term141926;
        args[3] = term141928;
        args[4] = term141930;
        args[5] = term141932;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


