package com.selimhorri.app.pack.services.impls;

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
import static com.selimhorri.app.pack.services.impls.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DepartmentServiceImpl_update_20002838633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public DepartmentServiceImpl_update_20002838633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term67 = new Integer(-73683645);
        HashMap term94 = new HashMap();
        Set<Object> term124 =  ((Map) term94).keySet();
        HashSet term93 = new HashSet((Collection<? extends Object>) term124);
        term66 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term66, term66.getClass(), "deptno", term67);
        setField(term66, term66.getClass(), "dname", "MLqYREekMl");
        setField(term66, term66.getClass(), "loc", "ytSBIKXogI");
        setField(term66, term66.getClass(), "employees", term93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.services.impls.DepartmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Object[] args = new Object[1];
        args[0] = term66;
        callMethod(klass, "update", argTypes, null, args);
    }

};


