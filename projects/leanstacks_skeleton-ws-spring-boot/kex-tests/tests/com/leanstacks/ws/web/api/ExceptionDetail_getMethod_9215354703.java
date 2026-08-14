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
import java.lang.Object;

public class ExceptionDetail_getMethod_9215354703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public ExceptionDetail_getMethod_9215354703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term35 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term35, term35.getClass(), "seconds", 1786428302L);
        setIntField(term35, term35.getClass(), "nanos", 13278000);
        setField(term34, term34.getClass(), "timestamp", term35);
        setField(term34, term34.getClass(), "method", "");
        setField(term34, term34.getClass(), "path", "");
        setIntField(term34, term34.getClass(), "status", 1484323161);
        setField(term34, term34.getClass(), "statusText", "");
        setField(term34, term34.getClass(), "exceptionClass", "");
        setField(term34, term34.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term34, args);
    }

};


