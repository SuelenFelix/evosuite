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

public class JavaNetSinkHttpClient_prepareSinkHttpClientResponse_72813116412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438;

    public JavaNetSinkHttpClient_prepareSinkHttpClientResponse_72813116412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1438 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        setField(term1438, term1438.getClass(), "headersAndValues", null);
        setField(term1438, term1438.getClass(), "headerMap", null);
        setField(term1438, term1438.getClass(), "statusCodeChecker", null);
        setField(term1438, term1438.getClass(), "httpPostRequestCallback", null);
        setField(term1438, term1438.getClass(), "requestSubmitter", null);
        setField(term1438, term1438.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "prepareSinkHttpClientResponse", argTypes, term1438, args);
    }

};


