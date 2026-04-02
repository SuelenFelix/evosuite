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

public class ServerResponseUtil_setStatus_13993660511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term189;

    public ServerResponseUtil_setStatus_13993660511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term174 = new Integer(391863371);
        term173 = newInstance(Class.forName("com.ratelimiter.demo.util.ServerResponseUtil"));
        Object term188 = newInstance(Class.forName("java.lang.Object"));
        setField(term173, term173.getClass(), "status", term174);
        setField(term173, term173.getClass(), "msg", "MjGYSRKTNF");
        setField(term173, term173.getClass(), "data", term188);
        term189 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.util.ServerResponseUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term189;
        callMethod(klass, "setStatus", argTypes, term173, args);
    }

};


