package com.demo.bootcamp.model.jpa;

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
import static com.demo.bootcamp.model.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TestEntity_getName_10629965523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026;

    public TestEntity_getName_10629965523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1026 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term1026, term1026.getClass(), "id", 1135664017);
        setField(term1026, term1026.getClass(), "name", "nHXjMycHlU");
        setField(term1026, term1026.getClass(), "info", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.jpa.TestEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1026, args);
    }

};


