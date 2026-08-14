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

public class Project_setEndDate_9378571898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41415;
     Object term41456;

    public Project_setEndDate_9378571898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41416 = new Integer(-1503153618);
        HashMap term41451 = new HashMap();
        Set<Object> term41480 =  ((Map) term41451).keySet();
        HashSet term41450 = new HashSet((Collection<? extends Object>) term41480);
        term41415 = newInstance(Class.forName("com.pfa.app.model.entity.Project"));
        Object term41430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41434 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term41415, term41415.getClass(), "projectId", term41416);
        setField(term41415, term41415.getClass(), "title", "TXxuyKOVBs");
        setIntField(term41430, term41430.getClass(), "year", 2028);
        setShortField(term41430, term41430.getClass(), "month", (short) 3);
        setShortField(term41430, term41430.getClass(), "day", (short) 29);
        setField(term41415, term41415.getClass(), "startDate", term41430);
        setIntField(term41434, term41434.getClass(), "year", 2016);
        setShortField(term41434, term41434.getClass(), "month", (short) 1);
        setShortField(term41434, term41434.getClass(), "day", (short) 22);
        setField(term41415, term41415.getClass(), "endDate", term41434);
        setField(term41415, term41415.getClass(), "status", "ZdokwWCVab");
        setField(term41415, term41415.getClass(), "assignments", term41450);
        term41456 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term41456, term41456.getClass(), "year", 2021);
        setShortField(term41456, term41456.getClass(), "month", (short) 3);
        setShortField(term41456, term41456.getClass(), "day", (short) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term41456;
        callMethod(klass, "setEndDate", argTypes, term41415, args);
    }

};


