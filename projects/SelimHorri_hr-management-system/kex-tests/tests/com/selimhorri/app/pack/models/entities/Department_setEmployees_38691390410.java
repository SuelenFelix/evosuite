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

public class Department_setEmployees_38691390410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5592;
     Object term5636;

    public Department_setEmployees_38691390410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5593 = new Integer(-1631048635);
        HashMap term5620 = new HashMap();
        Set<Object> term5719 =  ((Map) term5620).keySet();
        HashSet term5619 = new HashSet((Collection<? extends Object>) term5719);
        term5592 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5592, term5592.getClass(), "deptno", term5593);
        setField(term5592, term5592.getClass(), "dname", "bqIuFFFwnP");
        setField(term5592, term5592.getClass(), "loc", "hDxvvVgGlk");
        setField(term5592, term5592.getClass(), "employees", term5619);
        HashMap term5637 = new HashMap();
        Set<Object> term5720 =  ((Map) term5637).keySet();
        term5636 = new HashSet((Collection<? extends Object>) term5720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term5636;
        callMethod(klass, "setEmployees", argTypes, term5592, args);
    }

};


