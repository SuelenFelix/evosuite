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

public class EmployeeDto_getLastName_46565600034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10371;

    public EmployeeDto_getLastName_46565600034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10371 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10371, term10371.getClass(), "employeeId", null);
        setField(term10371, term10371.getClass(), "firstName", null);
        setField(term10371, term10371.getClass(), "lastName", null);
        setField(term10371, term10371.getClass(), "email", null);
        setField(term10371, term10371.getClass(), "phone", null);
        setField(term10371, term10371.getClass(), "hiredate", null);
        setField(term10371, term10371.getClass(), "job", null);
        setField(term10371, term10371.getClass(), "salary", null);
        setField(term10371, term10371.getClass(), "managerId", null);
        setField(term10371, term10371.getClass(), "username", null);
        setField(term10371, term10371.getClass(), "password", null);
        setField(term10371, term10371.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term10371, args);
    }

};


