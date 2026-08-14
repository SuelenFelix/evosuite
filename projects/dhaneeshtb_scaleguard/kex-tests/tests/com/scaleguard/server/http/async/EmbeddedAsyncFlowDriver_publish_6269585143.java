package com.scaleguard.server.http.async;

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
import static com.scaleguard.server.http.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmbeddedAsyncFlowDriver_publish_6269585143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3664;

    public EmbeddedAsyncFlowDriver_publish_6269585143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3664 = newInstance(Class.forName("com.scaleguard.server.http.async.EmbeddedAsyncFlowDriver"));
        setField(term3664, term3664.getClass(), "engineRecord", null);
        setField(term3664, term3664.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.async.EmbeddedAsyncFlowDriver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "publish", argTypes, term3664, args);
    }

};


