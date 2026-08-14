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
import java.lang.Integer;

public class Edge_data_170184399732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108474;
     Object term108478;

    public Edge_data_170184399732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108474 = newInstance(Class.forName("org.graph4j.Edge"));
        setBooleanField(term108474, term108474.getClass(), "directed", false);
        setIntField(term108474, term108474.getClass(), "source", 0);
        setIntField(term108474, term108474.getClass(), "target", 0);
        setField(term108474, term108474.getClass(), "data", null);
        setField(term108474, term108474.getClass(), "label", null);
        term108478 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108478;
        callMethod(klass, "data", argTypes, term108474, args);
    }

};


