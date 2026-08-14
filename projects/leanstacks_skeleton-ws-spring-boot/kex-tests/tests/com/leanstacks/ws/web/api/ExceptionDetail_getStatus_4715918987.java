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

public class ExceptionDetail_getStatus_4715918987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;

    public ExceptionDetail_getStatus_4715918987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term139 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term139, term139.getClass(), "seconds", 1786428302L);
        setIntField(term139, term139.getClass(), "nanos", 276959000);
        setField(term138, term138.getClass(), "timestamp", term139);
        setField(term138, term138.getClass(), "method", "");
        setField(term138, term138.getClass(), "path", "");
        setIntField(term138, term138.getClass(), "status", -1955890973);
        setField(term138, term138.getClass(), "statusText", "");
        setField(term138, term138.getClass(), "exceptionClass", "");
        setField(term138, term138.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term138, args);
    }

};


