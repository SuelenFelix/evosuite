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

public class Employee_setCredential_71807257955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32129;

    public Employee_setCredential_71807257955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32129 = newInstance(Class.forName("com.pfa.app.model.entity.Employee"));
        setField(term32129, term32129.getClass(), "employeeId", null);
        setField(term32129, term32129.getClass(), "firstName", null);
        setField(term32129, term32129.getClass(), "lastName", null);
        setField(term32129, term32129.getClass(), "email", null);
        setField(term32129, term32129.getClass(), "phone", null);
        setField(term32129, term32129.getClass(), "hiredate", null);
        setField(term32129, term32129.getClass(), "job", null);
        setField(term32129, term32129.getClass(), "salary", null);
        setField(term32129, term32129.getClass(), "manager", null);
        setField(term32129, term32129.getClass(), "employees", null);
        setField(term32129, term32129.getClass(), "assignments", null);
        setField(term32129, term32129.getClass(), "department", null);
        setField(term32129, term32129.getClass(), "credential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Credential");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCredential", argTypes, term32129, args);
    }

};


