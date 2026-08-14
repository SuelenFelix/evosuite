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

public class CachedResource_getMethod_2742096937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10265;

    public CachedResource_getMethod_2742096937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10265 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term10304 = (Object[]) newArray("java.lang.String", 7);
        setField(term10265, term10265.getClass(), "pattern", "UxgSdhxPCH");
        setField(term10265, term10265.getClass(), "method", "DAujxZPHJC");
        setBooleanField(term10265, term10265.getClass(), "cached", true);
        setBooleanField(term10265, term10265.getClass(), "async", true);
        setField(term10265, term10265.getClass(), "keyLookupType", "IlBhdrCvHq");
        setElement(term10304, 0, "OirVUQhauU");
        setElement(term10304, 1, "GLbyDfbNZI");
        setElement(term10304, 2, "oNLcCYDAsO");
        setElement(term10304, 3, "CNqMxLvtcJ");
        setElement(term10304, 4, "ktbqerIaKW");
        setElement(term10304, 5, "VoghngXfsK");
        setElement(term10304, 6, "GbahCBMvct");
        setField(term10265, term10265.getClass(), "keyLookupHeaders", term10304);
        setField(term10265, term10265.getClass(), "keyLookupClass", "iiHBhsNFgk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term10265, args);
    }

};


