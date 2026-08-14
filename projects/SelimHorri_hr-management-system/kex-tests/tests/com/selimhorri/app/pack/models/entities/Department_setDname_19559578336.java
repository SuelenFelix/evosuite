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

public class Department_setDname_19559578336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5308;

    public Department_setDname_19559578336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5309 = new Integer(-255317272);
        HashMap term5336 = new HashMap();
        Set<Object> term5378 =  ((Map) term5336).keySet();
        HashSet term5335 = new HashSet((Collection<? extends Object>) term5378);
        term5308 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5308, term5308.getClass(), "deptno", term5309);
        setField(term5308, term5308.getClass(), "dname", "xzGnrvbExX");
        setField(term5308, term5308.getClass(), "loc", "LFZNDELxUZ");
        setField(term5308, term5308.getClass(), "employees", term5335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsTQDxNIld";
        callMethod(klass, "setDname", argTypes, term5308, args);
    }

};


