package com.selimhorri.pack.model;

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
import static com.selimhorri.pack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Employee_setFname_617613906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715;

    public Employee_setFname_617613906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1715 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1752 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1715, term1715.getClass(), "id", "YSrFKQQwXE");
        setField(term1715, term1715.getClass(), "fname", "qxhOsmyyjm");
        setField(term1715, term1715.getClass(), "lname", "DuKcNfVVYR");
        setField(term1752, term1752.getClass(), "id", "fRujHWvXjJ");
        setField(term1752, term1752.getClass(), "departmentName", "EAIAAStlTz");
        setField(term1752, term1752.getClass(), "employees", null);
        setField(term1715, term1715.getClass(), "department", term1752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ujxmmZZcbT";
        callMethod(klass, "setFname", argTypes, term1715, args);
    }

};


