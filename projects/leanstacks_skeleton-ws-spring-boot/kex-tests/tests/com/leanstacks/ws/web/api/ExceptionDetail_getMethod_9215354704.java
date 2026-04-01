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

public class ExceptionDetail_getMethod_9215354704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3619;

    public ExceptionDetail_getMethod_9215354704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3619 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3620 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3620, term3620.getClass(), "seconds", 1775066777L);
        setIntField(term3620, term3620.getClass(), "nanos", 183460000);
        setField(term3619, term3619.getClass(), "timestamp", term3620);
        setField(term3619, term3619.getClass(), "method", "");
        setField(term3619, term3619.getClass(), "path", "");
        setIntField(term3619, term3619.getClass(), "status", 1484323161);
        setField(term3619, term3619.getClass(), "statusText", "");
        setField(term3619, term3619.getClass(), "exceptionClass", "");
        setField(term3619, term3619.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term3619, args);
    }

};


