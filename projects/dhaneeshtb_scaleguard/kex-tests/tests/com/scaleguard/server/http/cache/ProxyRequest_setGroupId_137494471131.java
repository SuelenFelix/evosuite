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

public class ProxyRequest_setGroupId_137494471131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4481;

    public ProxyRequest_setGroupId_137494471131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4481 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term4481, term4481.getClass(), "id", null);
        setField(term4481, term4481.getClass(), "method", null);
        setField(term4481, term4481.getClass(), "scheme", null);
        setField(term4481, term4481.getClass(), "groupId", null);
        setField(term4481, term4481.getClass(), "hostGrpId", null);
        setField(term4481, term4481.getClass(), "host", null);
        setField(term4481, term4481.getClass(), "port", null);
        setField(term4481, term4481.getClass(), "uri", null);
        setField(term4481, term4481.getClass(), "headers", null);
        setField(term4481, term4481.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGroupId", argTypes, term4481, args);
    }

};


