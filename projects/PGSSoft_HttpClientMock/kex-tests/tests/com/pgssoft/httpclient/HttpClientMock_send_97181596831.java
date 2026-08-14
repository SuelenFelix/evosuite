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

public class HttpClientMock_send_97181596831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18082;

    public HttpClientMock_send_97181596831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18084 = new ArrayList();
        ArrayList term18088 = new ArrayList();
        ArrayList term18094 = new ArrayList();
        term18082 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18083 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18082, term18082.getClass(), "debugger", term18083);
        setField(term18082, term18082.getClass(), "rules", term18084);
        setField(term18082, term18082.getClass(), "rulesUnderConstruction", term18088);
        setField(term18082, term18082.getClass(), "host", "");
        setField(term18082, term18082.getClass(), "requests", term18094);
        setBooleanField(term18082, term18082.getClass(), "debuggingOn", true);
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
        callMethod(klass, "send", argTypes, term18082, args);
    }

};


