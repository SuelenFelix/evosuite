package com.pfa.app.model.dto;

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
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDto_getUsername_103417704548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10385;

    public EmployeeDto_getUsername_103417704548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10385 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10385, term10385.getClass(), "employeeId", null);
        setField(term10385, term10385.getClass(), "firstName", null);
        setField(term10385, term10385.getClass(), "lastName", null);
        setField(term10385, term10385.getClass(), "email", null);
        setField(term10385, term10385.getClass(), "phone", null);
        setField(term10385, term10385.getClass(), "hiredate", null);
        setField(term10385, term10385.getClass(), "job", null);
        setField(term10385, term10385.getClass(), "salary", null);
        setField(term10385, term10385.getClass(), "managerId", null);
        setField(term10385, term10385.getClass(), "username", null);
        setField(term10385, term10385.getClass(), "password", null);
        setField(term10385, term10385.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term10385, args);
    }

};


