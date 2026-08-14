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

public class CacheManager_TimedCacheElement_getMessage_15123626595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4512;

    public CacheManager_TimedCacheElement_getMessage_15123626595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4512 = newInstance(Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement"));
        Object term4515 = newInstance(Class.forName("java.lang.Object"));
        setLongField(term4512, term4512.getClass(), "cacheTime", 7411271909051562686L);
        setIntField(term4512, term4512.getClass(), "expiry", -616727354);
        setField(term4512, term4512.getClass(), "message", term4515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term4512, args);
    }

};


