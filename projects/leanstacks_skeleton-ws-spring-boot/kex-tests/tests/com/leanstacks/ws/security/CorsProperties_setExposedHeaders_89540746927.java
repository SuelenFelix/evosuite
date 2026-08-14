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

public class CorsProperties_setExposedHeaders_89540746927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;

    public CorsProperties_setExposedHeaders_89540746927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2234 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        setField(term2234, term2234.getClass(), "filterRegistrationPath", null);
        setField(term2234, term2234.getClass(), "allowCredentials", null);
        setField(term2234, term2234.getClass(), "allowedHeaders", null);
        setField(term2234, term2234.getClass(), "allowedMethods", null);
        setField(term2234, term2234.getClass(), "allowedOrigins", null);
        setField(term2234, term2234.getClass(), "exposedHeaders", null);
        setField(term2234, term2234.getClass(), "maxAgeSeconds", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExposedHeaders", argTypes, term2234, args);
    }

};


