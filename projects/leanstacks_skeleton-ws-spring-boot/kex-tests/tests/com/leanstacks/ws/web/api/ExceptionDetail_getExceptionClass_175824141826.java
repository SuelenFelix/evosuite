package com.leanstacks.ws.web.api;

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
import static com.leanstacks.ws.web.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExceptionDetail_getExceptionClass_175824141826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public ExceptionDetail_getExceptionClass_175824141826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        setField(term348, term348.getClass(), "timestamp", null);
        setField(term348, term348.getClass(), "method", null);
        setField(term348, term348.getClass(), "path", null);
        setIntField(term348, term348.getClass(), "status", 0);
        setField(term348, term348.getClass(), "statusText", null);
        setField(term348, term348.getClass(), "exceptionClass", null);
        setField(term348, term348.getClass(), "exceptionMessage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionClass", argTypes, term348, args);
    }

};


