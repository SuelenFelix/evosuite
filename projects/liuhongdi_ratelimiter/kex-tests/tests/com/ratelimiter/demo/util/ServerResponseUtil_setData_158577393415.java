package com.ratelimiter.demo.util;

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
import static com.ratelimiter.demo.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ServerResponseUtil_setData_158577393415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;
     Object term317;

    public ServerResponseUtil_setData_158577393415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term302 = new Integer(1227103734);
        term301 = newInstance(Class.forName("com.ratelimiter.demo.util.ServerResponseUtil"));
        Object term316 = newInstance(Class.forName("java.lang.Object"));
        setField(term301, term301.getClass(), "status", term302);
        setField(term301, term301.getClass(), "msg", "MxlszYVzRf");
        setField(term301, term301.getClass(), "data", term316);
        term317 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.util.ServerResponseUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term317;
        callMethod(klass, "setData", argTypes, term301, args);
    }

};


