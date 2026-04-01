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

public class ExceptionDetail_getTimestamp_6169775341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExceptionDetail_getTimestamp_6169775341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term2 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term2, term2.getClass(), "seconds", 1775067626L);
        setIntField(term2, term2.getClass(), "nanos", 170437000);
        setField(term1, term1.getClass(), "timestamp", term2);
        setField(term1, term1.getClass(), "method", "");
        setField(term1, term1.getClass(), "path", "");
        setIntField(term1, term1.getClass(), "status", 568599855);
        setField(term1, term1.getClass(), "statusText", "");
        setField(term1, term1.getClass(), "exceptionClass", "");
        setField(term1, term1.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term1, args);
    }

};


