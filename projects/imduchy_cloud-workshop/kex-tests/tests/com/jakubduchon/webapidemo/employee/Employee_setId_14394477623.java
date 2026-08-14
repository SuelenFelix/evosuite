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

public class Employee_setId_14394477623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2967;
     Object term3009;

    public Employee_setId_14394477623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2968 = new Long(5127676408959197577L);
        HashMap term2995 = new HashMap();
        Set<Object> term3031 =  ((Map) term2995).keySet();
        HashSet term2994 = new HashSet((Collection<? extends Object>) term3031);
        term2967 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term2967, term2967.getClass(), "id", term2968);
        setField(term2967, term2967.getClass(), "name", "whBvTVIIlC");
        setField(term2967, term2967.getClass(), "role", "IgRJUzaCwW");
        setField(term2967, term2967.getClass(), "projects", term2994);
        term3009 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3009;
        callMethod(klass, "setId", argTypes, term2967, args);
    }

};


