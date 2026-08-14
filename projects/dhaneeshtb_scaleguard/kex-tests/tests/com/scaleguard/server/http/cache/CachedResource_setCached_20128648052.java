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

public class CachedResource_setCached_20128648052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9559;
     Object term9695;

    public CachedResource_setCached_20128648052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9559 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term9598 = (Object[]) newArray("java.lang.String", 7);
        setField(term9559, term9559.getClass(), "pattern", "hIYsRyOZxk");
        setField(term9559, term9559.getClass(), "method", "RjNoEywJbC");
        setBooleanField(term9559, term9559.getClass(), "cached", true);
        setBooleanField(term9559, term9559.getClass(), "async", true);
        setField(term9559, term9559.getClass(), "keyLookupType", "RTTvrwwhou");
        setElement(term9598, 0, "lRORwXipuk");
        setElement(term9598, 1, "fVdTcjgHdw");
        setElement(term9598, 2, "wwAwLLcLPp");
        setElement(term9598, 3, "nHpMKOmlpQ");
        setElement(term9598, 4, "fKhrQsJToZ");
        setElement(term9598, 5, "wsysQLGFnl");
        setElement(term9598, 6, "ckQLZGFjMX");
        setField(term9559, term9559.getClass(), "keyLookupHeaders", term9598);
        setField(term9559, term9559.getClass(), "keyLookupClass", "qphdrqUtNx");
        term9695 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9695;
        callMethod(klass, "setCached", argTypes, term9559, args);
    }

};


