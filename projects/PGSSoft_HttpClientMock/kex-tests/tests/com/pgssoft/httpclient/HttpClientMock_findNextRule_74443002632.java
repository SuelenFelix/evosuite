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

public class HttpClientMock_findNextRule_74443002632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18099;

    public HttpClientMock_findNextRule_74443002632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18101 = new ArrayList();
        ArrayList term18105 = new ArrayList();
        ArrayList term18111 = new ArrayList();
        term18099 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18100 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18099, term18099.getClass(), "debugger", term18100);
        setField(term18099, term18099.getClass(), "rules", term18101);
        setField(term18099, term18099.getClass(), "rulesUnderConstruction", term18105);
        setField(term18099, term18099.getClass(), "host", "");
        setField(term18099, term18099.getClass(), "requests", term18111);
        setBooleanField(term18099, term18099.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "findNextRule", argTypes, term18099, args);
    }

};


