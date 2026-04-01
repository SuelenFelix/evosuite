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

public class ExceptionDetail_getStatusText_127232184410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;

    public ExceptionDetail_getStatusText_127232184410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3756 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3756, term3756.getClass(), "seconds", 1775066777L);
        setIntField(term3756, term3756.getClass(), "nanos", 450249000);
        setField(term3755, term3755.getClass(), "timestamp", term3756);
        setField(term3755, term3755.getClass(), "method", "");
        setField(term3755, term3755.getClass(), "path", "");
        setIntField(term3755, term3755.getClass(), "status", -1339778481);
        setField(term3755, term3755.getClass(), "statusText", "");
        setField(term3755, term3755.getClass(), "exceptionClass", "");
        setField(term3755, term3755.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusText", argTypes, term3755, args);
    }

};


