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

public class EmployeeController_newEmployee_11807317731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3453;

    public EmployeeController_newEmployee_11807317731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3454 = new Long(2135754395358000892L);
        HashMap term3481 = new HashMap();
        Set<Object> term3509 =  ((Map) term3481).keySet();
        HashSet term3480 = new HashSet((Collection<? extends Object>) term3509);
        term3453 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3453, term3453.getClass(), "id", term3454);
        setField(term3453, term3453.getClass(), "name", "gUvcueTURF");
        setField(term3453, term3453.getClass(), "role", "EwQBhZjCIT");
        setField(term3453, term3453.getClass(), "projects", term3480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.EmployeeController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Object[] args = new Object[1];
        args[0] = term3453;
        callMethod(klass, "newEmployee", argTypes, null, args);
    }

};


