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

public class CachedResource_setMethod_21201235098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10511;

    public CachedResource_setMethod_21201235098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10511 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term10550 = (Object[]) newArray("java.lang.String", 1);
        setField(term10511, term10511.getClass(), "pattern", "HknsTajwxJ");
        setField(term10511, term10511.getClass(), "method", "XtiurrVYKw");
        setBooleanField(term10511, term10511.getClass(), "cached", false);
        setBooleanField(term10511, term10511.getClass(), "async", true);
        setField(term10511, term10511.getClass(), "keyLookupType", "rsumfoDNHa");
        setElement(term10550, 0, "ceCWHUTQUM");
        setField(term10511, term10511.getClass(), "keyLookupHeaders", term10550);
        setField(term10511, term10511.getClass(), "keyLookupClass", "LrqwfrKKtS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZUdnQXfzCI";
        callMethod(klass, "setMethod", argTypes, term10511, args);
    }

};


