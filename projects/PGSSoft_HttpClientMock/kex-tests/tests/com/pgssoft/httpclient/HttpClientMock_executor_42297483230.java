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

public class HttpClientMock_executor_42297483230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18065;

    public HttpClientMock_executor_42297483230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18067 = new ArrayList();
        ArrayList term18071 = new ArrayList();
        ArrayList term18077 = new ArrayList();
        term18065 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18066 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18065, term18065.getClass(), "debugger", term18066);
        setField(term18065, term18065.getClass(), "rules", term18067);
        setField(term18065, term18065.getClass(), "rulesUnderConstruction", term18071);
        setField(term18065, term18065.getClass(), "host", "");
        setField(term18065, term18065.getClass(), "requests", term18077);
        setBooleanField(term18065, term18065.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "executor", argTypes, term18065, args);
    }

};


