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
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class JavaNetSinkHttpClient_putRequests_14865047593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;
     Object term943;

    public JavaNetSinkHttpClient_putRequests_14865047593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term923 = new HashMap();
        term909 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term910 = (Object[]) newArray("java.lang.String", 1);
        Object term933 = newInstance(Class.forName("java.util.Properties"));
        Object term934 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term910, 0, "flxyYxBRtu");
        setField(term909, term909.getClass(), "headersAndValues", term910);
        setField(term909, term909.getClass(), "headerMap", term923);
        setField(term909, term909.getClass(), "statusCodeChecker", null);
        setField(term909, term909.getClass(), "httpPostRequestCallback", null);
        setField(term909, term909.getClass(), "requestSubmitter", null);
        setField(term933, term933.getClass(), "defaults", null);
        setField(term934, term934.getClass(), "table", null);
        setField(term934, term934.getClass(), "nextTable", null);
        setLongField(term934, term934.getClass(), "baseCount", 0L);
        setIntField(term934, term934.getClass(), "sizeCtl", 16);
        setIntField(term934, term934.getClass(), "transferIndex", 0);
        setIntField(term934, term934.getClass(), "cellsBusy", 0);
        setField(term934, term934.getClass(), "counterCells", null);
        setField(term934, term934.getClass(), "keySet", null);
        setField(term934, term934.getClass(), "values", null);
        setField(term934, term934.getClass(), "entrySet", null);
        setField(term934, term934.getClass(), "keySet", null);
        setField(term934, term934.getClass(), "values", null);
        setField(term933, term933.getClass(), "map", term934);
        setField(term933, term933.getClass(), "table", null);
        setIntField(term933, term933.getClass(), "count", 0);
        setIntField(term933, term933.getClass(), "threshold", 0);
        setFloatField(term933, term933.getClass(), "loadFactor", 0.0F);
        setIntField(term933, term933.getClass(), "modCount", 0);
        setField(term933, term933.getClass(), "keySet", null);
        setField(term933, term933.getClass(), "entrySet", null);
        setField(term933, term933.getClass(), "values", null);
        setField(term909, term909.getClass(), "properties", term933);
        term943 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term943;
        args[1] = "TEParAifyi";
        callMethod(klass, "putRequests", argTypes, term909, args);
    }

};


