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

public class SinkHttpClientResponse_getFailedRequests_19909977112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20428;

    public SinkHttpClientResponse_getFailedRequests_19909977112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20432 = new ArrayList();
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        ((ArrayList) term20432).add((Object)null);
        Object term20431 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20431, term20431.getClass(), "httpRequest", null);
        setField(term20431, term20431.getClass(), "elements", term20432);
        setField(term20431, term20431.getClass(), "method", "");
        ArrayList term20437 = new ArrayList();
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        ((ArrayList) term20437).add((Object)null);
        Object term20436 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20436, term20436.getClass(), "httpRequest", null);
        setField(term20436, term20436.getClass(), "elements", term20437);
        setField(term20436, term20436.getClass(), "method", "");
        ArrayList term20442 = new ArrayList();
        ((ArrayList) term20442).add((Object)null);
        ((ArrayList) term20442).add((Object)null);
        ((ArrayList) term20442).add((Object)null);
        Object term20441 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20441, term20441.getClass(), "httpRequest", null);
        setField(term20441, term20441.getClass(), "elements", term20442);
        setField(term20441, term20441.getClass(), "method", "");
        ArrayList term20447 = new ArrayList();
        ((ArrayList) term20447).add((Object)null);
        Object term20446 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20446, term20446.getClass(), "httpRequest", null);
        setField(term20446, term20446.getClass(), "elements", term20447);
        setField(term20446, term20446.getClass(), "method", "");
        ArrayList term20452 = new ArrayList();
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        ((ArrayList) term20452).add((Object)null);
        Object term20451 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20451, term20451.getClass(), "httpRequest", null);
        setField(term20451, term20451.getClass(), "elements", term20452);
        setField(term20451, term20451.getClass(), "method", "");
        ArrayList term20457 = new ArrayList();
        Object term20456 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20456, term20456.getClass(), "httpRequest", null);
        setField(term20456, term20456.getClass(), "elements", term20457);
        setField(term20456, term20456.getClass(), "method", "");
        ArrayList term20462 = new ArrayList();
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        ((ArrayList) term20462).add((Object)null);
        Object term20461 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20461, term20461.getClass(), "httpRequest", null);
        setField(term20461, term20461.getClass(), "elements", term20462);
        setField(term20461, term20461.getClass(), "method", "");
        ArrayList term20429 = new ArrayList();
        ((ArrayList) term20429).add(term20431);
        ((ArrayList) term20429).add(term20436);
        ((ArrayList) term20429).add(term20441);
        ((ArrayList) term20429).add(term20446);
        ((ArrayList) term20429).add(term20451);
        ((ArrayList) term20429).add(term20456);
        ((ArrayList) term20429).add(term20461);
        ArrayList term20471 = new ArrayList();
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        ((ArrayList) term20471).add((Object)null);
        Object term20470 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20470, term20470.getClass(), "httpRequest", null);
        setField(term20470, term20470.getClass(), "elements", term20471);
        setField(term20470, term20470.getClass(), "method", "");
        Object term20475 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20475, term20475.getClass(), "httpRequest", null);
        setField(term20475, term20475.getClass(), "elements", null);
        setField(term20475, term20475.getClass(), "method", null);
        Object term20476 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term20476, term20476.getClass(), "httpRequest", null);
        setField(term20476, term20476.getClass(), "elements", null);
        setField(term20476, term20476.getClass(), "method", null);
        ArrayList term20468 = new ArrayList();
        ((ArrayList) term20468).add(term20470);
        ((ArrayList) term20468).add(term20475);
        ((ArrayList) term20468).add(term20476);
        term20428 = newInstance(Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse"));
        setField(term20428, term20428.getClass(), "successfulRequests", term20429);
        setField(term20428, term20428.getClass(), "failedRequests", term20468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.SinkHttpClientResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailedRequests", argTypes, term20428, args);
    }

};


