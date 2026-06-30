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
import java.lang.Boolean;

public class LoggingProperties_LoggingPropertiesBuilder_logCookies_173339559612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2325;
     Object term2330;

    public LoggingProperties_LoggingPropertiesBuilder_logCookies_173339559612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2325 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        setBooleanField(term2325, term2325.getClass(), "logRequestId", false);
        setField(term2325, term2325.getClass(), "requestIdPrefix", null);
        setBooleanField(term2325, term2325.getClass(), "logHeaders", false);
        setField(term2325, term2325.getClass(), "maskedHeaders", null);
        setBooleanField(term2325, term2325.getClass(), "logCookies", false);
        setField(term2325, term2325.getClass(), "maskedCookies", null);
        setBooleanField(term2325, term2325.getClass(), "logBody", false);
        term2330 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2330;
        callMethod(klass, "logCookies", argTypes, term2325, args);
    }

};


