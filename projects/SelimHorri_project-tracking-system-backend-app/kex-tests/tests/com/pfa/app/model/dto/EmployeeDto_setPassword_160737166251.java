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

public class EmployeeDto_setPassword_160737166251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10388;

    public EmployeeDto_setPassword_160737166251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10388 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term10388, term10388.getClass(), "employeeId", null);
        setField(term10388, term10388.getClass(), "firstName", null);
        setField(term10388, term10388.getClass(), "lastName", null);
        setField(term10388, term10388.getClass(), "email", null);
        setField(term10388, term10388.getClass(), "phone", null);
        setField(term10388, term10388.getClass(), "hiredate", null);
        setField(term10388, term10388.getClass(), "job", null);
        setField(term10388, term10388.getClass(), "salary", null);
        setField(term10388, term10388.getClass(), "managerId", null);
        setField(term10388, term10388.getClass(), "username", null);
        setField(term10388, term10388.getClass(), "password", null);
        setField(term10388, term10388.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword", argTypes, term10388, args);
    }

};


