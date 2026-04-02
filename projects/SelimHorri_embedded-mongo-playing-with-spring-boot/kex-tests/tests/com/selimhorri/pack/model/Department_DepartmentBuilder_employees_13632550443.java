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

public class Department_DepartmentBuilder_employees_13632550443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;
     Object term979;

    public Department_DepartmentBuilder_employees_13632550443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term954 = newInstance(Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder"));
        setField(term954, term954.getClass(), "id", "DIbeDHICho");
        setField(term954, term954.getClass(), "departmentName", "dJGPlmSRnz");
        setField(term954, term954.getClass(), "employees", null);
        HashMap term980 = new HashMap();
        Set<Object> term1022 =  ((Map) term980).keySet();
        term979 = new HashSet((Collection<? extends Object>) term1022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term979;
        callMethod(klass, "employees", argTypes, term954, args);
    }

};


