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

public class Student_setSchool_169332729231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2666;

    public Student_setSchool_169332729231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2666 = newInstance(Class.forName("com.example.pdf.model.Student"));
        setField(term2666, term2666.getClass(), "id", null);
        setField(term2666, term2666.getClass(), "name", null);
        setField(term2666, term2666.getClass(), "email", null);
        setField(term2666, term2666.getClass(), "password", null);
        setField(term2666, term2666.getClass(), "birthday", null);
        setField(term2666, term2666.getClass(), "school", null);
        setField(term2666, term2666.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.pdf.model.School");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSchool", argTypes, term2666, args);
    }

};


