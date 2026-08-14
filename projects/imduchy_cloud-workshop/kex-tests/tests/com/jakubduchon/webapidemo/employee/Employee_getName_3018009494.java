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

public class Employee_getName_3018009494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3032;

    public Employee_getName_3018009494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3033 = new Long(-6823727938421990489L);
        HashMap term3060 = new HashMap();
        Set<Object> term3090 =  ((Map) term3060).keySet();
        HashSet term3059 = new HashSet((Collection<? extends Object>) term3090);
        term3032 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term3032, term3032.getClass(), "id", term3033);
        setField(term3032, term3032.getClass(), "name", "SPpkrGcPRr");
        setField(term3032, term3032.getClass(), "role", "sEccwbJKYE");
        setField(term3032, term3032.getClass(), "projects", term3059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3032, args);
    }

};


