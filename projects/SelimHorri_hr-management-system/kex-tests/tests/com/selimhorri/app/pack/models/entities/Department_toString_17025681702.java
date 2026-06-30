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

public class Department_toString_17025681702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5052;

    public Department_toString_17025681702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5053 = new Integer(1639448749);
        HashMap term5080 = new HashMap();
        Set<Object> term5108 =  ((Map) term5080).keySet();
        HashSet term5079 = new HashSet((Collection<? extends Object>) term5108);
        term5052 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5052, term5052.getClass(), "deptno", term5053);
        setField(term5052, term5052.getClass(), "dname", "DfWwbodtVw");
        setField(term5052, term5052.getClass(), "loc", "kTbFMpVWqx");
        setField(term5052, term5052.getClass(), "employees", term5079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5052, args);
    }

};


