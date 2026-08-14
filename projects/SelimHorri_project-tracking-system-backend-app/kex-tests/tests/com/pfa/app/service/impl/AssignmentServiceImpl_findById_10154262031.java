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

public class AssignmentServiceImpl_findById_10154262031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2362;
     Object term2364;
     Object term2366;

    public AssignmentServiceImpl_findById_10154262031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2362 = new Integer(-1122880881);
        term2364 = new Integer(-542712742);
        term2366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2371 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2367, term2367.getClass(), "year", 2010);
        setShortField(term2367, term2367.getClass(), "month", (short) 6);
        setShortField(term2367, term2367.getClass(), "day", (short) 14);
        setField(term2366, term2366.getClass(), "date", term2367);
        setByteField(term2371, term2371.getClass(), "hour", (byte) 6);
        setByteField(term2371, term2371.getClass(), "minute", (byte) 22);
        setByteField(term2371, term2371.getClass(), "second", (byte) 20);
        setIntField(term2371, term2371.getClass(), "nano", 25133051);
        setField(term2366, term2366.getClass(), "time", term2371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.AssignmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[3];
        args[0] = term2362;
        args[1] = term2364;
        args[2] = term2366;
        callMethod(klass, "findById", argTypes, null, args);
    }

};


