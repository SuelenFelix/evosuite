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

public class Employee_getDepartment_194661658752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32126;

    public Employee_getDepartment_194661658752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32126 = newInstance(Class.forName("com.pfa.app.model.entity.Employee"));
        setField(term32126, term32126.getClass(), "employeeId", null);
        setField(term32126, term32126.getClass(), "firstName", null);
        setField(term32126, term32126.getClass(), "lastName", null);
        setField(term32126, term32126.getClass(), "email", null);
        setField(term32126, term32126.getClass(), "phone", null);
        setField(term32126, term32126.getClass(), "hiredate", null);
        setField(term32126, term32126.getClass(), "job", null);
        setField(term32126, term32126.getClass(), "salary", null);
        setField(term32126, term32126.getClass(), "manager", null);
        setField(term32126, term32126.getClass(), "employees", null);
        setField(term32126, term32126.getClass(), "assignments", null);
        setField(term32126, term32126.getClass(), "department", null);
        setField(term32126, term32126.getClass(), "credential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term32126, args);
    }

};


