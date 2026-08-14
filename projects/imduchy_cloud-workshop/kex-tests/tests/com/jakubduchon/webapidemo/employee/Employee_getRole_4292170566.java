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

public class Employee_getRole_4292170566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172;

    public Employee_getRole_4292170566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3173 = new Long(-1610676979013636850L);
        HashMap term3200 = new HashMap();
        Set<Object> term3225 =  ((Map) term3200).keySet();
        HashSet term3199 = new HashSet((Collection<? extends Object>) term3225);
        term3172 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3172, term3172.getClass(), "id", term3173);
        setField(term3172, term3172.getClass(), "name", "aWYOWZFyaX");
        setField(term3172, term3172.getClass(), "role", "BRIVNtfUWU");
        setField(term3172, term3172.getClass(), "projects", term3199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term3172, args);
    }

};


