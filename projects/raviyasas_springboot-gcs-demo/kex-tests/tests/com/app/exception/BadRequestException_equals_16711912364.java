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

public class BadRequestException_equals_16711912364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61434;

    public BadRequestException_equals_16711912364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61434 = newInstance(Class.forName("com.app.exception.BadRequestException"));
        setField(term61434, term61434.getClass(), "message", null);
        setField(term61434, term61434.getClass(), "backtrace", null);
        setField(term61434, term61434.getClass(), "detailMessage", null);
        setField(term61434, term61434.getClass(), "cause", null);
        setField(term61434, term61434.getClass(), "stackTrace", null);
        setIntField(term61434, term61434.getClass(), "depth", 0);
        setField(term61434, term61434.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.BadRequestException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term61434, args);
    }

};


