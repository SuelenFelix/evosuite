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

public class Employee_EmployeeBuilder_department_5631686744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;
     Object term473;

    public Employee_EmployeeBuilder_department_5631686744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        Object term448 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term411, term411.getClass(), "id", "XPKmummaqg");
        setField(term411, term411.getClass(), "fname", "BKLfkLiZTH");
        setField(term411, term411.getClass(), "lname", "SPpkrGcPRr");
        setField(term448, term448.getClass(), "id", "sEccwbJKYE");
        setField(term448, term448.getClass(), "departmentName", "AWRooQKkdW");
        setField(term448, term448.getClass(), "employees", null);
        setField(term411, term411.getClass(), "department", term448);
        term473 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term473, term473.getClass(), "id", "xIeFjkHkOe");
        setField(term473, term473.getClass(), "departmentName", "SdCKLMIYnX");
        setField(term473, term473.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.pack.model.Department");
        Object[] args = new Object[1];
        args[0] = term473;
        callMethod(klass, "department", argTypes, term411, args);
    }

};


