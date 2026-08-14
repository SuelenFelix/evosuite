package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Employee_getSalary_9844046444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32118;

    public Employee_getSalary_9844046444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32118 = newInstance(Class.forName("com.pfa.app.model.entity.Employee"));
        setField(term32118, term32118.getClass(), "employeeId", null);
        setField(term32118, term32118.getClass(), "firstName", null);
        setField(term32118, term32118.getClass(), "lastName", null);
        setField(term32118, term32118.getClass(), "email", null);
        setField(term32118, term32118.getClass(), "phone", null);
        setField(term32118, term32118.getClass(), "hiredate", null);
        setField(term32118, term32118.getClass(), "job", null);
        setField(term32118, term32118.getClass(), "salary", null);
        setField(term32118, term32118.getClass(), "manager", null);
        setField(term32118, term32118.getClass(), "employees", null);
        setField(term32118, term32118.getClass(), "assignments", null);
        setField(term32118, term32118.getClass(), "department", null);
        setField(term32118, term32118.getClass(), "credential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalary", argTypes, term32118, args);
    }

};


