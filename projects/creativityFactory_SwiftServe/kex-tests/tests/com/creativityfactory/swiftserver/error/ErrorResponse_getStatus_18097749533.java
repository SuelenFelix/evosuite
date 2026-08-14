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

public class ErrorResponse_getStatus_18097749533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public ErrorResponse_getStatus_18097749533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term144 = newInstance(Class.forName("java.util.Date"));
        setLongField(term144, term144.getClass(), "fastTime", 1606045635837L);
        setField(term144, term144.getClass(), "cdate", null);
        setField(term143, term143.getClass(), "timestamp", term144);
        setIntField(term143, term143.getClass(), "status", 1484323161);
        setField(term143, term143.getClass(), "error", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "message", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "path", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term143, args);
    }

};


