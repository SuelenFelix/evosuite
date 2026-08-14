package com.pfa.app.service.impl;

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
import static com.pfa.app.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProjectServiceImpl_update_19636706635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public ProjectServiceImpl_update_19636706635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term624 = new Integer(1045657203);
        HashMap term659 = new HashMap();
        Set<Object> term697 =  ((Map) term659).keySet();
        HashSet term658 = new HashSet((Collection<? extends Object>) term697);
        term623 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term642 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term623, term623.getClass(), "projectId", term624);
        setField(term623, term623.getClass(), "title", "jDmhBrIoDa");
        setIntField(term638, term638.getClass(), "year", 2017);
        setShortField(term638, term638.getClass(), "month", (short) 6);
        setShortField(term638, term638.getClass(), "day", (short) 7);
        setField(term623, term623.getClass(), "startDate", term638);
        setIntField(term642, term642.getClass(), "year", 2023);
        setShortField(term642, term642.getClass(), "month", (short) 8);
        setShortField(term642, term642.getClass(), "day", (short) 12);
        setField(term623, term623.getClass(), "endDate", term642);
        setField(term623, term623.getClass(), "status", "SPtPatHeOm");
        setField(term623, term623.getClass(), "assignments", term658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.ProjectServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Project");
        Object[] args = new Object[1];
        args[0] = term623;
        callMethod(klass, "update", argTypes, null, args);
    }

};


