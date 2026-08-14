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

public class Project_setProjectId_17603951013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41786;
     Object term41834;

    public Project_setProjectId_17603951013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41787 = new Integer(-255278880);
        HashMap term41822 = new HashMap();
        Set<Object> term41856 =  ((Map) term41822).keySet();
        HashSet term41821 = new HashSet((Collection<? extends Object>) term41856);
        term41786 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41805 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41786, term41786.getClass(), "projectId", term41787);
        setField(term41786, term41786.getClass(), "title", "AccEBvkfGm");
        setIntField(term41801, term41801.getClass(), "year", 2022);
        setShortField(term41801, term41801.getClass(), "month", (short) 9);
        setShortField(term41801, term41801.getClass(), "day", (short) 12);
        setField(term41786, term41786.getClass(), "startDate", term41801);
        setIntField(term41805, term41805.getClass(), "year", 2015);
        setShortField(term41805, term41805.getClass(), "month", (short) 3);
        setShortField(term41805, term41805.getClass(), "day", (short) 22);
        setField(term41786, term41786.getClass(), "endDate", term41805);
        setField(term41786, term41786.getClass(), "status", "RXhiAWuHdv");
        setField(term41786, term41786.getClass(), "assignments", term41821);
        term41834 = new Integer(-400305198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term41834;
        callMethod(klass, "setProjectId", argTypes, term41786, args);
    }

};


