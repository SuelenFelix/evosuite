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

public class AssignmentServiceImpl_findByEmployeeIdAndProjectIdAndCommitDate_6659027819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3422;
     Object term3424;
     Object term3426;

    public AssignmentServiceImpl_findByEmployeeIdAndProjectIdAndCommitDate_6659027819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3422 = new Integer(1768204942);
        term3424 = new Integer(1252951645);
        term3426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3431 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3427, term3427.getClass(), "year", 2015);
        setShortField(term3427, term3427.getClass(), "month", (short) 12);
        setShortField(term3427, term3427.getClass(), "day", (short) 23);
        setField(term3426, term3426.getClass(), "date", term3427);
        setByteField(term3431, term3431.getClass(), "hour", (byte) 14);
        setByteField(term3431, term3431.getClass(), "minute", (byte) 17);
        setByteField(term3431, term3431.getClass(), "second", (byte) 50);
        setIntField(term3431, term3431.getClass(), "nano", 325544804);
        setField(term3426, term3426.getClass(), "time", term3431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.AssignmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[3];
        args[0] = term3422;
        args[1] = term3424;
        args[2] = term3426;
        callMethod(klass, "findByEmployeeIdAndProjectIdAndCommitDate", argTypes, null, args);
    }

};


