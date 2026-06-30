package com.ratelimiter.demo.exception;

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
import static com.ratelimiter.demo.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MyControllerAdvice_serviceExceptionHandler_15635778834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16379;

    public MyControllerAdvice_serviceExceptionHandler_15635778834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16379 = newInstance(Class.forName("com.ratelimiter.demo.exception.MyControllerAdvice"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.exception.MyControllerAdvice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.ratelimiter.demo.exception.ServiceException");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "serviceExceptionHandler", argTypes, term16379, args);
    }

};


