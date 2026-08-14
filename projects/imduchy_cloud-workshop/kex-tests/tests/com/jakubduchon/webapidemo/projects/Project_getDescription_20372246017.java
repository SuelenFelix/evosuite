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

public class Project_getDescription_20372246017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public Project_getDescription_20372246017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term584 = new Long(-900457279156388404L);
        HashMap term611 = new HashMap();
        Set<Object> term645 =  ((Map) term611).keySet();
        HashSet term610 = new HashSet((Collection<? extends Object>) term645);
        term583 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term583, term583.getClass(), "id", term584);
        setField(term583, term583.getClass(), "name", "mfCpTPPQQm");
        setField(term583, term583.getClass(), "description", "OcJCIDNIXA");
        setField(term583, term583.getClass(), "enrolledEmployees", term610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term583, args);
    }

};


