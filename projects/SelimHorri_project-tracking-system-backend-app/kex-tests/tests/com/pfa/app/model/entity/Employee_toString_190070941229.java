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

public class Employee_toString_190070941229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32103;

    public Employee_toString_190070941229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32103 = newInstance(Class.forName("com.pfa.app.model.entity.Employee"));
        setField(term32103, term32103.getClass(), "employeeId", null);
        setField(term32103, term32103.getClass(), "firstName", null);
        setField(term32103, term32103.getClass(), "lastName", null);
        setField(term32103, term32103.getClass(), "email", null);
        setField(term32103, term32103.getClass(), "phone", null);
        setField(term32103, term32103.getClass(), "hiredate", null);
        setField(term32103, term32103.getClass(), "job", null);
        setField(term32103, term32103.getClass(), "salary", null);
        setField(term32103, term32103.getClass(), "manager", null);
        setField(term32103, term32103.getClass(), "employees", null);
        setField(term32103, term32103.getClass(), "assignments", null);
        setField(term32103, term32103.getClass(), "department", null);
        setField(term32103, term32103.getClass(), "credential", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32103, args);
    }

};


