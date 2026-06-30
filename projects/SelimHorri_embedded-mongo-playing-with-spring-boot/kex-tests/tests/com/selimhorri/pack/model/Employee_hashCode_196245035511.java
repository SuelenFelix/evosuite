package com.selimhorri.pack.model;

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
import static com.selimhorri.pack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Employee_hashCode_196245035511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2397;

    public Employee_hashCode_196245035511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2460 = new HashMap();
        Set<Object> term2516 =  ((Map) term2460).keySet();
        HashSet term2459 = new HashSet((Collection<? extends Object>) term2516);
        term2397 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term2434 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2397, term2397.getClass(), "id", "nSWdsVyJRI");
        setField(term2397, term2397.getClass(), "fname", "JBOPGgGKnc");
        setField(term2397, term2397.getClass(), "lname", "GlPTiCMCGP");
        setField(term2434, term2434.getClass(), "id", "jlcBpLoWfd");
        setField(term2434, term2434.getClass(), "departmentName", "oYymmLqbfJ");
        setField(term2434, term2434.getClass(), "employees", term2459);
        setField(term2397, term2397.getClass(), "department", term2434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2397, args);
    }

};


