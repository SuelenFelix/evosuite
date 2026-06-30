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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_DepartmentBuilder_departmentName_17342263932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;

    public Department_DepartmentBuilder_departmentName_17342263932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term899 = new HashMap();
        Set<Object> term943 =  ((Map) term899).keySet();
        HashSet term898 = new HashSet((Collection<? extends Object>) term943);
        term873 = newInstance(Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder"));
        setField(term873, term873.getClass(), "id", "UBRmXJmfrt");
        setField(term873, term873.getClass(), "departmentName", "WZzvmIHhzZ");
        setField(term873, term873.getClass(), "employees", term898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TXZAIPQJHt";
        callMethod(klass, "departmentName", argTypes, term873, args);
    }

};


