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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_setEmployees_4546130936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;
     Object term3108;

    public Department_setEmployees_4546130936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3098 = new HashMap();
        Set<Object> term3134 =  ((Map) term3098).keySet();
        HashSet term3097 = new HashSet((Collection<? extends Object>) term3134);
        term3072 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term3072, term3072.getClass(), "id", "NNkIIFpxiB");
        setField(term3072, term3072.getClass(), "departmentName", "sBmtvFPDso");
        setField(term3072, term3072.getClass(), "employees", term3097);
        HashMap term3109 = new HashMap();
        Set<Object> term3135 =  ((Map) term3109).keySet();
        term3108 = new HashSet((Collection<? extends Object>) term3135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term3108;
        callMethod(klass, "setEmployees", argTypes, term3072, args);
    }

};


