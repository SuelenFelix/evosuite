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

public class Department_getDeptno_1341844473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5109;

    public Department_getDeptno_1341844473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5110 = new Integer(213831054);
        HashMap term5137 = new HashMap();
        Set<Object> term5177 =  ((Map) term5137).keySet();
        HashSet term5136 = new HashSet((Collection<? extends Object>) term5177);
        term5109 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5109, term5109.getClass(), "deptno", term5110);
        setField(term5109, term5109.getClass(), "dname", "ZKVeStsSNT");
        setField(term5109, term5109.getClass(), "loc", "cqCXYaAnFB");
        setField(term5109, term5109.getClass(), "employees", term5136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeptno", argTypes, term5109, args);
    }

};


