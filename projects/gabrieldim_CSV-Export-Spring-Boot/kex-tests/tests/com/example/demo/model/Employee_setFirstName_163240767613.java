package com.example.demo.model;

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
import static com.example.demo.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Employee_setFirstName_163240767613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378;

    public Employee_setFirstName_163240767613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378 = newInstance(Class.forName("com.example.demo.model.Employee"));
        setField(term378, term378.getClass(), "id", null);
        setField(term378, term378.getClass(), "firstName", null);
        setField(term378, term378.getClass(), "lastName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstName", argTypes, term378, args);
    }

};


