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

public class Employee_EmployeeBuilder_fname_14504868352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public Employee_EmployeeBuilder_fname_14504868352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        Object term172 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term135, term135.getClass(), "id", "dWRymuLBtr");
        setField(term135, term135.getClass(), "fname", "AijpHYOFuy");
        setField(term135, term135.getClass(), "lname", "SbAoxhfrkn");
        setField(term172, term172.getClass(), "id", "kuTXqwMtDB");
        setField(term172, term172.getClass(), "departmentName", "Ghbwtircqb");
        setField(term172, term172.getClass(), "employees", null);
        setField(term135, term135.getClass(), "department", term172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "fname", argTypes, term135, args);
    }

};


