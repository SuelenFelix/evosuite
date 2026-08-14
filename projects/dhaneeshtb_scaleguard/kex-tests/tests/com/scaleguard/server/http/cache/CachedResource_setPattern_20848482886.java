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

public class CachedResource_setPattern_20848482886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10107;

    public CachedResource_setPattern_20848482886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10107 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term10146 = (Object[]) newArray("java.lang.String", 2);
        setField(term10107, term10107.getClass(), "pattern", "FiYYLuailz");
        setField(term10107, term10107.getClass(), "method", "XebAeSnCKZ");
        setBooleanField(term10107, term10107.getClass(), "cached", true);
        setBooleanField(term10107, term10107.getClass(), "async", true);
        setField(term10107, term10107.getClass(), "keyLookupType", "GeddnXjHGy");
        setElement(term10146, 0, "vLTbaoAxBm");
        setElement(term10146, 1, "BXTjEyEZxD");
        setField(term10107, term10107.getClass(), "keyLookupHeaders", term10146);
        setField(term10107, term10107.getClass(), "keyLookupClass", "oKhVzOKUFW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mNHyqmOAFy";
        callMethod(klass, "setPattern", argTypes, term10107, args);
    }

};


