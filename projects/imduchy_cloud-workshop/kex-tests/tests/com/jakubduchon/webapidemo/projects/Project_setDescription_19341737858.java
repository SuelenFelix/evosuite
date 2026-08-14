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

public class Project_setDescription_19341737858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public Project_setDescription_19341737858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term647 = new Long(8802866251294305945L);
        HashMap term674 = new HashMap();
        Set<Object> term711 =  ((Map) term674).keySet();
        HashSet term673 = new HashSet((Collection<? extends Object>) term711);
        term646 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term646, term646.getClass(), "id", term647);
        setField(term646, term646.getClass(), "name", "onQLVONGuf");
        setField(term646, term646.getClass(), "description", "SOrEHbcbmn");
        setField(term646, term646.getClass(), "enrolledEmployees", term673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        callMethod(klass, "setDescription", argTypes, term646, args);
    }

};


