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

public class ExceptionDetail_setExceptionMessage_127366544315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3874;

    public ExceptionDetail_setExceptionMessage_127366544315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3874 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3875 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3875, term3875.getClass(), "seconds", 1775066777L);
        setIntField(term3875, term3875.getClass(), "nanos", 660425000);
        setField(term3874, term3874.getClass(), "timestamp", term3875);
        setField(term3874, term3874.getClass(), "method", "");
        setField(term3874, term3874.getClass(), "path", "");
        setIntField(term3874, term3874.getClass(), "status", 1585847225);
        setField(term3874, term3874.getClass(), "statusText", "");
        setField(term3874, term3874.getClass(), "exceptionClass", "");
        setField(term3874, term3874.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "setExceptionMessage", argTypes, term3874, args);
    }

};


