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

public class CachedResource_setKeyLookupType_178229775725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11803;

    public CachedResource_setKeyLookupType_178229775725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11803 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term11803, term11803.getClass(), "pattern", null);
        setField(term11803, term11803.getClass(), "method", null);
        setBooleanField(term11803, term11803.getClass(), "cached", false);
        setBooleanField(term11803, term11803.getClass(), "async", false);
        setField(term11803, term11803.getClass(), "keyLookupType", null);
        setField(term11803, term11803.getClass(), "keyLookupHeaders", null);
        setField(term11803, term11803.getClass(), "keyLookupClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKeyLookupType", argTypes, term11803, args);
    }

};


