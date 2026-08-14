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

public class CachedResponse_setResource_60262779813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9396;

    public CachedResponse_setResource_60262779813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9396 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        setField(term9396, term9396.getClass(), "response", null);
        setField(term9396, term9396.getClass(), "resource", null);
        setField(term9396, term9396.getClass(), "proxyRequest", null);
        setField(term9396, term9396.getClass(), "key", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResource", argTypes, term9396, args);
    }

};


