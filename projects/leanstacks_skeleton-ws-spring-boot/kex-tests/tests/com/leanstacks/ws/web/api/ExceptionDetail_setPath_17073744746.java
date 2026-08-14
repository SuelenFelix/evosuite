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

public class ExceptionDetail_setPath_17073744746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public ExceptionDetail_setPath_17073744746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term102 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term102, term102.getClass(), "seconds", 1786428302L);
        setIntField(term102, term102.getClass(), "nanos", 218247000);
        setField(term101, term101.getClass(), "timestamp", term102);
        setField(term101, term101.getClass(), "method", "");
        setField(term101, term101.getClass(), "path", "");
        setIntField(term101, term101.getClass(), "status", -616727354);
        setField(term101, term101.getClass(), "statusText", "");
        setField(term101, term101.getClass(), "exceptionClass", "");
        setField(term101, term101.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "setPath", argTypes, term101, args);
    }

};


