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

public class LoggingProperties_getMaskedCookies_155142712416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4557;

    public LoggingProperties_getMaskedCookies_155142712416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4557 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        setBooleanField(term4557, term4557.getClass(), "logRequestId", false);
        setField(term4557, term4557.getClass(), "requestIdPrefix", null);
        setBooleanField(term4557, term4557.getClass(), "logHeaders", false);
        setField(term4557, term4557.getClass(), "maskedHeaders", null);
        setBooleanField(term4557, term4557.getClass(), "logCookies", false);
        setField(term4557, term4557.getClass(), "maskedCookies", null);
        setBooleanField(term4557, term4557.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaskedCookies", argTypes, term4557, args);
    }

};


