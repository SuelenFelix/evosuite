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
import java.lang.Object;
import java.lang.Boolean;

public class LoggingProperties_LoggingPropertiesBuilder_logBody_5669617035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1533;
     Object term1564;

    public LoggingProperties_LoggingPropertiesBuilder_logBody_5669617035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1533 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term1548 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1562 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term1533, term1533.getClass(), "logRequestId", false);
        setField(term1533, term1533.getClass(), "requestIdPrefix", "TJmVBGfTML");
        setBooleanField(term1533, term1533.getClass(), "logHeaders", false);
        setElement(term1548, 0, "tPlsykYBqO");
        setField(term1533, term1533.getClass(), "maskedHeaders", term1548);
        setBooleanField(term1533, term1533.getClass(), "logCookies", true);
        setField(term1533, term1533.getClass(), "maskedCookies", term1562);
        setBooleanField(term1533, term1533.getClass(), "logBody", true);
        term1564 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1564;
        callMethod(klass, "logBody", argTypes, term1533, args);
    }

};


