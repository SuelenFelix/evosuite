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
import java.lang.Boolean;

public class CachedResource_setAsync_12940174234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9899;
     Object term9963;

    public CachedResource_setAsync_12940174234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9899 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term9938 = (Object[]) newArray("java.lang.String", 1);
        setField(term9899, term9899.getClass(), "pattern", "BWxJSgKHRT");
        setField(term9899, term9899.getClass(), "method", "AGXoIndFnm");
        setBooleanField(term9899, term9899.getClass(), "cached", false);
        setBooleanField(term9899, term9899.getClass(), "async", false);
        setField(term9899, term9899.getClass(), "keyLookupType", "mwmFMNEzkK");
        setElement(term9938, 0, "kVAmKknVln");
        setField(term9899, term9899.getClass(), "keyLookupHeaders", term9938);
        setField(term9899, term9899.getClass(), "keyLookupClass", "MRFLbEGYKG");
        term9963 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9963;
        callMethod(klass, "setAsync", argTypes, term9899, args);
    }

};


