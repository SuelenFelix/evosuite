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

public class Employee_toString_182175725112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;

    public Employee_toString_182175725112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2517 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term2554 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2517, term2517.getClass(), "id", "VZwkkQktrm");
        setField(term2517, term2517.getClass(), "fname", "wIuJvIvEMb");
        setField(term2517, term2517.getClass(), "lname", "EyojsbSjWT");
        setField(term2554, term2554.getClass(), "id", "szGicGyWDL");
        setField(term2554, term2554.getClass(), "departmentName", "lkdvUiYwRq");
        setField(term2554, term2554.getClass(), "employees", null);
        setField(term2517, term2517.getClass(), "department", term2554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2517, args);
    }

};


