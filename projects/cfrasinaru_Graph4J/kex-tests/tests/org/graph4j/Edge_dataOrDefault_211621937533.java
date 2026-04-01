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

public class Edge_dataOrDefault_211621937533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108477;
     Object term108481;
     Object term108483;

    public Edge_dataOrDefault_211621937533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108477 = newInstance(Class.forName("org.graph4j.Edge"));
        setBooleanField(term108477, term108477.getClass(), "directed", false);
        setIntField(term108477, term108477.getClass(), "source", 0);
        setIntField(term108477, term108477.getClass(), "target", 0);
        setField(term108477, term108477.getClass(), "data", null);
        setField(term108477, term108477.getClass(), "label", null);
        term108481 = new Integer(0);
        term108483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term108481;
        args[1] = term108483;
        callMethod(klass, "dataOrDefault", argTypes, term108477, args);
    }

};


