package com.leanstacks.ws.security;

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
import static com.leanstacks.ws.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CorsProperties_getAllowedHeaders_38222975520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;

    public CorsProperties_getAllowedHeaders_38222975520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2227 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        setField(term2227, term2227.getClass(), "filterRegistrationPath", null);
        setField(term2227, term2227.getClass(), "allowCredentials", null);
        setField(term2227, term2227.getClass(), "allowedHeaders", null);
        setField(term2227, term2227.getClass(), "allowedMethods", null);
        setField(term2227, term2227.getClass(), "allowedOrigins", null);
        setField(term2227, term2227.getClass(), "exposedHeaders", null);
        setField(term2227, term2227.getClass(), "maxAgeSeconds", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowedHeaders", argTypes, term2227, args);
    }

};


