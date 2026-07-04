package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Department_getUsers_89528611023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3509;

    public Department_getUsers_89528611023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3509 = newInstance(Class.forName("com.org.model.Department"));
        setField(term3509, term3509.getClass(), "id", null);
        setField(term3509, term3509.getClass(), "partname", null);
        setField(term3509, term3509.getClass(), "addr", null);
        setField(term3509, term3509.getClass(), "introduce", null);
        setField(term3509, term3509.getClass(), "parentid", null);
        setField(term3509, term3509.getClass(), "departments", null);
        setField(term3509, term3509.getClass(), "users", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsers", argTypes, term3509, args);
    }

};


