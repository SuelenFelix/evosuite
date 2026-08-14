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

public class Employee_setPhone_63702564039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32113;

    public Employee_setPhone_63702564039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32113 = newInstance(Class.forName("com.pfa.app.model.entity.Employee"));
        setField(term32113, term32113.getClass(), "employeeId", null);
        setField(term32113, term32113.getClass(), "firstName", null);
        setField(term32113, term32113.getClass(), "lastName", null);
        setField(term32113, term32113.getClass(), "email", null);
        setField(term32113, term32113.getClass(), "phone", null);
        setField(term32113, term32113.getClass(), "hiredate", null);
        setField(term32113, term32113.getClass(), "job", null);
        setField(term32113, term32113.getClass(), "salary", null);
        setField(term32113, term32113.getClass(), "manager", null);
        setField(term32113, term32113.getClass(), "employees", null);
        setField(term32113, term32113.getClass(), "assignments", null);
        setField(term32113, term32113.getClass(), "department", null);
        setField(term32113, term32113.getClass(), "credential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhone", argTypes, term32113, args);
    }

};


