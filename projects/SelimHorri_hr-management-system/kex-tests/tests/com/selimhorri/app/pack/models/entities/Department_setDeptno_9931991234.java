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

public class Department_setDeptno_9931991234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5176;
     Object term5222;

    public Department_setDeptno_9931991234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5177 = new Integer(-1428063820);
        HashMap term5204 = new HashMap();
        Set<Object> term5244 =  ((Map) term5204).keySet();
        HashSet term5203 = new HashSet((Collection<? extends Object>) term5244);
        term5176 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5176, term5176.getClass(), "deptno", term5177);
        setField(term5176, term5176.getClass(), "dname", "rdiIyXfRtL");
        setField(term5176, term5176.getClass(), "loc", "douzkltmiI");
        setField(term5176, term5176.getClass(), "employees", term5203);
        term5222 = new Integer(-1415256843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5222;
        callMethod(klass, "setDeptno", argTypes, term5176, args);
    }

};


