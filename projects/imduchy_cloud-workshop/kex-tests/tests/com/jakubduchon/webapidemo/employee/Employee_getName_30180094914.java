package com.jakubduchon.webapidemo.employee;

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
import static com.jakubduchon.webapidemo.employee.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Employee_getName_30180094914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3447;

    public Employee_getName_30180094914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3447 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3447, term3447.getClass(), "id", null);
        setField(term3447, term3447.getClass(), "name", null);
        setField(term3447, term3447.getClass(), "role", null);
        setField(term3447, term3447.getClass(), "projects", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3447, args);
    }

};


