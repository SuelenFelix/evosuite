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

public class EmployeeDto_setSalary_54663894518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7871;

    public EmployeeDto_setSalary_54663894518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7871 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term7871, term7871.getClass(), "employeeId", "tIpkeYIezR");
        setField(term7871, term7871.getClass(), "firstName", "YkZtEtthvz");
        setField(term7871, term7871.getClass(), "lastName", "dwlZSxlXOo");
        setField(term7871, term7871.getClass(), "email", "lKrEAkypza");
        setField(term7871, term7871.getClass(), "phone", "KtuuNAqGCQ");
        setField(term7871, term7871.getClass(), "hiredate", "OGQsfjmReM");
        setField(term7871, term7871.getClass(), "job", "YsUtbngnRO");
        setField(term7871, term7871.getClass(), "salary", "JisaWUxcNb");
        setField(term7871, term7871.getClass(), "managerId", "NxgmYPzWCI");
        setField(term7871, term7871.getClass(), "username", "SqjyKmayBx");
        setField(term7871, term7871.getClass(), "password", "XjDhvToxJy");
        setField(term7871, term7871.getClass(), "role", "nxSTJflLQy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FlHzxEfFzI";
        callMethod(klass, "setSalary", argTypes, term7871, args);
    }

};


