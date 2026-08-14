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

public class ApiExceptionHandler_handleInvalidFileException_15606686732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4523;

    public ApiExceptionHandler_handleInvalidFileException_15606686732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4523 = newInstance(Class.forName("com.app.exception.ApiExceptionHandler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiExceptionHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.app.exception.InvalidFileTypeException");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleInvalidFileException", argTypes, term4523, args);
    }

};


