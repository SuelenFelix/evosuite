package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_getEmployees_4211866008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9561;

    public Department_getEmployees_4211866008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9562 = new Integer(1568948514);
        Integer term9577 = new Integer(-1511130237);
        HashMap term9616 = new HashMap();
        Set<Object> term9679 =  ((Map) term9616).keySet();
        HashSet term9615 = new HashSet((Collection<? extends Object>) term9679);
        HashMap term9623 = new HashMap();
        Set<Object> term9680 =  ((Map) term9623).keySet();
        HashSet term9622 = new HashSet((Collection<? extends Object>) term9680);
        term9561 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9576 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9561, term9561.getClass(), "departmentId", term9562);
        setField(term9561, term9561.getClass(), "departmentName", "lmZBCmpOeb");
        setField(term9576, term9576.getClass(), "locationId", term9577);
        setField(term9576, term9576.getClass(), "adr", "cPlYOAUqsP");
        setField(term9576, term9576.getClass(), "postalCode", "ritBUyuuKt");
        setField(term9576, term9576.getClass(), "city", "YfziBBiPvL");
        setField(term9576, term9576.getClass(), "departments", term9615);
        setField(term9561, term9561.getClass(), "location", term9576);
        setField(term9561, term9561.getClass(), "employees", term9622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployees", argTypes, term9561, args);
    }

};


