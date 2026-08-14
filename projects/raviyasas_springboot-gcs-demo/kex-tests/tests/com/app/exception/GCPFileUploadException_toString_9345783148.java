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

public class GCPFileUploadException_toString_9345783148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26601;

    public GCPFileUploadException_toString_9345783148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26601 = newInstance(Class.forName("com.app.exception.GCPFileUploadException"));
        setField(term26601, term26601.getClass(), "message", null);
        setField(term26601, term26601.getClass(), "backtrace", null);
        setField(term26601, term26601.getClass(), "detailMessage", null);
        setField(term26601, term26601.getClass(), "cause", null);
        setField(term26601, term26601.getClass(), "stackTrace", null);
        setIntField(term26601, term26601.getClass(), "depth", 0);
        setField(term26601, term26601.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.GCPFileUploadException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26601, args);
    }

};


