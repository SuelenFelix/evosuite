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

public class Matching_add_23281738815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107495;
     Object term107497;
     Object term107499;

    public Matching_add_23281738815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107495 = newInstance(Class.forName("org.graph4j.util.Matching"));
        setField(term107495, term107495.getClass(), "graph", null);
        setField(term107495, term107495.getClass(), "mates", null);
        setIntField(term107495, term107495.getClass(), "size", 0);
        setField(term107495, term107495.getClass(), "edges", null);
        term107497 = new Integer(0);
        term107499 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107497;
        args[1] = term107499;
        callMethod(klass, "add", argTypes, term107495, args);
    }

};


