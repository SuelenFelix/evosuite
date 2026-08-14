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

public class SinkHttpClientResponse_canEqual_16946954074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20531;
     Object term20570;

    public SinkHttpClientResponse_canEqual_16946954074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20532 = new ArrayList();
        ArrayList term20539 = new ArrayList();
        Object term20538 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20538, term20538.getClass(), "httpRequest", null);
        setField(term20538, term20538.getClass(), "elements", term20539);
        setField(term20538, term20538.getClass(), "method", "");
        ArrayList term20544 = new ArrayList();
        Object term20543 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20543, term20543.getClass(), "httpRequest", null);
        setField(term20543, term20543.getClass(), "elements", term20544);
        setField(term20543, term20543.getClass(), "method", "");
        ArrayList term20549 = new ArrayList();
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        ((ArrayList) term20549).add((Object)null);
        Object term20548 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20548, term20548.getClass(), "httpRequest", null);
        setField(term20548, term20548.getClass(), "elements", term20549);
        setField(term20548, term20548.getClass(), "method", "");
        ArrayList term20554 = new ArrayList();
        ((ArrayList) term20554).add((Object)null);
        ((ArrayList) term20554).add((Object)null);
        ((ArrayList) term20554).add((Object)null);
        ((ArrayList) term20554).add((Object)null);
        ((ArrayList) term20554).add((Object)null);
        Object term20553 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20553, term20553.getClass(), "httpRequest", null);
        setField(term20553, term20553.getClass(), "elements", term20554);
        setField(term20553, term20553.getClass(), "method", "");
        ArrayList term20559 = new ArrayList();
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        ((ArrayList) term20559).add((Object)null);
        Object term20558 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20558, term20558.getClass(), "httpRequest", null);
        setField(term20558, term20558.getClass(), "elements", term20559);
        setField(term20558, term20558.getClass(), "method", "");
        ArrayList term20564 = new ArrayList();
        ((ArrayList) term20564).add((Object)null);
        Object term20563 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20563, term20563.getClass(), "httpRequest", null);
        setField(term20563, term20563.getClass(), "elements", term20564);
        setField(term20563, term20563.getClass(), "method", "");
        ArrayList term20536 = new ArrayList();
        ((ArrayList) term20536).add(term20538);
        ((ArrayList) term20536).add(term20543);
        ((ArrayList) term20536).add(term20548);
        ((ArrayList) term20536).add(term20553);
        ((ArrayList) term20536).add(term20558);
        ((ArrayList) term20536).add(term20563);
        term20531 = newInstance(Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse"));
        setField(term20531, term20531.getClass(), "successfulRequests", term20532);
        setField(term20531, term20531.getClass(), "failedRequests", term20536);
        term20570 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20570;
        callMethod(klass, "canEqual", argTypes, term20531, args);
    }

};


