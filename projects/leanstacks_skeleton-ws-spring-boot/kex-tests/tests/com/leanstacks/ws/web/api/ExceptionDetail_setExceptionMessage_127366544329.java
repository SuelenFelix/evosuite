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

public class ExceptionDetail_setExceptionMessage_127366544329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public ExceptionDetail_setExceptionMessage_127366544329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        setField(term354, term354.getClass(), "timestamp", null);
        setField(term354, term354.getClass(), "method", null);
        setField(term354, term354.getClass(), "path", null);
        setIntField(term354, term354.getClass(), "status", 0);
        setField(term354, term354.getClass(), "statusText", null);
        setField(term354, term354.getClass(), "exceptionClass", null);
        setField(term354, term354.getClass(), "exceptionMessage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExceptionMessage", argTypes, term354, args);
    }

};


