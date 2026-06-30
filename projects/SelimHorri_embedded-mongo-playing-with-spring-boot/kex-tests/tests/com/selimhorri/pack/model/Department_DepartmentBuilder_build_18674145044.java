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

public class Department_DepartmentBuilder_build_18674145044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;

    public Department_DepartmentBuilder_build_18674145044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1049 = new HashMap();
        Set<Object> term1074 =  ((Map) term1049).keySet();
        HashSet term1048 = new HashSet((Collection<? extends Object>) term1074);
        term1023 = newInstance(Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder"));
        setField(term1023, term1023.getClass(), "id", "lRORwXipuk");
        setField(term1023, term1023.getClass(), "departmentName", "fVdTcjgHdw");
        setField(term1023, term1023.getClass(), "employees", term1048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1023, args);
    }

};


