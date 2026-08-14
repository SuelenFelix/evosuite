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

public class CorsProperties_getAllowedMethods_102353198322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229;

    public CorsProperties_getAllowedMethods_102353198322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2229 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        setField(term2229, term2229.getClass(), "filterRegistrationPath", null);
        setField(term2229, term2229.getClass(), "allowCredentials", null);
        setField(term2229, term2229.getClass(), "allowedHeaders", null);
        setField(term2229, term2229.getClass(), "allowedMethods", null);
        setField(term2229, term2229.getClass(), "allowedOrigins", null);
        setField(term2229, term2229.getClass(), "exposedHeaders", null);
        setField(term2229, term2229.getClass(), "maxAgeSeconds", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowedMethods", argTypes, term2229, args);
    }

};


