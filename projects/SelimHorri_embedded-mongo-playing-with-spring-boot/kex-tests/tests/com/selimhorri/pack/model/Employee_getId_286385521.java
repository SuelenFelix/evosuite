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

public class Employee_getId_286385521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;

    public Employee_getId_286385521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1125 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1162 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1125, term1125.getClass(), "id", "ceCWHUTQUM");
        setField(term1125, term1125.getClass(), "fname", "LrqwfrKKtS");
        setField(term1125, term1125.getClass(), "lname", "ZUdnQXfzCI");
        setField(term1162, term1162.getClass(), "id", "EULDrUNQvw");
        setField(term1162, term1162.getClass(), "departmentName", "BtvAvsJSei");
        setField(term1162, term1162.getClass(), "employees", null);
        setField(term1125, term1125.getClass(), "department", term1162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1125, args);
    }

};


