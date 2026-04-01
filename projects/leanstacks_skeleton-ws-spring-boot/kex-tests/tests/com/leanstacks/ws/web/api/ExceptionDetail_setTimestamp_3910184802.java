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

public class ExceptionDetail_setTimestamp_3910184802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term31;

    public ExceptionDetail_setTimestamp_3910184802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term17 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term17, term17.getClass(), "seconds", 1775067626L);
        setIntField(term17, term17.getClass(), "nanos", 290983000);
        setField(term16, term16.getClass(), "timestamp", term17);
        setField(term16, term16.getClass(), "method", "");
        setField(term16, term16.getClass(), "path", "");
        setIntField(term16, term16.getClass(), "status", 1162663216);
        setField(term16, term16.getClass(), "statusText", "");
        setField(term16, term16.getClass(), "exceptionClass", "");
        setField(term16, term16.getClass(), "exceptionMessage", "");
        term31 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term31, term31.getClass(), "seconds", 1345871412L);
        setIntField(term31, term31.getClass(), "nanos", 244000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term31;
        callMethod(klass, "setTimestamp", argTypes, term16, args);
    }

};


