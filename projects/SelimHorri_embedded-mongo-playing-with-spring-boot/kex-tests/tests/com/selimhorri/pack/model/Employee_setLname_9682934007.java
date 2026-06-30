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

public class Employee_setLname_9682934007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public Employee_setLname_9682934007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1849 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1886 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1849, term1849.getClass(), "id", "BOvgwHfoHQ");
        setField(term1849, term1849.getClass(), "fname", "hPpFNeDBIb");
        setField(term1849, term1849.getClass(), "lname", "DNOtiLPAIY");
        setField(term1886, term1886.getClass(), "id", "FnEkAHBfyV");
        setField(term1886, term1886.getClass(), "departmentName", "VfmNFpEuax");
        setField(term1886, term1886.getClass(), "employees", null);
        setField(term1849, term1849.getClass(), "department", term1886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QVLresHoaP";
        callMethod(klass, "setLname", argTypes, term1849, args);
    }

};


