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

public class EmployeeDto_getManagerId_161682093346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10383;

    public EmployeeDto_getManagerId_161682093346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10383 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10383, term10383.getClass(), "employeeId", null);
        setField(term10383, term10383.getClass(), "firstName", null);
        setField(term10383, term10383.getClass(), "lastName", null);
        setField(term10383, term10383.getClass(), "email", null);
        setField(term10383, term10383.getClass(), "phone", null);
        setField(term10383, term10383.getClass(), "hiredate", null);
        setField(term10383, term10383.getClass(), "job", null);
        setField(term10383, term10383.getClass(), "salary", null);
        setField(term10383, term10383.getClass(), "managerId", null);
        setField(term10383, term10383.getClass(), "username", null);
        setField(term10383, term10383.getClass(), "password", null);
        setField(term10383, term10383.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getManagerId", argTypes, term10383, args);
    }

};


