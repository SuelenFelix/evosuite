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

public class ProjectServiceImpl_findProjectDtoById_4853347102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;

    public ProjectServiceImpl_findProjectDtoById_4853347102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term185 = new Integer(-157887805);
        HashMap term220 = new HashMap();
        Set<Object> term256 =  ((Map) term220).keySet();
        HashSet term219 = new HashSet((Collection<? extends Object>) term256);
        term184 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term184, term184.getClass(), "projectId", term185);
        setField(term184, term184.getClass(), "title", "HqBOwkVqjD");
        setIntField(term199, term199.getClass(), "year", 2021);
        setShortField(term199, term199.getClass(), "month", (short) 1);
        setShortField(term199, term199.getClass(), "day", (short) 18);
        setField(term184, term184.getClass(), "startDate", term199);
        setIntField(term203, term203.getClass(), "year", 2020);
        setShortField(term203, term203.getClass(), "month", (short) 11);
        setShortField(term203, term203.getClass(), "day", (short) 22);
        setField(term184, term184.getClass(), "endDate", term203);
        setField(term184, term184.getClass(), "status", "MAcUBcBckh");
        setField(term184, term184.getClass(), "assignments", term219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.ProjectServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Project");
        Object[] args = new Object[1];
        args[0] = term184;
        callMethod(klass, "findProjectDtoById", argTypes, null, args);
    }

};


