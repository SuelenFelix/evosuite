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

public class Project_getTitle_18261043653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41042;

    public Project_getTitle_18261043653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41043 = new Integer(-456155591);
        HashMap term41078 = new HashMap();
        Set<Object> term41110 =  ((Map) term41078).keySet();
        HashSet term41077 = new HashSet((Collection<? extends Object>) term41110);
        term41042 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41061 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41042, term41042.getClass(), "projectId", term41043);
        setField(term41042, term41042.getClass(), "title", "ouSqIuBxkU");
        setIntField(term41057, term41057.getClass(), "year", 2016);
        setShortField(term41057, term41057.getClass(), "month", (short) 5);
        setShortField(term41057, term41057.getClass(), "day", (short) 9);
        setField(term41042, term41042.getClass(), "startDate", term41057);
        setIntField(term41061, term41061.getClass(), "year", 2013);
        setShortField(term41061, term41061.getClass(), "month", (short) 9);
        setShortField(term41061, term41061.getClass(), "day", (short) 14);
        setField(term41042, term41042.getClass(), "endDate", term41061);
        setField(term41042, term41042.getClass(), "status", "PIskQzLbQC");
        setField(term41042, term41042.getClass(), "assignments", term41077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term41042, args);
    }

};


