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

public class ProxyRequest_setUri_2474645337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4487;

    public ProxyRequest_setUri_2474645337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4487 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term4487, term4487.getClass(), "id", null);
        setField(term4487, term4487.getClass(), "method", null);
        setField(term4487, term4487.getClass(), "scheme", null);
        setField(term4487, term4487.getClass(), "groupId", null);
        setField(term4487, term4487.getClass(), "hostGrpId", null);
        setField(term4487, term4487.getClass(), "host", null);
        setField(term4487, term4487.getClass(), "port", null);
        setField(term4487, term4487.getClass(), "uri", null);
        setField(term4487, term4487.getClass(), "headers", null);
        setField(term4487, term4487.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUri", argTypes, term4487, args);
    }

};


