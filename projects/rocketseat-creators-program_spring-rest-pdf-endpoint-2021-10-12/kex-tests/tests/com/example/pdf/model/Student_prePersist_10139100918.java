package com.example.pdf.model;

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
import static com.example.pdf.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_prePersist_10139100918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2653;

    public Student_prePersist_10139100918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2653 = newInstance(Class.forName("com.example.pdf.model.Student"));
        setField(term2653, term2653.getClass(), "id", null);
        setField(term2653, term2653.getClass(), "name", null);
        setField(term2653, term2653.getClass(), "email", null);
        setField(term2653, term2653.getClass(), "password", null);
        setField(term2653, term2653.getClass(), "birthday", null);
        setField(term2653, term2653.getClass(), "school", null);
        setField(term2653, term2653.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term2653, args);
    }

};


