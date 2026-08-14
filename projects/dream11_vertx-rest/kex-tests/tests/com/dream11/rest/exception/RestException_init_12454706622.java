package com.dream11.rest.exception;

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
import static com.dream11.rest.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RestException_init_12454706622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public RestException_init_12454706622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dream11.rest.exception.RestException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.dream11.rest.exception.RestError");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


