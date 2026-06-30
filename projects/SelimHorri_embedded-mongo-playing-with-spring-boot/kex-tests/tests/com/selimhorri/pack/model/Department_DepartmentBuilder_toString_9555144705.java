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

public class Department_DepartmentBuilder_toString_9555144705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;

    public Department_DepartmentBuilder_toString_9555144705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075 = newInstance(Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder"));
        setField(term1075, term1075.getClass(), "id", "wwAwLLcLPp");
        setField(term1075, term1075.getClass(), "departmentName", "nHpMKOmlpQ");
        setField(term1075, term1075.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department$DepartmentBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1075, args);
    }

};


