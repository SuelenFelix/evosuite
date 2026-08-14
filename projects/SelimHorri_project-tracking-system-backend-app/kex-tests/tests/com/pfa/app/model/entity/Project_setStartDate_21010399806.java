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

public class Project_setStartDate_21010399806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41269;
     Object term41319;

    public Project_setStartDate_21010399806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41270 = new Integer(-1865692837);
        HashMap term41305 = new HashMap();
        Set<Object> term41343 =  ((Map) term41305).keySet();
        HashSet term41304 = new HashSet((Collection<? extends Object>) term41343);
        term41269 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41288 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41269, term41269.getClass(), "projectId", term41270);
        setField(term41269, term41269.getClass(), "title", "AEGGKaZuJz");
        setIntField(term41284, term41284.getClass(), "year", 2013);
        setShortField(term41284, term41284.getClass(), "month", (short) 11);
        setShortField(term41284, term41284.getClass(), "day", (short) 15);
        setField(term41269, term41269.getClass(), "startDate", term41284);
        setIntField(term41288, term41288.getClass(), "year", 2026);
        setShortField(term41288, term41288.getClass(), "month", (short) 6);
        setShortField(term41288, term41288.getClass(), "day", (short) 20);
        setField(term41269, term41269.getClass(), "endDate", term41288);
        setField(term41269, term41269.getClass(), "status", "pXAYygCaFW");
        setField(term41269, term41269.getClass(), "assignments", term41304);
        term41319 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term41319, term41319.getClass(), "year", 2027);
        setShortField(term41319, term41319.getClass(), "month", (short) 11);
        setShortField(term41319, term41319.getClass(), "day", (short) 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term41319;
        callMethod(klass, "setStartDate", argTypes, term41269, args);
    }

};


