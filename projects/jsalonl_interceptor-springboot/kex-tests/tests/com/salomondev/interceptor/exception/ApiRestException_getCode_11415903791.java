package com.salomondev.interceptor.exception;

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
import static com.salomondev.interceptor.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApiRestException_getCode_11415903791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2928;

    public ApiRestException_getCode_11415903791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2928 = newInstance(Class.forName("com.salomondev.interceptor.exception.ApiRestException"));
        setField(term2928, term2928.getClass(), "code", null);
        setField(term2928, term2928.getClass(), "status", null);
        setField(term2928, term2928.getClass(), "message", null);
        setField(term2928, term2928.getClass(), "backtrace", null);
        setField(term2928, term2928.getClass(), "detailMessage", null);
        setField(term2928, term2928.getClass(), "cause", null);
        setField(term2928, term2928.getClass(), "stackTrace", null);
        setIntField(term2928, term2928.getClass(), "depth", 0);
        setField(term2928, term2928.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.exception.ApiRestException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term2928, args);
    }

};


