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

public class LoggingProperties_isLogBody_1813068918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314;

    public LoggingProperties_isLogBody_1813068918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4314 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term4329 = (Object[]) newArray("java.lang.String", 6);
        Object[] term4403 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term4314, term4314.getClass(), "logRequestId", false);
        setField(term4314, term4314.getClass(), "requestIdPrefix", "JppkknKVOw");
        setBooleanField(term4314, term4314.getClass(), "logHeaders", false);
        setElement(term4329, 0, "iljANwuEjk");
        setElement(term4329, 1, "kNqaJKIATy");
        setElement(term4329, 2, "vKQukfbJUd");
        setElement(term4329, 3, "lFRJFUMVbx");
        setElement(term4329, 4, "sZdUNdggUW");
        setElement(term4329, 5, "OqbwYQfvAe");
        setField(term4314, term4314.getClass(), "maskedHeaders", term4329);
        setBooleanField(term4314, term4314.getClass(), "logCookies", true);
        setElement(term4403, 0, "tRxZafjqIx");
        setElement(term4403, 1, "DhjNLmRMCu");
        setField(term4314, term4314.getClass(), "maskedCookies", term4403);
        setBooleanField(term4314, term4314.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLogBody", argTypes, term4314, args);
    }

};


