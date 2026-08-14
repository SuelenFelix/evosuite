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

public class AssignmentServiceImpl_deleteById_14196282384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3398;
     Object term3400;
     Object term3402;

    public AssignmentServiceImpl_deleteById_14196282384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3398 = new Integer(-1467089634);
        term3400 = new Integer(413548937);
        term3402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3407 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3403, term3403.getClass(), "year", 2018);
        setShortField(term3403, term3403.getClass(), "month", (short) 7);
        setShortField(term3403, term3403.getClass(), "day", (short) 12);
        setField(term3402, term3402.getClass(), "date", term3403);
        setByteField(term3407, term3407.getClass(), "hour", (byte) 1);
        setByteField(term3407, term3407.getClass(), "minute", (byte) 3);
        setByteField(term3407, term3407.getClass(), "second", (byte) 47);
        setIntField(term3407, term3407.getClass(), "nano", 2729929);
        setField(term3402, term3402.getClass(), "time", term3407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.AssignmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[3];
        args[0] = term3398;
        args[1] = term3400;
        args[2] = term3402;
        callMethod(klass, "deleteById", argTypes, null, args);
    }

};


