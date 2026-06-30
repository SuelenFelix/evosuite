package com.amigoscode.spring.security.student;

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
import static com.amigoscode.spring.security.student.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StudentManagementController_updateStudent_19834750164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term138;
     Object term140;

    public StudentManagementController_updateStudent_19834750164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.amigoscode.spring.security.student.StudentManagementController"));
        term138 = new Integer(-2038273078);
        Integer term141 = new Integer(1227103734);
        term140 = newInstance(Class.forName("com.amigoscode.spring.security.student.Student"));
        setField(term140, term140.getClass(), "studentId", term141);
        setField(term140, term140.getClass(), "name", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.student.StudentManagementController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("com.amigoscode.spring.security.student.Student");
        Object[] args = new Object[2];
        args[0] = term138;
        args[1] = term140;
        callMethod(klass, "updateStudent", argTypes, term137, args);
    }

};


