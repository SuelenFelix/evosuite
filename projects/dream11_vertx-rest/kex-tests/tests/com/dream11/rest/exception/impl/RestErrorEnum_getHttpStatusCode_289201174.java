package com.dream11.rest.exception.impl;

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
import static com.dream11.rest.exception.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RestErrorEnum_getHttpStatusCode_289201174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public RestErrorEnum_getHttpStatusCode_289201174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term929 = Class.forName((String) "com.dream11.rest.exception.impl.RestErrorEnum");
        Field term928 = ((Class) term929).getDeclaredField((String) "UNKNOWN_EXCEPTION");
        ((Field) term928).setAccessible(true);
        enum2 = ((Field) term928).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dream11.rest.exception.impl.RestErrorEnum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpStatusCode", argTypes, enum2, args);
    }

};


