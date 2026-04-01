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

public class ExceptionDetail_setExceptionClass_136747563413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3822;

    public ExceptionDetail_setExceptionClass_136747563413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3822 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3823 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3823, term3823.getClass(), "seconds", 1775066777L);
        setIntField(term3823, term3823.getClass(), "nanos", 581376000);
        setField(term3822, term3822.getClass(), "timestamp", term3823);
        setField(term3822, term3822.getClass(), "method", "");
        setField(term3822, term3822.getClass(), "path", "");
        setIntField(term3822, term3822.getClass(), "status", 1134449235);
        setField(term3822, term3822.getClass(), "statusText", "");
        setField(term3822, term3822.getClass(), "exceptionClass", "");
        setField(term3822, term3822.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setExceptionClass", argTypes, term3822, args);
    }

};


