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

public class ErrorResponse_getError_1829036085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public ErrorResponse_getError_1829036085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term286 = newInstance(Class.forName("java.util.Date"));
        setLongField(term286, term286.getClass(), "fastTime", 1515890130018L);
        setField(term286, term286.getClass(), "cdate", null);
        setField(term285, term285.getClass(), "timestamp", term286);
        setIntField(term285, term285.getClass(), "status", -616727354);
        setField(term285, term285.getClass(), "error", "MxlszYVzRf");
        setField(term285, term285.getClass(), "message", "LQFpaHEwXR");
        setField(term285, term285.getClass(), "path", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term285, args);
    }

};


