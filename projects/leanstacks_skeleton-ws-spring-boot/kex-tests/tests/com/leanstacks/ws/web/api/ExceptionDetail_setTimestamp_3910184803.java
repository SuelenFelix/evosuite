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

public class ExceptionDetail_setTimestamp_3910184803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;
     Object term3616;

    public ExceptionDetail_setTimestamp_3910184803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3601 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3602 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3602, term3602.getClass(), "seconds", 1775066777L);
        setIntField(term3602, term3602.getClass(), "nanos", 134416000);
        setField(term3601, term3601.getClass(), "timestamp", term3602);
        setField(term3601, term3601.getClass(), "method", "");
        setField(term3601, term3601.getClass(), "path", "");
        setIntField(term3601, term3601.getClass(), "status", 1162663216);
        setField(term3601, term3601.getClass(), "statusText", "");
        setField(term3601, term3601.getClass(), "exceptionClass", "");
        setField(term3601, term3601.getClass(), "exceptionMessage", "");
        term3616 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3616, term3616.getClass(), "seconds", 1362780563L);
        setIntField(term3616, term3616.getClass(), "nanos", 394000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term3616;
        callMethod(klass, "setTimestamp", argTypes, term3601, args);
    }

};


