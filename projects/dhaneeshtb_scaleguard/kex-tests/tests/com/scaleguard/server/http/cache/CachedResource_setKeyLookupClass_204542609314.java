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

public class CachedResource_setKeyLookupClass_204542609314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11636;

    public CachedResource_setKeyLookupClass_204542609314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11636 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term11675 = (Object[]) newArray("java.lang.String", 1);
        setField(term11636, term11636.getClass(), "pattern", "ZrchvNGMtd");
        setField(term11636, term11636.getClass(), "method", "WaEcyVlcIx");
        setBooleanField(term11636, term11636.getClass(), "cached", true);
        setBooleanField(term11636, term11636.getClass(), "async", true);
        setField(term11636, term11636.getClass(), "keyLookupType", "ONcbPCQnHd");
        setElement(term11675, 0, "AobDaplFLl");
        setField(term11636, term11636.getClass(), "keyLookupHeaders", term11675);
        setField(term11636, term11636.getClass(), "keyLookupClass", "pDkMNnAGgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PaCpFXGzdX";
        callMethod(klass, "setKeyLookupClass", argTypes, term11636, args);
    }

};


