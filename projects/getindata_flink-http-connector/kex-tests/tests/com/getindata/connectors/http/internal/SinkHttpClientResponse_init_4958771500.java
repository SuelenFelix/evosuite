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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class SinkHttpClientResponse_init_4958771500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20364;
     Object term20367;

    public SinkHttpClientResponse_init_4958771500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20364 = new LinkedList();
        ArrayList term20371 = new ArrayList();
        ((ArrayList) term20371).add((Object)null);
        ((ArrayList) term20371).add((Object)null);
        ((ArrayList) term20371).add((Object)null);
        ((ArrayList) term20371).add((Object)null);
        Object term20370 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20370, term20370.getClass(), "httpRequest", null);
        setField(term20370, term20370.getClass(), "elements", term20371);
        setField(term20370, term20370.getClass(), "method", "wzsPSPcRdj");
        ArrayList term20389 = new ArrayList();
        ((ArrayList) term20389).add((Object)null);
        ((ArrayList) term20389).add((Object)null);
        ((ArrayList) term20389).add((Object)null);
        ((ArrayList) term20389).add((Object)null);
        ((ArrayList) term20389).add((Object)null);
        Object term20388 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20388, term20388.getClass(), "httpRequest", null);
        setField(term20388, term20388.getClass(), "elements", term20389);
        setField(term20388, term20388.getClass(), "method", "");
        term20367 = new LinkedList();
        ((LinkedList) term20367).add(term20370);
        ((LinkedList) term20367).add(term20388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term20364;
        args[1] = term20367;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


