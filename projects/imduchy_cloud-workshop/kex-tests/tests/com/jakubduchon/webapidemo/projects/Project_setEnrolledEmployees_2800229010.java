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

public class Project_setEnrolledEmployees_2800229010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;
     Object term827;

    public Project_setEnrolledEmployees_2800229010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term782 = new Long(-8603648071751666348L);
        HashMap term809 = new HashMap();
        Set<Object> term889 =  ((Map) term809).keySet();
        HashSet term808 = new HashSet((Collection<? extends Object>) term889);
        term781 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term781, term781.getClass(), "id", term782);
        setField(term781, term781.getClass(), "name", "yUGCjlqgJE");
        setField(term781, term781.getClass(), "description", "PXdVZyoJyC");
        setField(term781, term781.getClass(), "enrolledEmployees", term808);
        HashMap term828 = new HashMap();
        Set<Object> term890 =  ((Map) term828).keySet();
        term827 = new HashSet((Collection<? extends Object>) term890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term827;
        callMethod(klass, "setEnrolledEmployees", argTypes, term781, args);
    }

};


