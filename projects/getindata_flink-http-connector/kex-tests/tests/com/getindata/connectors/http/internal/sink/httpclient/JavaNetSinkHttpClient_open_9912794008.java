package com.getindata.connectors.http.internal.sink.httpclient;

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
import static com.getindata.connectors.http.internal.sink.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JavaNetSinkHttpClient_open_9912794008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;

    public JavaNetSinkHttpClient_open_9912794008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        setField(term1434, term1434.getClass(), "headersAndValues", null);
        setField(term1434, term1434.getClass(), "headerMap", null);
        setField(term1434, term1434.getClass(), "statusCodeChecker", null);
        setField(term1434, term1434.getClass(), "httpPostRequestCallback", null);
        setField(term1434, term1434.getClass(), "requestSubmitter", null);
        setField(term1434, term1434.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "open", argTypes, term1434, args);
    }

};


