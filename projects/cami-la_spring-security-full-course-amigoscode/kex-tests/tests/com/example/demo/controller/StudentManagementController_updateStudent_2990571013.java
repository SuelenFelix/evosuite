package com.example.demo.controller;

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
import static com.example.demo.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class StudentManagementController_updateStudent_2990571013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term32;
     Object term34;

    public StudentManagementController_updateStudent_2990571013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("com.example.demo.controller.StudentManagementController"));
        term32 = new Long(-8257434502486459194L);
        Long term35 = new Long(-8400487765614892086L);
        term34 = newInstance(Class.forName("com.example.demo.student.model.Student"));
        setField(term34, term34.getClass(), "studentId", term35);
        setField(term34, term34.getClass(), "studentName", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.controller.StudentManagementController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.example.demo.student.model.Student");
        Object[] args = new Object[2];
        args[0] = term32;
        args[1] = term34;
        callMethod(klass, "updateStudent", argTypes, term31, args);
    }

};


