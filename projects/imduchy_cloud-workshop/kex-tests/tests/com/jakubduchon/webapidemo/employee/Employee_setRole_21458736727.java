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

public class Employee_setRole_21458736727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;

    public Employee_setRole_21458736727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3227 = new Long(2062173786000223358L);
        HashMap term3254 = new HashMap();
        Set<Object> term3304 =  ((Map) term3254).keySet();
        HashSet term3253 = new HashSet((Collection<? extends Object>) term3304);
        term3226 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3226, term3226.getClass(), "id", term3227);
        setField(term3226, term3226.getClass(), "name", "DbiCVtPPCT");
        setField(term3226, term3226.getClass(), "role", "WzFopsaDuG");
        setField(term3226, term3226.getClass(), "projects", term3253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PgPzMSEjjX";
        callMethod(klass, "setRole", argTypes, term3226, args);
    }

};


