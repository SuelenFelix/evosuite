package com.jakubduchon.webapidemo.projects;

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
import static com.jakubduchon.webapidemo.projects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Project_setName_8750112586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;

    public Project_setName_8750112586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term499 = new Long(-5786861555969446503L);
        HashMap term526 = new HashMap();
        Set<Object> term572 =  ((Map) term526).keySet();
        HashSet term525 = new HashSet((Collection<? extends Object>) term572);
        term498 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term498, term498.getClass(), "id", term499);
        setField(term498, term498.getClass(), "name", "XJJNClzHRf");
        setField(term498, term498.getClass(), "description", "HDaezxQfQR");
        setField(term498, term498.getClass(), "enrolledEmployees", term525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HBGNxdNURv";
        callMethod(klass, "setName", argTypes, term498, args);
    }

};


