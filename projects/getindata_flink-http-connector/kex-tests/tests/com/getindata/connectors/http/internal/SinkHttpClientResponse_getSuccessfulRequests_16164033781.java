package com.getindata.connectors.http.internal;

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
import static com.getindata.connectors.http.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SinkHttpClientResponse_getSuccessfulRequests_16164033781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20404;

    public SinkHttpClientResponse_getSuccessfulRequests_16164033781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20408 = new ArrayList();
        ((ArrayList) term20408).add((Object)null);
        ((ArrayList) term20408).add((Object)null);
        ((ArrayList) term20408).add((Object)null);
        ((ArrayList) term20408).add((Object)null);
        ((ArrayList) term20408).add((Object)null);
        ((ArrayList) term20408).add((Object)null);
        Object term20407 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20407, term20407.getClass(), "httpRequest", null);
        setField(term20407, term20407.getClass(), "elements", term20408);
        setField(term20407, term20407.getClass(), "method", "");
        ArrayList term20405 = new ArrayList();
        ((ArrayList) term20405).add(term20407);
        ArrayList term20417 = new ArrayList();
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        ((ArrayList) term20417).add((Object)null);
        Object term20416 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20416, term20416.getClass(), "httpRequest", null);
        setField(term20416, term20416.getClass(), "elements", term20417);
        setField(term20416, term20416.getClass(), "method", "");
        ArrayList term20422 = new ArrayList();
        ((ArrayList) term20422).add((Object)null);
        ((ArrayList) term20422).add((Object)null);
        ((ArrayList) term20422).add((Object)null);
        ((ArrayList) term20422).add((Object)null);
        ((ArrayList) term20422).add((Object)null);
        Object term20421 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20421, term20421.getClass(), "httpRequest", null);
        setField(term20421, term20421.getClass(), "elements", term20422);
        setField(term20421, term20421.getClass(), "method", "");
        ArrayList term20414 = new ArrayList();
        ((ArrayList) term20414).add(term20416);
        ((ArrayList) term20414).add(term20421);
        term20404 = newInstance(Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse"));
        setField(term20404, term20404.getClass(), "successfulRequests", term20405);
        setField(term20404, term20404.getClass(), "failedRequests", term20414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessfulRequests", argTypes, term20404, args);
    }

};


