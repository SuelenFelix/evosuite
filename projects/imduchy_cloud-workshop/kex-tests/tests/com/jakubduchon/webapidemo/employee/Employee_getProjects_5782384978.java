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

public class Employee_getProjects_5782384978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3315;

    public Employee_getProjects_5782384978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3316 = new Long(5510783420697225605L);
        HashMap term3343 = new HashMap();
        Set<Object> term3383 =  ((Map) term3343).keySet();
        HashSet term3342 = new HashSet((Collection<? extends Object>) term3383);
        term3315 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3315, term3315.getClass(), "id", term3316);
        setField(term3315, term3315.getClass(), "name", "wzsPSPcRdj");
        setField(term3315, term3315.getClass(), "role", "kGMQdqJYyB");
        setField(term3315, term3315.getClass(), "projects", term3342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjects", argTypes, term3315, args);
    }

};


