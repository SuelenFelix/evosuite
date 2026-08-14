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

public class Employee_getId_18694895202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2910;

    public Employee_getId_18694895202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2911 = new Long(6375119433582206027L);
        HashMap term2938 = new HashMap();
        Set<Object> term2966 =  ((Map) term2938).keySet();
        HashSet term2937 = new HashSet((Collection<? extends Object>) term2966);
        term2910 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term2910, term2910.getClass(), "id", term2911);
        setField(term2910, term2910.getClass(), "name", "nyiiPDVjAc");
        setField(term2910, term2910.getClass(), "role", "aKnKipADSo");
        setField(term2910, term2910.getClass(), "projects", term2937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2910, args);
    }

};


