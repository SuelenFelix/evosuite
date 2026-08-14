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

public class ProjectController_updateProject_17507935943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term53;

    public ProjectController_updateProject_17507935943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10 = new Long(5270370404989704783L);
        HashMap term37 = new HashMap();
        Set<Object> term75 =  ((Map) term37).keySet();
        HashSet term36 = new HashSet((Collection<? extends Object>) term75);
        term9 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term9, term9.getClass(), "id", term10);
        setField(term9, term9.getClass(), "name", "PAEBtnZtTD");
        setField(term9, term9.getClass(), "description", "sjlJAEtRrb");
        setField(term9, term9.getClass(), "enrolledEmployees", term36);
        term53 = new Long(-4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.ProjectController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        argTypes[1] = Class.forName("java.lang.Long");
        Object[] args = new Object[2];
        args[0] = term9;
        args[1] = term53;
        callMethod(klass, "updateProject", argTypes, null, args);
    }

};


