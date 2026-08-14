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

public class HttpClientMock_submitToBodyHandler_58843456274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18296;

    public HttpClientMock_submitToBodyHandler_58843456274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18296 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        setField(term18296, term18296.getClass(), "debugger", null);
        setField(term18296, term18296.getClass(), "rules", null);
        setField(term18296, term18296.getClass(), "rulesUnderConstruction", null);
        setField(term18296, term18296.getClass(), "host", null);
        setField(term18296, term18296.getClass(), "requests", null);
        setBooleanField(term18296, term18296.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse");
        argTypes[1] = Class.forName("java.net.http.HttpResponse$BodyHandler");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "submitToBodyHandler", argTypes, term18296, args);
    }

};


