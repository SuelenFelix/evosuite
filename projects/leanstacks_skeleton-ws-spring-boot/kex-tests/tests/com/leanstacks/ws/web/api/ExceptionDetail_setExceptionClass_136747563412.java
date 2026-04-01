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

public class ExceptionDetail_setExceptionClass_136747563412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public ExceptionDetail_setExceptionClass_136747563412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term238 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term238, term238.getClass(), "seconds", 1775067627L);
        setIntField(term238, term238.getClass(), "nanos", 151273000);
        setField(term237, term237.getClass(), "timestamp", term238);
        setField(term237, term237.getClass(), "method", "");
        setField(term237, term237.getClass(), "path", "");
        setIntField(term237, term237.getClass(), "status", 1134449235);
        setField(term237, term237.getClass(), "statusText", "");
        setField(term237, term237.getClass(), "exceptionClass", "");
        setField(term237, term237.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setExceptionClass", argTypes, term237, args);
    }

};


