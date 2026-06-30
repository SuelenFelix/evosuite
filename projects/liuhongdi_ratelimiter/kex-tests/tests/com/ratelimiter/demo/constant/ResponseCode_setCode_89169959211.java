package com.ratelimiter.demo.constant;

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
import static com.ratelimiter.demo.constant.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ResponseCode_setCode_89169959211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum7;

    public ResponseCode_setCode_89169959211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2559 = Class.forName((String) "com.ratelimiter.demo.constant.ResponseCode");
        Field term2558 = ((Class) term2559).getDeclaredField((String) "ACCESS_LIMIT");
        ((Field) term2558).setAccessible(true);
        enum7 = ((Field) term2558).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.constant.ResponseCode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCode", argTypes, enum7, args);
    }

};


