package com.app.exception;

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
import static com.app.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GCPFileUploadException_equals_248680513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18436;

    public GCPFileUploadException_equals_248680513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18436 = newInstance(Class.forName("com.app.exception.GCPFileUploadException"));
        setField(term18436, term18436.getClass(), "message", null);
        setField(term18436, term18436.getClass(), "backtrace", null);
        setField(term18436, term18436.getClass(), "detailMessage", null);
        setField(term18436, term18436.getClass(), "cause", null);
        setField(term18436, term18436.getClass(), "stackTrace", null);
        setIntField(term18436, term18436.getClass(), "depth", 0);
        setField(term18436, term18436.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.GCPFileUploadException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term18436, args);
    }

};


