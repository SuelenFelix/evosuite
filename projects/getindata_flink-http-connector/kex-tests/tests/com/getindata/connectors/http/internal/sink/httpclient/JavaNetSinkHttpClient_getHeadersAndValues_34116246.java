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

public class JavaNetSinkHttpClient_getHeadersAndValues_34116246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324;

    public JavaNetSinkHttpClient_getHeadersAndValues_34116246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1374 = new HashMap();
        term1324 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term1325 = (Object[]) newArray("java.lang.String", 4);
        Object term1384 = newInstance(Class.forName("java.util.Properties"));
        Object term1385 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term1325, 0, "jDtqGUpnZN");
        setElement(term1325, 1, "nGKItKLYNC");
        setElement(term1325, 2, "UiUYnPrcCi");
        setElement(term1325, 3, "UoYtihxVaS");
        setField(term1324, term1324.getClass(), "headersAndValues", term1325);
        setField(term1324, term1324.getClass(), "headerMap", term1374);
        setField(term1324, term1324.getClass(), "statusCodeChecker", null);
        setField(term1324, term1324.getClass(), "httpPostRequestCallback", null);
        setField(term1324, term1324.getClass(), "requestSubmitter", null);
        setField(term1384, term1384.getClass(), "defaults", null);
        setField(term1385, term1385.getClass(), "table", null);
        setField(term1385, term1385.getClass(), "nextTable", null);
        setLongField(term1385, term1385.getClass(), "baseCount", 0L);
        setIntField(term1385, term1385.getClass(), "sizeCtl", 16);
        setIntField(term1385, term1385.getClass(), "transferIndex", 0);
        setIntField(term1385, term1385.getClass(), "cellsBusy", 0);
        setField(term1385, term1385.getClass(), "counterCells", null);
        setField(term1385, term1385.getClass(), "keySet", null);
        setField(term1385, term1385.getClass(), "values", null);
        setField(term1385, term1385.getClass(), "entrySet", null);
        setField(term1385, term1385.getClass(), "keySet", null);
        setField(term1385, term1385.getClass(), "values", null);
        setField(term1384, term1384.getClass(), "map", term1385);
        setField(term1384, term1384.getClass(), "table", null);
        setIntField(term1384, term1384.getClass(), "count", 0);
        setIntField(term1384, term1384.getClass(), "threshold", 0);
        setFloatField(term1384, term1384.getClass(), "loadFactor", 0.0F);
        setIntField(term1384, term1384.getClass(), "modCount", 0);
        setField(term1384, term1384.getClass(), "keySet", null);
        setField(term1384, term1384.getClass(), "entrySet", null);
        setField(term1384, term1384.getClass(), "values", null);
        setField(term1324, term1324.getClass(), "properties", term1384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadersAndValues", argTypes, term1324, args);
    }

};


