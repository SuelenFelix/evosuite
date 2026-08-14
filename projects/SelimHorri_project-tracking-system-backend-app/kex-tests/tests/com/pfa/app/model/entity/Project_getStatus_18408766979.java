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

public class Project_getStatus_18408766979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41481;

    public Project_getStatus_18408766979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41482 = new Integer(-1417720854);
        HashMap term41517 = new HashMap();
        Set<Object> term41547 =  ((Map) term41517).keySet();
        HashSet term41516 = new HashSet((Collection<? extends Object>) term41547);
        term41481 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41496 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41500 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41481, term41481.getClass(), "projectId", term41482);
        setField(term41481, term41481.getClass(), "title", "kHaNkhgOjo");
        setIntField(term41496, term41496.getClass(), "year", 2012);
        setShortField(term41496, term41496.getClass(), "month", (short) 5);
        setShortField(term41496, term41496.getClass(), "day", (short) 9);
        setField(term41481, term41481.getClass(), "startDate", term41496);
        setIntField(term41500, term41500.getClass(), "year", 2025);
        setShortField(term41500, term41500.getClass(), "month", (short) 5);
        setShortField(term41500, term41500.getClass(), "day", (short) 17);
        setField(term41481, term41481.getClass(), "endDate", term41500);
        setField(term41481, term41481.getClass(), "status", "nWDCnQtxKC");
        setField(term41481, term41481.getClass(), "assignments", term41516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term41481, args);
    }

};


