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

public class ServerResponseUtil_setMsg_55145886113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public ServerResponseUtil_setMsg_55145886113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term228 = new Integer(-1955890973);
        term227 = newInstance(Class.forName("com.ratelimiter.demo.util.ServerResponseUtil"));
        Object term242 = newInstance(Class.forName("java.lang.Object"));
        setField(term227, term227.getClass(), "status", term228);
        setField(term227, term227.getClass(), "msg", "RMFIsYGgne");
        setField(term227, term227.getClass(), "data", term242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.util.ServerResponseUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setMsg", argTypes, term227, args);
    }

};


