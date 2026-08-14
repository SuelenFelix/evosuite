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

public class EmployeeDto_getFirstName_144527671832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10369;

    public EmployeeDto_getFirstName_144527671832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10369 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10369, term10369.getClass(), "employeeId", null);
        setField(term10369, term10369.getClass(), "firstName", null);
        setField(term10369, term10369.getClass(), "lastName", null);
        setField(term10369, term10369.getClass(), "email", null);
        setField(term10369, term10369.getClass(), "phone", null);
        setField(term10369, term10369.getClass(), "hiredate", null);
        setField(term10369, term10369.getClass(), "job", null);
        setField(term10369, term10369.getClass(), "salary", null);
        setField(term10369, term10369.getClass(), "managerId", null);
        setField(term10369, term10369.getClass(), "username", null);
        setField(term10369, term10369.getClass(), "password", null);
        setField(term10369, term10369.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term10369, args);
    }

};


