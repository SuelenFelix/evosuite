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

public class Student_setBirthday_48627121130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665;

    public Student_setBirthday_48627121130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2665 = newInstance(Class.forName("com.example.pdf.model.Student"));
        setField(term2665, term2665.getClass(), "id", null);
        setField(term2665, term2665.getClass(), "name", null);
        setField(term2665, term2665.getClass(), "email", null);
        setField(term2665, term2665.getClass(), "password", null);
        setField(term2665, term2665.getClass(), "birthday", null);
        setField(term2665, term2665.getClass(), "school", null);
        setField(term2665, term2665.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBirthday", argTypes, term2665, args);
    }

};


