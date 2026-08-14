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

public class InvalidFileTypeException_canEqual_20216713726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50185;

    public InvalidFileTypeException_canEqual_20216713726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50185 = newInstance(Class.forName("com.app.exception.InvalidFileTypeException"));
        setField(term50185, term50185.getClass(), "message", null);
        setField(term50185, term50185.getClass(), "backtrace", null);
        setField(term50185, term50185.getClass(), "detailMessage", null);
        setField(term50185, term50185.getClass(), "cause", null);
        setField(term50185, term50185.getClass(), "stackTrace", null);
        setIntField(term50185, term50185.getClass(), "depth", 0);
        setField(term50185, term50185.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.InvalidFileTypeException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term50185, args);
    }

};


