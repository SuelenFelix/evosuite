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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Employee_setId_3290026245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1573;

    public Employee_setId_3290026245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1636 = new HashMap();
        Set<Object> term1704 =  ((Map) term1636).keySet();
        HashSet term1635 = new HashSet((Collection<? extends Object>) term1704);
        term1573 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term1610 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1573, term1573.getClass(), "id", "wmVoFoUVmU");
        setField(term1573, term1573.getClass(), "fname", "lLiSiPCciB");
        setField(term1573, term1573.getClass(), "lname", "PsMKIIEwdR");
        setField(term1610, term1610.getClass(), "id", "RbQmXqfXAT");
        setField(term1610, term1610.getClass(), "departmentName", "fcCAsvfBbe");
        setField(term1610, term1610.getClass(), "employees", term1635);
        setField(term1573, term1573.getClass(), "department", term1610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zyZTzHNjQr";
        callMethod(klass, "setId", argTypes, term1573, args);
    }

};


