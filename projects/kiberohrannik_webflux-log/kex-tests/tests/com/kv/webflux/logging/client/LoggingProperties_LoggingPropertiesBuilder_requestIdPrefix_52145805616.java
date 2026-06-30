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

public class LoggingProperties_LoggingPropertiesBuilder_requestIdPrefix_52145805616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;

    public LoggingProperties_LoggingPropertiesBuilder_requestIdPrefix_52145805616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        setBooleanField(term2351, term2351.getClass(), "logRequestId", false);
        setField(term2351, term2351.getClass(), "requestIdPrefix", null);
        setBooleanField(term2351, term2351.getClass(), "logHeaders", false);
        setField(term2351, term2351.getClass(), "maskedHeaders", null);
        setBooleanField(term2351, term2351.getClass(), "logCookies", false);
        setField(term2351, term2351.getClass(), "maskedCookies", null);
        setBooleanField(term2351, term2351.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "requestIdPrefix", argTypes, term2351, args);
    }

};


