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

public class EmployeeDto_getSalary_129927487144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10381;

    public EmployeeDto_getSalary_129927487144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10381 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10381, term10381.getClass(), "employeeId", null);
        setField(term10381, term10381.getClass(), "firstName", null);
        setField(term10381, term10381.getClass(), "lastName", null);
        setField(term10381, term10381.getClass(), "email", null);
        setField(term10381, term10381.getClass(), "phone", null);
        setField(term10381, term10381.getClass(), "hiredate", null);
        setField(term10381, term10381.getClass(), "job", null);
        setField(term10381, term10381.getClass(), "salary", null);
        setField(term10381, term10381.getClass(), "managerId", null);
        setField(term10381, term10381.getClass(), "username", null);
        setField(term10381, term10381.getClass(), "password", null);
        setField(term10381, term10381.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalary", argTypes, term10381, args);
    }

};


