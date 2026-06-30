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

public class Employee_init_193877957214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665;

    public Employee_init_193877957214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2665 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2665, term2665.getClass(), "id", "eKcEJRxNSu");
        setField(term2665, term2665.getClass(), "departmentName", "NTXQPWFYSA");
        setField(term2665, term2665.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.selimhorri.pack.model.Department");
        Object[] args = new Object[4];
        args[0] = "tnKbZaCsuj";
        args[1] = "ZFpcYBgLNC";
        args[2] = "VAGkRppBem";
        args[3] = term2665;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


