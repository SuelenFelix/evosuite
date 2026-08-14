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

public class Project_getId_7228232613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;

    public Project_getId_7228232613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term302 = new Long(-2644215923136513282L);
        HashMap term329 = new HashMap();
        Set<Object> term367 =  ((Map) term329).keySet();
        HashSet term328 = new HashSet((Collection<? extends Object>) term367);
        term301 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term301, term301.getClass(), "id", term302);
        setField(term301, term301.getClass(), "name", "XPKmummaqg");
        setField(term301, term301.getClass(), "description", "BKLfkLiZTH");
        setField(term301, term301.getClass(), "enrolledEmployees", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term301, args);
    }

};


