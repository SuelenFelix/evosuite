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

public class Matching_contains_28541565817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107507;
     Object term107509;
     Object term107511;

    public Matching_contains_28541565817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107507 = newInstance(Class.forName("org.graph4j.util.Matching"));
        setField(term107507, term107507.getClass(), "graph", null);
        setField(term107507, term107507.getClass(), "mates", null);
        setIntField(term107507, term107507.getClass(), "size", 0);
        setField(term107507, term107507.getClass(), "edges", null);
        term107509 = new Integer(0);
        term107511 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107509;
        args[1] = term107511;
        callMethod(klass, "contains", argTypes, term107507, args);
    }

};


