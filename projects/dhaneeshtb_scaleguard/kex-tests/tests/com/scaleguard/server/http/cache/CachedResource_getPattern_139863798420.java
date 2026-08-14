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

public class CachedResource_getPattern_139863798420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11788;

    public CachedResource_getPattern_139863798420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11788 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term11788, term11788.getClass(), "pattern", null);
        setField(term11788, term11788.getClass(), "method", null);
        setBooleanField(term11788, term11788.getClass(), "cached", false);
        setBooleanField(term11788, term11788.getClass(), "async", false);
        setField(term11788, term11788.getClass(), "keyLookupType", null);
        setField(term11788, term11788.getClass(), "keyLookupHeaders", null);
        setField(term11788, term11788.getClass(), "keyLookupClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPattern", argTypes, term11788, args);
    }

};


