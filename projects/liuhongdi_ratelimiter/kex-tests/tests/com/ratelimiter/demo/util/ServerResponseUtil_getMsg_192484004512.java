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

public class ServerResponseUtil_getMsg_192484004512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public ServerResponseUtil_getMsg_192484004512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term202 = new Integer(-616727354);
        term201 = newInstance(Class.forName("com.ratelimiter.demo.util.ServerResponseUtil"));
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        setField(term201, term201.getClass(), "status", term202);
        setField(term201, term201.getClass(), "msg", "hRNSzYYIrc");
        setField(term201, term201.getClass(), "data", term216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.util.ServerResponseUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsg", argTypes, term201, args);
    }

};


