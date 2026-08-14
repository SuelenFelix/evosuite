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
import java.lang.Object;
import java.util.ArrayList;

public class HttpClientMock_sendAsync_210350478033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18116;

    public HttpClientMock_sendAsync_210350478033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18118 = new ArrayList();
        ArrayList term18122 = new ArrayList();
        ArrayList term18128 = new ArrayList();
        term18116 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18117 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18116, term18116.getClass(), "debugger", term18117);
        setField(term18116, term18116.getClass(), "rules", term18118);
        setField(term18116, term18116.getClass(), "rulesUnderConstruction", term18122);
        setField(term18116, term18116.getClass(), "host", "");
        setField(term18116, term18116.getClass(), "requests", term18128);
        setBooleanField(term18116, term18116.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("java.net.http.HttpResponse$BodyHandler");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "sendAsync", argTypes, term18116, args);
    }

};


