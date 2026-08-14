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

public class EmployeeDto_setJob_197995320016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7319;

    public EmployeeDto_setJob_197995320016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7319 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term7319, term7319.getClass(), "employeeId", "HhEaSXWvrY");
        setField(term7319, term7319.getClass(), "firstName", "CVRGEomOth");
        setField(term7319, term7319.getClass(), "lastName", "vSeruUyNWX");
        setField(term7319, term7319.getClass(), "email", "UkKvaeJfEC");
        setField(term7319, term7319.getClass(), "phone", "WPxXsahPRq");
        setField(term7319, term7319.getClass(), "hiredate", "IENRuqmwUU");
        setField(term7319, term7319.getClass(), "job", "GsWxOwXvSu");
        setField(term7319, term7319.getClass(), "salary", "bKBSncrMEZ");
        setField(term7319, term7319.getClass(), "managerId", "yeSXGqQExb");
        setField(term7319, term7319.getClass(), "username", "uXYcXVYJZM");
        setField(term7319, term7319.getClass(), "password", "BJhjdJUhkz");
        setField(term7319, term7319.getClass(), "role", "cdHYQDgUZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        callMethod(klass, "setJob", argTypes, term7319, args);
    }

};


