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

public class Employee_EmployeeBuilder_department_56316867411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;

    public Employee_EmployeeBuilder_department_56316867411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        setField(term803, term803.getClass(), "id", null);
        setField(term803, term803.getClass(), "fname", null);
        setField(term803, term803.getClass(), "lname", null);
        setField(term803, term803.getClass(), "department", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.pack.model.Department");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "department", argTypes, term803, args);
    }

};


