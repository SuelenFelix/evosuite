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

public class Project_setStatus_60817678310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41548;

    public Project_setStatus_60817678310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41549 = new Integer(-460066219);
        HashMap term41584 = new HashMap();
        Set<Object> term41630 =  ((Map) term41584).keySet();
        HashSet term41583 = new HashSet((Collection<? extends Object>) term41630);
        term41548 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41567 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41548, term41548.getClass(), "projectId", term41549);
        setField(term41548, term41548.getClass(), "title", "nAOgCSwECO");
        setIntField(term41563, term41563.getClass(), "year", 2010);
        setShortField(term41563, term41563.getClass(), "month", (short) 7);
        setShortField(term41563, term41563.getClass(), "day", (short) 19);
        setField(term41548, term41548.getClass(), "startDate", term41563);
        setIntField(term41567, term41567.getClass(), "year", 2022);
        setShortField(term41567, term41567.getClass(), "month", (short) 10);
        setShortField(term41567, term41567.getClass(), "day", (short) 8);
        setField(term41548, term41548.getClass(), "endDate", term41567);
        setField(term41548, term41548.getClass(), "status", "shcEVehnSj");
        setField(term41548, term41548.getClass(), "assignments", term41583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OXxIPHzoVa";
        callMethod(klass, "setStatus", argTypes, term41548, args);
    }

};


