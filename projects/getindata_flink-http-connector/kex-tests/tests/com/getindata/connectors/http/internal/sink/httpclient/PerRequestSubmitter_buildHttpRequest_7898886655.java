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

public class PerRequestSubmitter_buildHttpRequest_7898886655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3321;

    public PerRequestSubmitter_buildHttpRequest_7898886655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3321 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter"));
        setField(term3321, term3321.getClass(), "publishingThreadPool", null);
        setIntField(term3321, term3321.getClass(), "httpRequestTimeOutSeconds", 0);
        setField(term3321, term3321.getClass(), "headersAndValues", null);
        setField(term3321, term3321.getClass(), "httpClient", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "buildHttpRequest", argTypes, term3321, args);
    }

};


