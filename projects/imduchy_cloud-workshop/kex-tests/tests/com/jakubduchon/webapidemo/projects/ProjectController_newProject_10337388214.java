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

public class ProjectController_newProject_10337388214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;

    public ProjectController_newProject_10337388214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77 = new Long(8428634514691209827L);
        HashMap term104 = new HashMap();
        Set<Object> term132 =  ((Map) term104).keySet();
        HashSet term103 = new HashSet((Collection<? extends Object>) term132);
        term76 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term76, term76.getClass(), "id", term77);
        setField(term76, term76.getClass(), "name", "OWDIEULEFu");
        setField(term76, term76.getClass(), "description", "dWRymuLBtr");
        setField(term76, term76.getClass(), "enrolledEmployees", term103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.ProjectController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "newProject", argTypes, null, args);
    }

};


