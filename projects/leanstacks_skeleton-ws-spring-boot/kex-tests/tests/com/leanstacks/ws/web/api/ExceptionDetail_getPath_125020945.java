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

public class ExceptionDetail_getPath_125020945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;

    public ExceptionDetail_getPath_125020945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term87 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term87, term87.getClass(), "seconds", 1786428302L);
        setIntField(term87, term87.getClass(), "nanos", 155159000);
        setField(term86, term86.getClass(), "timestamp", term87);
        setField(term86, term86.getClass(), "method", "");
        setField(term86, term86.getClass(), "path", "");
        setIntField(term86, term86.getClass(), "status", -1922583790);
        setField(term86, term86.getClass(), "statusText", "");
        setField(term86, term86.getClass(), "exceptionClass", "");
        setField(term86, term86.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term86, args);
    }

};


