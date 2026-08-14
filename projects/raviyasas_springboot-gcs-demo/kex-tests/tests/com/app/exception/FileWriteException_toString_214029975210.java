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

public class FileWriteException_toString_214029975210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41345;

    public FileWriteException_toString_214029975210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41345 = newInstance(Class.forName("com.app.exception.FileWriteException"));
        setField(term41345, term41345.getClass(), "message", null);
        setField(term41345, term41345.getClass(), "backtrace", null);
        setField(term41345, term41345.getClass(), "detailMessage", null);
        setField(term41345, term41345.getClass(), "cause", null);
        setField(term41345, term41345.getClass(), "stackTrace", null);
        setIntField(term41345, term41345.getClass(), "depth", 0);
        setField(term41345, term41345.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.FileWriteException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term41345, args);
    }

};


