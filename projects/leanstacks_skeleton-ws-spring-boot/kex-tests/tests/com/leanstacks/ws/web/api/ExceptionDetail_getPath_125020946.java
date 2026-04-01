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

public class ExceptionDetail_getPath_125020946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3671;

    public ExceptionDetail_getPath_125020946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3671 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3672 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3672, term3672.getClass(), "seconds", 1775066777L);
        setIntField(term3672, term3672.getClass(), "nanos", 285708000);
        setField(term3671, term3671.getClass(), "timestamp", term3672);
        setField(term3671, term3671.getClass(), "method", "");
        setField(term3671, term3671.getClass(), "path", "");
        setIntField(term3671, term3671.getClass(), "status", -1922583790);
        setField(term3671, term3671.getClass(), "statusText", "");
        setField(term3671, term3671.getClass(), "exceptionClass", "");
        setField(term3671, term3671.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term3671, args);
    }

};


