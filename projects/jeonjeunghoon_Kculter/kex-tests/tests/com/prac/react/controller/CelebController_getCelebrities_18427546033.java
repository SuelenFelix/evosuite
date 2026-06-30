package com.prac.react.controller;

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
import static com.prac.react.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CelebController_getCelebrities_18427546033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1458;

    public CelebController_getCelebrities_18427546033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1458 = newInstance(Class.forName("com.prac.react.controller.CelebController"));
        setField(term1458, term1458.getClass(), "logger", null);
        setField(term1458, term1458.getClass(), "cs", null);
        setField(term1458, term1458.getClass(), "encryption", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CelebController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCelebrities", argTypes, term1458, args);
    }

};


