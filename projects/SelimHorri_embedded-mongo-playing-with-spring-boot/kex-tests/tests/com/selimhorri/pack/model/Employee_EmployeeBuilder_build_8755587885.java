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

public class Employee_EmployeeBuilder_build_8755587885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;

    public Employee_EmployeeBuilder_build_8755587885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        Object term605 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term568, term568.getClass(), "id", "sQvGcVjdEx");
        setField(term568, term568.getClass(), "fname", "rLHAoqXgPh");
        setField(term568, term568.getClass(), "lname", "zUlRdimJtU");
        setField(term605, term605.getClass(), "id", "vwbEQQNQrx");
        setField(term605, term605.getClass(), "departmentName", "xtftXXMbem");
        setField(term605, term605.getClass(), "employees", null);
        setField(term568, term568.getClass(), "department", term605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term568, args);
    }

};


