package com.creativityfactory.swiftserver.error;

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
import static com.creativityfactory.swiftserver.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ErrorMessageBuilderImpl_buildTimestamp_16765266191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;
     Object term796;

    public ErrorMessageBuilderImpl_buildTimestamp_16765266191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl"));
        Object term794 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        setField(term794, term794.getClass(), "timestamp", null);
        setIntField(term794, term794.getClass(), "status", 0);
        setField(term794, term794.getClass(), "error", null);
        setField(term794, term794.getClass(), "message", null);
        setField(term794, term794.getClass(), "path", null);
        setField(term793, term793.getClass(), "errorResponse", term794);
        term796 = newInstance(Class.forName("java.util.Date"));
        setLongField(term796, term796.getClass(), "fastTime", 1589457921030L);
        setField(term796, term796.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term796;
        callMethod(klass, "buildTimestamp", argTypes, term793, args);
    }

};


