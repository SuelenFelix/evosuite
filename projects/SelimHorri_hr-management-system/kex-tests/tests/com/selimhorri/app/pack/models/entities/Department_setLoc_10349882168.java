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

public class Department_setLoc_10349882168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5454;

    public Department_setLoc_10349882168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5455 = new Integer(1545119095);
        HashMap term5482 = new HashMap();
        Set<Object> term5526 =  ((Map) term5482).keySet();
        HashSet term5481 = new HashSet((Collection<? extends Object>) term5526);
        term5454 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5454, term5454.getClass(), "deptno", term5455);
        setField(term5454, term5454.getClass(), "dname", "DbZKLwYBgy");
        setField(term5454, term5454.getClass(), "loc", "LnNRVsjmxw");
        setField(term5454, term5454.getClass(), "employees", term5481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oOUHomyJff";
        callMethod(klass, "setLoc", argTypes, term5454, args);
    }

};


