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
     Object term5389;

    public Department_getLoc_18865978967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5390 = new Integer(-573608449);
        HashMap term5417 = new HashMap();
        Set<Object> term5447 =  ((Map) term5417).keySet();
        HashSet term5416 = new HashSet((Collection<? extends Object>) term5447);
        term5389 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5389, term5389.getClass(), "deptno", term5390);
        setField(term5389, term5389.getClass(), "dname", "uoBijJjvaj");
        setField(term5389, term5389.getClass(), "loc", "BdsLFSRWda");
        setField(term5389, term5389.getClass(), "employees", term5416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoc", argTypes, term5389, args);
    }

};


