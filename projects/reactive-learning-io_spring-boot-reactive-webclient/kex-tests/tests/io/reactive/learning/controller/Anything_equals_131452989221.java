package io.reactive.learning.controller;

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
import static io.reactive.learning.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Anything_equals_131452989221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;

    public Anything_equals_131452989221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1068 = newInstance(Class.forName("io.reactive.learning.controller.Anything"));
        setField(term1068, term1068.getClass(), "url", null);
        setField(term1068, term1068.getClass(), "method", null);
        setField(term1068, term1068.getClass(), "origin", null);
        setField(term1068, term1068.getClass(), "headers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Anything");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term1068, args);
    }

};


