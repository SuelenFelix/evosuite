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

public class Department_equals_15652535727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3136;
     Object term3172;

    public Department_equals_15652535727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3162 = new HashMap();
        Set<Object> term3193 =  ((Map) term3162).keySet();
        HashSet term3161 = new HashSet((Collection<? extends Object>) term3193);
        term3136 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term3136, term3136.getClass(), "id", "LvLbdICdfA");
        setField(term3136, term3136.getClass(), "departmentName", "rtifrlITwl");
        setField(term3136, term3136.getClass(), "employees", term3161);
        term3172 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3172;
        callMethod(klass, "equals", argTypes, term3136, args);
    }

};


