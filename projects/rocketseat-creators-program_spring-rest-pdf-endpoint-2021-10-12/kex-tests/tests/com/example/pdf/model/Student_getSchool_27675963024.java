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

public class Student_getSchool_27675963024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2659;

    public Student_getSchool_27675963024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2659 = newInstance(Class.forName("com.example.pdf.model.Student"));
        setField(term2659, term2659.getClass(), "id", null);
        setField(term2659, term2659.getClass(), "name", null);
        setField(term2659, term2659.getClass(), "email", null);
        setField(term2659, term2659.getClass(), "password", null);
        setField(term2659, term2659.getClass(), "birthday", null);
        setField(term2659, term2659.getClass(), "school", null);
        setField(term2659, term2659.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchool", argTypes, term2659, args);
    }

};


