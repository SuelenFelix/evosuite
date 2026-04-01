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

public class CorsProperties_getAllowCredentials_1320043218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225;

    public CorsProperties_getAllowCredentials_1320043218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2225 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        setField(term2225, term2225.getClass(), "filterRegistrationPath", null);
        setField(term2225, term2225.getClass(), "allowCredentials", null);
        setField(term2225, term2225.getClass(), "allowedHeaders", null);
        setField(term2225, term2225.getClass(), "allowedMethods", null);
        setField(term2225, term2225.getClass(), "allowedOrigins", null);
        setField(term2225, term2225.getClass(), "exposedHeaders", null);
        setField(term2225, term2225.getClass(), "maxAgeSeconds", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowCredentials", argTypes, term2225, args);
    }

};


