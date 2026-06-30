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

public class Employee_getDepartment_8064655154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1461;

    public Employee_getDepartment_8064655154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1461 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1498 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1461, term1461.getClass(), "id", "uWqXrwAsDU");
        setField(term1461, term1461.getClass(), "fname", "hgFbWAUtsu");
        setField(term1461, term1461.getClass(), "lname", "HqoTWlkbwF");
        setField(term1498, term1498.getClass(), "id", "CwNELDTAPP");
        setField(term1498, term1498.getClass(), "departmentName", "GSzQdbHLHw");
        setField(term1498, term1498.getClass(), "employees", null);
        setField(term1461, term1461.getClass(), "department", term1498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term1461, args);
    }

};


