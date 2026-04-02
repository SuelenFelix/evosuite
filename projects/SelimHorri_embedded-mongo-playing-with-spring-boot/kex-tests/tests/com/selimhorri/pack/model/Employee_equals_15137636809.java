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

public class Employee_equals_15137636809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;
     Object term2232;

    public Employee_equals_15137636809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2226 = new HashMap();
        Set<Object> term2283 =  ((Map) term2226).keySet();
        HashSet term2225 = new HashSet((Collection<? extends Object>) term2283);
        term2163 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term2200 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2163, term2163.getClass(), "id", "gFUWMydGCU");
        setField(term2163, term2163.getClass(), "fname", "LLegSTfqJt");
        setField(term2163, term2163.getClass(), "lname", "XQfmqLbqHS");
        setField(term2200, term2200.getClass(), "id", "jLVLqQSjqg");
        setField(term2200, term2200.getClass(), "departmentName", "JKGueoHesL");
        setField(term2200, term2200.getClass(), "employees", term2225);
        setField(term2163, term2163.getClass(), "department", term2200);
        term2232 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2232;
        callMethod(klass, "equals", argTypes, term2163, args);
    }

};


