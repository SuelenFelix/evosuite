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

public class Employee_getLname_13919618163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;

    public Employee_getLname_13919618163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1349 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1386 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1349, term1349.getClass(), "id", "mvfDtZNEHr");
        setField(term1349, term1349.getClass(), "fname", "bvSgmFUDOU");
        setField(term1349, term1349.getClass(), "lname", "XMHwbfiHRl");
        setField(term1386, term1386.getClass(), "id", "bucTnYicnp");
        setField(term1386, term1386.getClass(), "departmentName", "EkgprvqZlM");
        setField(term1386, term1386.getClass(), "employees", null);
        setField(term1349, term1349.getClass(), "department", term1386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLname", argTypes, term1349, args);
    }

};


