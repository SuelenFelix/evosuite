package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CachedResource_getMethod_27420969322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11794;

    public CachedResource_getMethod_27420969322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11794 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term11794, term11794.getClass(), "pattern", null);
        setField(term11794, term11794.getClass(), "method", null);
        setBooleanField(term11794, term11794.getClass(), "cached", false);
        setBooleanField(term11794, term11794.getClass(), "async", false);
        setField(term11794, term11794.getClass(), "keyLookupType", null);
        setField(term11794, term11794.getClass(), "keyLookupHeaders", null);
        setField(term11794, term11794.getClass(), "keyLookupClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term11794, args);
    }

};


