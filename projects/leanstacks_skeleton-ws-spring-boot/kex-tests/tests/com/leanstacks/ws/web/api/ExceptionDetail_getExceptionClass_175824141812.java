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

public class ExceptionDetail_getExceptionClass_175824141812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3807;

    public ExceptionDetail_getExceptionClass_175824141812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3807 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3808 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3808, term3808.getClass(), "seconds", 1775066777L);
        setIntField(term3808, term3808.getClass(), "nanos", 546742000);
        setField(term3807, term3807.getClass(), "timestamp", term3808);
        setField(term3807, term3807.getClass(), "method", "");
        setField(term3807, term3807.getClass(), "path", "");
        setIntField(term3807, term3807.getClass(), "status", -522618178);
        setField(term3807, term3807.getClass(), "statusText", "");
        setField(term3807, term3807.getClass(), "exceptionClass", "");
        setField(term3807, term3807.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionClass", argTypes, term3807, args);
    }

};


