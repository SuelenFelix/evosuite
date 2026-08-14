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

public class Project_setId_2927815034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term412;

    public Project_setId_2927815034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term369 = new Long(-5248475803419977214L);
        HashMap term396 = new HashMap();
        Set<Object> term434 =  ((Map) term396).keySet();
        HashSet term395 = new HashSet((Collection<? extends Object>) term434);
        term368 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term368, term368.getClass(), "id", term369);
        setField(term368, term368.getClass(), "name", "OJJtVNPyKZ");
        setField(term368, term368.getClass(), "description", "AKNapTAfmD");
        setField(term368, term368.getClass(), "enrolledEmployees", term395);
        term412 = new Long(-8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term412;
        callMethod(klass, "setId", argTypes, term368, args);
    }

};


