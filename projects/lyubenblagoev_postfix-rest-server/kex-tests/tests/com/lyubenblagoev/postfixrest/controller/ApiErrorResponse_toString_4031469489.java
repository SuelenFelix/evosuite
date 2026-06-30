package com.lyubenblagoev.postfixrest.controller;

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
import static com.lyubenblagoev.postfixrest.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApiErrorResponse_toString_4031469489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238;

    public ApiErrorResponse_toString_4031469489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1238 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse"));
        setField(term1238, term1238.getClass(), "message", null);
        setField(term1238, term1238.getClass(), "path", null);
        setField(term1238, term1238.getClass(), "method", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1238, args);
    }

};


