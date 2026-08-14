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

public class EmployeeController_updateEmployee_5948547903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3512;
     Object term3562;

    public EmployeeController_updateEmployee_5948547903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3513 = new Long(-6950146046121430355L);
        HashMap term3540 = new HashMap();
        Set<Object> term3584 =  ((Map) term3540).keySet();
        HashSet term3539 = new HashSet((Collection<? extends Object>) term3584);
        term3512 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3512, term3512.getClass(), "id", term3513);
        setField(term3512, term3512.getClass(), "name", "ypEdrstygY");
        setField(term3512, term3512.getClass(), "role", "sNQFlATEeQ");
        setField(term3512, term3512.getClass(), "projects", term3539);
        term3562 = new Long(-1214968196781083707L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.EmployeeController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        argTypes[1] = Class.forName("java.lang.Long");
        Object[] args = new Object[2];
        args[0] = term3512;
        args[1] = term3562;
        callMethod(klass, "updateEmployee", argTypes, null, args);
    }

};


