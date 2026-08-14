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

public class Project_getEnrolledEmployees_1109936249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722;

    public Project_getEnrolledEmployees_1109936249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term723 = new Long(4513004407927379358L);
        HashMap term750 = new HashMap();
        Set<Object> term780 =  ((Map) term750).keySet();
        HashSet term749 = new HashSet((Collection<? extends Object>) term780);
        term722 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term722, term722.getClass(), "id", term723);
        setField(term722, term722.getClass(), "name", "BwtdjiefJn");
        setField(term722, term722.getClass(), "description", "jDmhBrIoDa");
        setField(term722, term722.getClass(), "enrolledEmployees", term749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnrolledEmployees", argTypes, term722, args);
    }

};


