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

public class Department_getLoc_18865978967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5395;

    public Department_getLoc_18865978967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5396 = new Integer(-573608449);
        HashMap term5423 = new HashMap();
        Set<Object> term5453 =  ((Map) term5423).keySet();
        HashSet term5422 = new HashSet((Collection<? extends Object>) term5453);
        term5395 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5395, term5395.getClass(), "deptno", term5396);
        setField(term5395, term5395.getClass(), "dname", "uoBijJjvaj");
        setField(term5395, term5395.getClass(), "loc", "BdsLFSRWda");
        setField(term5395, term5395.getClass(), "employees", term5422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoc", argTypes, term5395, args);
    }

};


