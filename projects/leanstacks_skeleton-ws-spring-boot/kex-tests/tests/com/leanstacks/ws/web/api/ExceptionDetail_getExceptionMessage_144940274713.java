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

public class ExceptionDetail_getExceptionMessage_144940274713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public ExceptionDetail_getExceptionMessage_144940274713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term275 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term275, term275.getClass(), "seconds", 1775067627L);
        setIntField(term275, term275.getClass(), "nanos", 222445000);
        setField(term274, term274.getClass(), "timestamp", term275);
        setField(term274, term274.getClass(), "method", "");
        setField(term274, term274.getClass(), "path", "");
        setIntField(term274, term274.getClass(), "status", -883034806);
        setField(term274, term274.getClass(), "statusText", "");
        setField(term274, term274.getClass(), "exceptionClass", "");
        setField(term274, term274.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionMessage", argTypes, term274, args);
    }

};


