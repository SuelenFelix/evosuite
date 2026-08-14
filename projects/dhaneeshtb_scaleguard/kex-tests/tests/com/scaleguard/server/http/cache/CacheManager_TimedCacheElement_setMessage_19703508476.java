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

public class CacheManager_TimedCacheElement_setMessage_19703508476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4516;
     Object term4520;

    public CacheManager_TimedCacheElement_setMessage_19703508476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4516 = newInstance(Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement"));
        Object term4519 = newInstance(Class.forName("java.lang.Object"));
        setLongField(term4516, term4516.getClass(), "cacheTime", 4872422362414183754L);
        setIntField(term4516, term4516.getClass(), "expiry", -1955890973);
        setField(term4516, term4516.getClass(), "message", term4519);
        term4520 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CacheManager$TimedCacheElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4520;
        callMethod(klass, "setMessage", argTypes, term4516, args);
    }

};


