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

public class JavaNetSinkHttpClient_submitRequests_2256304644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;
     Object term1024;

    public JavaNetSinkHttpClient_submitRequests_2256304644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1004 = new HashMap();
        term978 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term979 = (Object[]) newArray("java.lang.String", 2);
        Object term1014 = newInstance(Class.forName("java.util.Properties"));
        Object term1015 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term979, 0, "OWDIEULEFu");
        setElement(term979, 1, "dWRymuLBtr");
        setField(term978, term978.getClass(), "headersAndValues", term979);
        setField(term978, term978.getClass(), "headerMap", term1004);
        setField(term978, term978.getClass(), "statusCodeChecker", null);
        setField(term978, term978.getClass(), "httpPostRequestCallback", null);
        setField(term978, term978.getClass(), "requestSubmitter", null);
        setField(term1014, term1014.getClass(), "defaults", null);
        setField(term1015, term1015.getClass(), "table", null);
        setField(term1015, term1015.getClass(), "nextTable", null);
        setLongField(term1015, term1015.getClass(), "baseCount", 0L);
        setIntField(term1015, term1015.getClass(), "sizeCtl", 16);
        setIntField(term1015, term1015.getClass(), "transferIndex", 0);
        setIntField(term1015, term1015.getClass(), "cellsBusy", 0);
        setField(term1015, term1015.getClass(), "counterCells", null);
        setField(term1015, term1015.getClass(), "keySet", null);
        setField(term1015, term1015.getClass(), "values", null);
        setField(term1015, term1015.getClass(), "entrySet", null);
        setField(term1015, term1015.getClass(), "keySet", null);
        setField(term1015, term1015.getClass(), "values", null);
        setField(term1014, term1014.getClass(), "map", term1015);
        setField(term1014, term1014.getClass(), "table", null);
        setIntField(term1014, term1014.getClass(), "count", 0);
        setIntField(term1014, term1014.getClass(), "threshold", 0);
        setFloatField(term1014, term1014.getClass(), "loadFactor", 0.0F);
        setIntField(term1014, term1014.getClass(), "modCount", 0);
        setField(term1014, term1014.getClass(), "keySet", null);
        setField(term1014, term1014.getClass(), "entrySet", null);
        setField(term1014, term1014.getClass(), "values", null);
        setField(term978, term978.getClass(), "properties", term1014);
        term1024 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1024;
        args[1] = "kuTXqwMtDB";
        callMethod(klass, "submitRequests", argTypes, term978, args);
    }

};


