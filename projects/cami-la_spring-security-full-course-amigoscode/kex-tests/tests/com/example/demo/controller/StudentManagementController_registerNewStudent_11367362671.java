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

public class StudentManagementController_registerNewStudent_11367362671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public StudentManagementController_registerNewStudent_11367362671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.example.demo.controller.StudentManagementController"));
        Long term4 = new Long(2442117782898005296L);
        term3 = newInstance(Class.forName("com.example.demo.student.model.Student"));
        setField(term3, term3.getClass(), "studentId", term4);
        setField(term3, term3.getClass(), "studentName", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.controller.StudentManagementController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.student.model.Student");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "registerNewStudent", argTypes, term2, args);
    }

};


