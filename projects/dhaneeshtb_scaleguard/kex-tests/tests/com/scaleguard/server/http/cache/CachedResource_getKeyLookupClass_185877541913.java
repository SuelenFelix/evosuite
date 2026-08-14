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

public class CachedResource_getKeyLookupClass_185877541913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11412;

    public CachedResource_getKeyLookupClass_185877541913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11412 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term11451 = (Object[]) newArray("java.lang.String", 6);
        setField(term11412, term11412.getClass(), "pattern", "VBUahCvyxC");
        setField(term11412, term11412.getClass(), "method", "MlzTkzKMCX");
        setBooleanField(term11412, term11412.getClass(), "cached", false);
        setBooleanField(term11412, term11412.getClass(), "async", true);
        setField(term11412, term11412.getClass(), "keyLookupType", "UqKUbMyPMJ");
        setElement(term11451, 0, "QpYltHAdyY");
        setElement(term11451, 1, "lbmSGBwIiV");
        setElement(term11451, 2, "DAxyHoTLzZ");
        setElement(term11451, 3, "fhZgTouhCC");
        setElement(term11451, 4, "wrikqJwXvL");
        setElement(term11451, 5, "UiWhvbypdr");
        setField(term11412, term11412.getClass(), "keyLookupHeaders", term11451);
        setField(term11412, term11412.getClass(), "keyLookupClass", "CgleElJNje");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyLookupClass", argTypes, term11412, args);
    }

};


