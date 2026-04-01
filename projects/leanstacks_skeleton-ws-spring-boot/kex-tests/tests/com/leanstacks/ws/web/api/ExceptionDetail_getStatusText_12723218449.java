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

public class ExceptionDetail_getStatusText_12723218449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public ExceptionDetail_getStatusText_12723218449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term171 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term171, term171.getClass(), "seconds", 1775067626L);
        setIntField(term171, term171.getClass(), "nanos", 880548000);
        setField(term170, term170.getClass(), "timestamp", term171);
        setField(term170, term170.getClass(), "method", "");
        setField(term170, term170.getClass(), "path", "");
        setIntField(term170, term170.getClass(), "status", -1339778481);
        setField(term170, term170.getClass(), "statusText", "");
        setField(term170, term170.getClass(), "exceptionClass", "");
        setField(term170, term170.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusText", argTypes, term170, args);
    }

};


