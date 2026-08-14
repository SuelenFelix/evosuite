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
import java.lang.Integer;

public class TestEntity_setId_19297436439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1256;
     Object term1258;

    public TestEntity_setId_19297436439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1256 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term1256, term1256.getClass(), "id", 0);
        setField(term1256, term1256.getClass(), "name", null);
        setField(term1256, term1256.getClass(), "info", null);
        term1258 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.jpa.TestEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1258;
        callMethod(klass, "setId", argTypes, term1256, args);
    }

};


