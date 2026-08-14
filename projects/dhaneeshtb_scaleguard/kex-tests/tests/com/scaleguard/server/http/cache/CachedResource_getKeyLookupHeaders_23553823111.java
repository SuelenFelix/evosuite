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

public class CachedResource_getKeyLookupHeaders_23553823111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11073;

    public CachedResource_getKeyLookupHeaders_23553823111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11073 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term11112 = (Object[]) newArray("java.lang.String", 4);
        setField(term11073, term11073.getClass(), "pattern", "qnYaYSpDwO");
        setField(term11073, term11073.getClass(), "method", "dgbFDCdHtj");
        setBooleanField(term11073, term11073.getClass(), "cached", false);
        setBooleanField(term11073, term11073.getClass(), "async", false);
        setField(term11073, term11073.getClass(), "keyLookupType", "EKpdCBubDE");
        setElement(term11112, 0, "zMsSLTfGhl");
        setElement(term11112, 1, "bEmHScVZaQ");
        setElement(term11112, 2, "TcuXODkzBV");
        setElement(term11112, 3, "coJPjrBZNe");
        setField(term11073, term11073.getClass(), "keyLookupHeaders", term11112);
        setField(term11073, term11073.getClass(), "keyLookupClass", "vMsWjuPTnO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyLookupHeaders", argTypes, term11073, args);
    }

};


