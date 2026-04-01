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

public class ExceptionDetail_getExceptionMessage_144940274714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3859;

    public ExceptionDetail_getExceptionMessage_144940274714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3859 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3860 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3860, term3860.getClass(), "seconds", 1775066777L);
        setIntField(term3860, term3860.getClass(), "nanos", 616943000);
        setField(term3859, term3859.getClass(), "timestamp", term3860);
        setField(term3859, term3859.getClass(), "method", "");
        setField(term3859, term3859.getClass(), "path", "");
        setIntField(term3859, term3859.getClass(), "status", -883034806);
        setField(term3859, term3859.getClass(), "statusText", "");
        setField(term3859, term3859.getClass(), "exceptionClass", "");
        setField(term3859, term3859.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExceptionMessage", argTypes, term3859, args);
    }

};


