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

public class Department_getEmployees_9061802149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5531;

    public Department_getEmployees_9061802149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5532 = new Integer(1499735894);
        HashMap term5559 = new HashMap();
        Set<Object> term5589 =  ((Map) term5559).keySet();
        HashSet term5558 = new HashSet((Collection<? extends Object>) term5589);
        term5531 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5531, term5531.getClass(), "deptno", term5532);
        setField(term5531, term5531.getClass(), "dname", "KnnoLMOuur");
        setField(term5531, term5531.getClass(), "loc", "buRpVghIvt");
        setField(term5531, term5531.getClass(), "employees", term5558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployees", argTypes, term5531, args);
    }

};


