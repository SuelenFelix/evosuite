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

public class ApiRestException_getStatus_9051771853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5322;

    public ApiRestException_getStatus_9051771853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5322 = newInstance(Class.forName("com.salomondev.interceptor.exception.ApiRestException"));
        setField(term5322, term5322.getClass(), "code", null);
        setField(term5322, term5322.getClass(), "status", null);
        setField(term5322, term5322.getClass(), "message", null);
        setField(term5322, term5322.getClass(), "backtrace", null);
        setField(term5322, term5322.getClass(), "detailMessage", null);
        setField(term5322, term5322.getClass(), "cause", null);
        setField(term5322, term5322.getClass(), "stackTrace", null);
        setIntField(term5322, term5322.getClass(), "depth", 0);
        setField(term5322, term5322.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.exception.ApiRestException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term5322, args);
    }

};


