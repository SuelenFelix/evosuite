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

public class EmployeeDto_getPassword_2102922223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9262;

    public EmployeeDto_getPassword_2102922223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9262 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term9262, term9262.getClass(), "employeeId", "jiCGTTzKGB");
        setField(term9262, term9262.getClass(), "firstName", "MqICFYzDJj");
        setField(term9262, term9262.getClass(), "lastName", "YgQvdcBQKw");
        setField(term9262, term9262.getClass(), "email", "FiYYLuailz");
        setField(term9262, term9262.getClass(), "phone", "XebAeSnCKZ");
        setField(term9262, term9262.getClass(), "hiredate", "GeddnXjHGy");
        setField(term9262, term9262.getClass(), "job", "vLTbaoAxBm");
        setField(term9262, term9262.getClass(), "salary", "BXTjEyEZxD");
        setField(term9262, term9262.getClass(), "managerId", "oKhVzOKUFW");
        setField(term9262, term9262.getClass(), "username", "mNHyqmOAFy");
        setField(term9262, term9262.getClass(), "password", "UxgSdhxPCH");
        setField(term9262, term9262.getClass(), "role", "DAujxZPHJC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term9262, args);
    }

};


