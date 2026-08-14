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

public class ErrorResponse_getStatus_180977495314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;

    public ErrorResponse_getStatus_180977495314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        setField(term775, term775.getClass(), "timestamp", null);
        setIntField(term775, term775.getClass(), "status", 0);
        setField(term775, term775.getClass(), "error", null);
        setField(term775, term775.getClass(), "message", null);
        setField(term775, term775.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term775, args);
    }

};


