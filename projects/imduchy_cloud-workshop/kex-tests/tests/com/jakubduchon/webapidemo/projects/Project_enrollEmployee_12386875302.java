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

public class Project_enrollEmployee_12386875302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term221;

    public Project_enrollEmployee_12386875302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186 = new Long(-4365849114644724155L);
        HashMap term213 = new HashMap();
        Set<Object> term279 =  ((Map) term213).keySet();
        HashSet term212 = new HashSet((Collection<? extends Object>) term279);
        term185 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term185, term185.getClass(), "id", term186);
        setField(term185, term185.getClass(), "name", "xrwlQZdwCp");
        setField(term185, term185.getClass(), "description", "IDCWpPLRkE");
        setField(term185, term185.getClass(), "enrolledEmployees", term212);
        Long term222 = new Long(-8708192233349544946L);
        HashMap term249 = new HashMap();
        Set<Object> term300 =  ((Map) term249).keySet();
        HashSet term248 = new HashSet((Collection<? extends Object>) term300);
        term221 = newInstance(Class.forName("com.jakubduchon.webapidemo.employee.Employee"));
        setField(term221, term221.getClass(), "id", term222);
        setField(term221, term221.getClass(), "name", "kBdSllIBVz");
        setField(term221, term221.getClass(), "role", "TJmVBGfTML");
        setField(term221, term221.getClass(), "projects", term248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.jakubduchon.webapidemo.employee.Employee");
        Object[] args = new Object[1];
        args[0] = term221;
        callMethod(klass, "enrollEmployee", argTypes, term185, args);
    }

};


