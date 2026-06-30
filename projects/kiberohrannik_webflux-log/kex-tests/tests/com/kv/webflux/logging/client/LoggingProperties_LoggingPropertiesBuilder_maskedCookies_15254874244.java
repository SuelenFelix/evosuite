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

public class LoggingProperties_LoggingPropertiesBuilder_maskedCookies_15254874244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;
     Object term1386;

    public LoggingProperties_LoggingPropertiesBuilder_maskedCookies_15254874244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1283 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term1298 = (Object[]) newArray("java.lang.String", 5);
        Object[] term1360 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term1283, term1283.getClass(), "logRequestId", true);
        setField(term1283, term1283.getClass(), "requestIdPrefix", "ffYhPOzlUs");
        setBooleanField(term1283, term1283.getClass(), "logHeaders", true);
        setElement(term1298, 0, "MLqYREekMl");
        setElement(term1298, 1, "ytSBIKXogI");
        setElement(term1298, 2, "nHXjMycHlU");
        setElement(term1298, 3, "ieCtQFdkii");
        setElement(term1298, 4, "dEnhdmILtU");
        setField(term1283, term1283.getClass(), "maskedHeaders", term1298);
        setBooleanField(term1283, term1283.getClass(), "logCookies", true);
        setElement(term1360, 0, "hoicvmsovO");
        setElement(term1360, 1, "eqJfYWRaEL");
        setField(term1283, term1283.getClass(), "maskedCookies", term1360);
        setBooleanField(term1283, term1283.getClass(), "logBody", false);
        term1386 = (Object[]) newArray("java.lang.String", 3);
        setElement(term1386, 0, "fhkbdRViHi");
        setElement(term1386, 1, "uWHnvSvaPl");
        setElement(term1386, 2, "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1386;
        callMethod(klass, "maskedCookies", argTypes, term1283, args);
    }

};


