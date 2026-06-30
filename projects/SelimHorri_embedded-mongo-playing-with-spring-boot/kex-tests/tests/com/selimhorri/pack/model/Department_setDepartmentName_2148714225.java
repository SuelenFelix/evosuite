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

public class Department_setDepartmentName_2148714225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2995;

    public Department_setDepartmentName_2148714225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3021 = new HashMap();
        Set<Object> term3061 =  ((Map) term3021).keySet();
        HashSet term3020 = new HashSet((Collection<? extends Object>) term3061);
        term2995 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2995, term2995.getClass(), "id", "zjfMxUERFZ");
        setField(term2995, term2995.getClass(), "departmentName", "ooVlhmiOff");
        setField(term2995, term2995.getClass(), "employees", term3020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CQYmAsjvPU";
        callMethod(klass, "setDepartmentName", argTypes, term2995, args);
    }

};


