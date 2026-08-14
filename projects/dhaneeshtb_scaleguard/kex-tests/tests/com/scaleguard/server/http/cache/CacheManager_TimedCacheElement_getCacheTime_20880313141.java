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

public class CacheManager_TimedCacheElement_getCacheTime_20880313141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4492;

    public CacheManager_TimedCacheElement_getCacheTime_20880313141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4492 = newInstance(Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement"));
        Object term4495 = newInstance(Class.forName("java.lang.Object"));
        setLongField(term4492, term4492.getClass(), "cacheTime", 2442117782898005296L);
        setIntField(term4492, term4492.getClass(), "expiry", 568599855);
        setField(term4492, term4492.getClass(), "message", term4495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCacheTime", argTypes, term4492, args);
    }

};


