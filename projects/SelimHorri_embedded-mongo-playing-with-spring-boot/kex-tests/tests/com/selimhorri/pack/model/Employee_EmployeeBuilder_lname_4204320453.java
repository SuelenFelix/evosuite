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

public class Employee_EmployeeBuilder_lname_4204320453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public Employee_EmployeeBuilder_lname_4204320453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term332 = new HashMap();
        Set<Object> term400 =  ((Map) term332).keySet();
        HashSet term331 = new HashSet((Collection<? extends Object>) term400);
        term269 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        Object term306 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term269, term269.getClass(), "id", "MLqYREekMl");
        setField(term269, term269.getClass(), "fname", "ytSBIKXogI");
        setField(term269, term269.getClass(), "lname", "nHXjMycHlU");
        setField(term306, term306.getClass(), "id", "ieCtQFdkii");
        setField(term306, term306.getClass(), "departmentName", "dEnhdmILtU");
        setField(term306, term306.getClass(), "employees", term331);
        setField(term269, term269.getClass(), "department", term306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "lname", argTypes, term269, args);
    }

};


