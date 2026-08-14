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

public class HttpClientMock_onPost_27405694651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18250;

    public HttpClientMock_onPost_27405694651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18250 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        setField(term18250, term18250.getClass(), "debugger", null);
        setField(term18250, term18250.getClass(), "rules", null);
        setField(term18250, term18250.getClass(), "rulesUnderConstruction", null);
        setField(term18250, term18250.getClass(), "host", null);
        setField(term18250, term18250.getClass(), "requests", null);
        setBooleanField(term18250, term18250.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onPost", argTypes, term18250, args);
    }

};


