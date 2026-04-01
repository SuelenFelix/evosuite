package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_getEmployees_9061802149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5537;

    public Department_getEmployees_9061802149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5538 = new Integer(1499735894);
        HashMap term5565 = new HashMap();
        Set<Object> term5595 =  ((Map) term5565).keySet();
        HashSet term5564 = new HashSet((Collection<? extends Object>) term5595);
        term5537 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5537, term5537.getClass(), "deptno", term5538);
        setField(term5537, term5537.getClass(), "dname", "KnnoLMOuur");
        setField(term5537, term5537.getClass(), "loc", "buRpVghIvt");
        setField(term5537, term5537.getClass(), "employees", term5564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployees", argTypes, term5537, args);
    }

};


