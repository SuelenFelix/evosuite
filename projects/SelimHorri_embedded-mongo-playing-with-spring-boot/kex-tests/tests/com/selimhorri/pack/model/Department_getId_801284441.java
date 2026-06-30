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

public class Department_getId_801284441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2753;

    public Department_getId_801284441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2779 = new HashMap();
        Set<Object> term2809 =  ((Map) term2779).keySet();
        HashSet term2778 = new HashSet((Collection<? extends Object>) term2809);
        term2753 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2753, term2753.getClass(), "id", "TiEyxWXsra");
        setField(term2753, term2753.getClass(), "departmentName", "TuLgwTZsPP");
        setField(term2753, term2753.getClass(), "employees", term2778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2753, args);
    }

};


