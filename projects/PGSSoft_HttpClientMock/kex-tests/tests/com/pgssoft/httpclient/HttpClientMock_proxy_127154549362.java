package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpClientMock_proxy_127154549362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18272;

    public HttpClientMock_proxy_127154549362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18272 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        setField(term18272, term18272.getClass(), "debugger", null);
        setField(term18272, term18272.getClass(), "rules", null);
        setField(term18272, term18272.getClass(), "rulesUnderConstruction", null);
        setField(term18272, term18272.getClass(), "host", null);
        setField(term18272, term18272.getClass(), "requests", null);
        setBooleanField(term18272, term18272.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "proxy", argTypes, term18272, args);
    }

};


