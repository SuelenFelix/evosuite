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

public class HttpClientMock_sendAsync_189618320234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18133;

    public HttpClientMock_sendAsync_189618320234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18135 = new ArrayList();
        ArrayList term18139 = new ArrayList();
        ArrayList term18145 = new ArrayList();
        term18133 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18134 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18133, term18133.getClass(), "debugger", term18134);
        setField(term18133, term18133.getClass(), "rules", term18135);
        setField(term18133, term18133.getClass(), "rulesUnderConstruction", term18139);
        setField(term18133, term18133.getClass(), "host", "");
        setField(term18133, term18133.getClass(), "requests", term18145);
        setBooleanField(term18133, term18133.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("java.net.http.HttpResponse$BodyHandler");
        argTypes[2] = Class.forName("java.net.http.HttpResponse$PushPromiseHandler");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "sendAsync", argTypes, term18133, args);
    }

};


