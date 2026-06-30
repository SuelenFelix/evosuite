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

public class Employee_getFname_3619070262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;

    public Employee_getFname_3619070262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1237 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1274 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1237, term1237.getClass(), "id", "zMsSLTfGhl");
        setField(term1237, term1237.getClass(), "fname", "bEmHScVZaQ");
        setField(term1237, term1237.getClass(), "lname", "TcuXODkzBV");
        setField(term1274, term1274.getClass(), "id", "coJPjrBZNe");
        setField(term1274, term1274.getClass(), "departmentName", "vMsWjuPTnO");
        setField(term1274, term1274.getClass(), "employees", null);
        setField(term1237, term1237.getClass(), "department", term1274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFname", argTypes, term1237, args);
    }

};


