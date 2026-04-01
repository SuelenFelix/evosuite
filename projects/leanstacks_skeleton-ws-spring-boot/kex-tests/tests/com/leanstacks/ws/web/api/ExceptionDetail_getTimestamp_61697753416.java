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

public class ExceptionDetail_getTimestamp_61697753416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public ExceptionDetail_getTimestamp_61697753416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        setField(term326, term326.getClass(), "timestamp", null);
        setField(term326, term326.getClass(), "method", null);
        setField(term326, term326.getClass(), "path", null);
        setIntField(term326, term326.getClass(), "status", 0);
        setField(term326, term326.getClass(), "statusText", null);
        setField(term326, term326.getClass(), "exceptionClass", null);
        setField(term326, term326.getClass(), "exceptionMessage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term326, args);
    }

};


