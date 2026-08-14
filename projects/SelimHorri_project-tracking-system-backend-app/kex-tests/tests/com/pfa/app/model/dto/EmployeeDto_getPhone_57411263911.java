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

public class EmployeeDto_getPhone_57411263911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5950;

    public EmployeeDto_getPhone_57411263911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5950 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term5950, term5950.getClass(), "employeeId", "RxbhrFBjkO");
        setField(term5950, term5950.getClass(), "firstName", "aanyiAOJCl");
        setField(term5950, term5950.getClass(), "lastName", "VDokbsCuqq");
        setField(term5950, term5950.getClass(), "email", "xClUIcPECX");
        setField(term5950, term5950.getClass(), "phone", "avhRaGZaBF");
        setField(term5950, term5950.getClass(), "hiredate", "JkgoRtImdE");
        setField(term5950, term5950.getClass(), "job", "qFGKIJjlmV");
        setField(term5950, term5950.getClass(), "salary", "IHqvyhMtuM");
        setField(term5950, term5950.getClass(), "managerId", "dAldIGYAXV");
        setField(term5950, term5950.getClass(), "username", "mLwibAPEsa");
        setField(term5950, term5950.getClass(), "password", "zsWKWiTFuo");
        setField(term5950, term5950.getClass(), "role", "UPUbwyHQKN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term5950, args);
    }

};


