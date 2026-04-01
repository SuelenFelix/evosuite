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
import java.lang.Integer;

public class ExceptionDetail_setStatus_3866393248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term168;

    public ExceptionDetail_setStatus_3866393248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term154 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term154, term154.getClass(), "seconds", 1775067626L);
        setIntField(term154, term154.getClass(), "nanos", 786785000);
        setField(term153, term153.getClass(), "timestamp", term154);
        setField(term153, term153.getClass(), "method", "");
        setField(term153, term153.getClass(), "path", "");
        setIntField(term153, term153.getClass(), "status", -2038273078);
        setField(term153, term153.getClass(), "statusText", "");
        setField(term153, term153.getClass(), "exceptionClass", "");
        setField(term153, term153.getClass(), "exceptionMessage", "");
        term168 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term168;
        callMethod(klass, "setStatus", argTypes, term153, args);
    }

};


