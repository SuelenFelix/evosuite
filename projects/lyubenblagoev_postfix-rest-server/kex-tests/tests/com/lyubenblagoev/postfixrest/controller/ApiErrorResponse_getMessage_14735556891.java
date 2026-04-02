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

public class ApiErrorResponse_getMessage_14735556891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;

    public ApiErrorResponse_getMessage_14735556891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term967 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse"));
        setField(term967, term967.getClass(), "message", "hxCBltsObl");
        setField(term967, term967.getClass(), "path", "BndsHwAFMv");
        setField(term967, term967.getClass(), "method", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.ApiErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term967, args);
    }

};


