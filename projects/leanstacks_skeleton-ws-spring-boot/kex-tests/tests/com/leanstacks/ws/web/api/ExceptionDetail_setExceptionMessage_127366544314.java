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

public class ExceptionDetail_setExceptionMessage_127366544314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public ExceptionDetail_setExceptionMessage_127366544314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term290 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term290, term290.getClass(), "seconds", 1775067627L);
        setIntField(term290, term290.getClass(), "nanos", 309217000);
        setField(term289, term289.getClass(), "timestamp", term290);
        setField(term289, term289.getClass(), "method", "");
        setField(term289, term289.getClass(), "path", "");
        setIntField(term289, term289.getClass(), "status", 1585847225);
        setField(term289, term289.getClass(), "statusText", "");
        setField(term289, term289.getClass(), "exceptionClass", "");
        setField(term289, term289.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setExceptionMessage", argTypes, term289, args);
    }

};


