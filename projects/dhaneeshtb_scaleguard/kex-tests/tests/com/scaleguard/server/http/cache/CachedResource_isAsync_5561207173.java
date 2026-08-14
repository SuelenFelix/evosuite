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
import java.lang.Object;

public class CachedResource_isAsync_5561207173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9807;

    public CachedResource_isAsync_5561207173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9807 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term9846 = (Object[]) newArray("java.lang.String", 0);
        setField(term9807, term9807.getClass(), "pattern", "bwlLFAfNWx");
        setField(term9807, term9807.getClass(), "method", "JWodNQzjjV");
        setBooleanField(term9807, term9807.getClass(), "cached", true);
        setBooleanField(term9807, term9807.getClass(), "async", true);
        setField(term9807, term9807.getClass(), "keyLookupType", "CAgxWjhxNf");
        setField(term9807, term9807.getClass(), "keyLookupHeaders", term9846);
        setField(term9807, term9807.getClass(), "keyLookupClass", "goAoCMhKBu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAsync", argTypes, term9807, args);
    }

};


