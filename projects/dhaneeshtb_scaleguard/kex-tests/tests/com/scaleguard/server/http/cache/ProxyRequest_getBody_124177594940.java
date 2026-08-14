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

public class ProxyRequest_getBody_124177594940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4490;

    public ProxyRequest_getBody_124177594940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4490 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term4490, term4490.getClass(), "id", null);
        setField(term4490, term4490.getClass(), "method", null);
        setField(term4490, term4490.getClass(), "scheme", null);
        setField(term4490, term4490.getClass(), "groupId", null);
        setField(term4490, term4490.getClass(), "hostGrpId", null);
        setField(term4490, term4490.getClass(), "host", null);
        setField(term4490, term4490.getClass(), "port", null);
        setField(term4490, term4490.getClass(), "uri", null);
        setField(term4490, term4490.getClass(), "headers", null);
        setField(term4490, term4490.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term4490, args);
    }

};


