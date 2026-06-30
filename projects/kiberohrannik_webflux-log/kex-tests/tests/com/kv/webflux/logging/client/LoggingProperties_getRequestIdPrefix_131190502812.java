package com.kv.webflux.logging.client;

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
import static com.kv.webflux.logging.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoggingProperties_getRequestIdPrefix_131190502812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4537;

    public LoggingProperties_getRequestIdPrefix_131190502812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4537 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        setBooleanField(term4537, term4537.getClass(), "logRequestId", false);
        setField(term4537, term4537.getClass(), "requestIdPrefix", null);
        setBooleanField(term4537, term4537.getClass(), "logHeaders", false);
        setField(term4537, term4537.getClass(), "maskedHeaders", null);
        setBooleanField(term4537, term4537.getClass(), "logCookies", false);
        setField(term4537, term4537.getClass(), "maskedCookies", null);
        setBooleanField(term4537, term4537.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestIdPrefix", argTypes, term4537, args);
    }

};


