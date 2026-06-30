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

public class Department_getDname_15322894175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5243;

    public Department_getDname_15322894175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5244 = new Integer(612177768);
        HashMap term5271 = new HashMap();
        Set<Object> term5305 =  ((Map) term5271).keySet();
        HashSet term5270 = new HashSet((Collection<? extends Object>) term5305);
        term5243 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5243, term5243.getClass(), "deptno", term5244);
        setField(term5243, term5243.getClass(), "dname", "kEehLMZcOU");
        setField(term5243, term5243.getClass(), "loc", "RhLliqMiOF");
        setField(term5243, term5243.getClass(), "employees", term5270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDname", argTypes, term5243, args);
    }

};


