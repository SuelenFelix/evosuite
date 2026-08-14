package com.jakubduchon.webapidemo.employee;

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
import static com.jakubduchon.webapidemo.employee.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Employee_setName_20216775175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3091;

    public Employee_setName_20216775175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3092 = new Long(-4443169559037975007L);
        HashMap term3119 = new HashMap();
        Set<Object> term3161 =  ((Map) term3119).keySet();
        HashSet term3118 = new HashSet((Collection<? extends Object>) term3161);
        term3091 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3091, term3091.getClass(), "id", term3092);
        setField(term3091, term3091.getClass(), "name", "OJJtVNPyKZ");
        setField(term3091, term3091.getClass(), "role", "AKNapTAfmD");
        setField(term3091, term3091.getClass(), "projects", term3118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        callMethod(klass, "setName", argTypes, term3091, args);
    }

};


