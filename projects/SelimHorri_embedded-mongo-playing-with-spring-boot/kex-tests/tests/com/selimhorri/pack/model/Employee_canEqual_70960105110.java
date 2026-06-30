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

public class Employee_canEqual_70960105110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;
     Object term2346;

    public Employee_canEqual_70960105110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2284 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term2321 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2284, term2284.getClass(), "id", "Bcivwcjece");
        setField(term2284, term2284.getClass(), "fname", "QTefjRuiez");
        setField(term2284, term2284.getClass(), "lname", "SQZVNkAVBB");
        setField(term2321, term2321.getClass(), "id", "mrSAYJlddZ");
        setField(term2321, term2321.getClass(), "departmentName", "KbwxawvYsw");
        setField(term2321, term2321.getClass(), "employees", null);
        setField(term2284, term2284.getClass(), "department", term2321);
        term2346 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2346;
        callMethod(klass, "canEqual", argTypes, term2284, args);
    }

};


