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

public class StudentManagementController_registerNewStudent_1383192762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;
     Object term109;

    public StudentManagementController_registerNewStudent_1383192762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108 = newInstance(Class.forName("com.amigoscode.spring.security.student.StudentManagementController"));
        Integer term110 = new Integer(-616727354);
        term109 = newInstance(Class.forName("com.amigoscode.spring.security.student.Student"));
        setField(term109, term109.getClass(), "studentId", term110);
        setField(term109, term109.getClass(), "name", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.student.StudentManagementController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amigoscode.spring.security.student.Student");
        Object[] args = new Object[1];
        args[0] = term109;
        callMethod(klass, "registerNewStudent", argTypes, term108, args);
    }

};


