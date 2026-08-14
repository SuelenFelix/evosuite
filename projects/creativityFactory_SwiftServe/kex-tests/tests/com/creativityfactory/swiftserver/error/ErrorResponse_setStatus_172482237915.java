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
import java.lang.Integer;

public class ErrorResponse_setStatus_172482237915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777;
     Object term779;

    public ErrorResponse_setStatus_172482237915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        setField(term777, term777.getClass(), "timestamp", null);
        setIntField(term777, term777.getClass(), "status", 0);
        setField(term777, term777.getClass(), "error", null);
        setField(term777, term777.getClass(), "message", null);
        setField(term777, term777.getClass(), "path", null);
        term779 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term779;
        callMethod(klass, "setStatus", argTypes, term777, args);
    }

};


