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

public class ExceptionDetail_setMethod_15275180104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public ExceptionDetail_setMethod_15275180104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term50 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term50, term50.getClass(), "seconds", 1786428302L);
        setIntField(term50, term50.getClass(), "nanos", 86009000);
        setField(term49, term49.getClass(), "timestamp", term50);
        setField(term49, term49.getClass(), "method", "");
        setField(term49, term49.getClass(), "path", "");
        setIntField(term49, term49.getClass(), "status", 391863371);
        setField(term49, term49.getClass(), "statusText", "");
        setField(term49, term49.getClass(), "exceptionClass", "");
        setField(term49, term49.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "setMethod", argTypes, term49, args);
    }

};


