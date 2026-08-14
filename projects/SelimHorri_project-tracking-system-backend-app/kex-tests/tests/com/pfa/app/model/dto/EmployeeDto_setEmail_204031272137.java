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

public class EmployeeDto_setEmail_204031272137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10374;

    public EmployeeDto_setEmail_204031272137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10374 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10374, term10374.getClass(), "employeeId", null);
        setField(term10374, term10374.getClass(), "firstName", null);
        setField(term10374, term10374.getClass(), "lastName", null);
        setField(term10374, term10374.getClass(), "email", null);
        setField(term10374, term10374.getClass(), "phone", null);
        setField(term10374, term10374.getClass(), "hiredate", null);
        setField(term10374, term10374.getClass(), "job", null);
        setField(term10374, term10374.getClass(), "salary", null);
        setField(term10374, term10374.getClass(), "managerId", null);
        setField(term10374, term10374.getClass(), "username", null);
        setField(term10374, term10374.getClass(), "password", null);
        setField(term10374, term10374.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term10374, args);
    }

};


