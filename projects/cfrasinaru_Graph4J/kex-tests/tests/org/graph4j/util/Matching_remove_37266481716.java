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

public class Matching_remove_37266481716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107501;
     Object term107503;
     Object term107505;

    public Matching_remove_37266481716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107501 = newInstance(Class.forName("org.graph4j.util.Matching"));
        setField(term107501, term107501.getClass(), "graph", null);
        setField(term107501, term107501.getClass(), "mates", null);
        setIntField(term107501, term107501.getClass(), "size", 0);
        setField(term107501, term107501.getClass(), "edges", null);
        term107503 = new Integer(0);
        term107505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107503;
        args[1] = term107505;
        callMethod(klass, "remove", argTypes, term107501, args);
    }

};


