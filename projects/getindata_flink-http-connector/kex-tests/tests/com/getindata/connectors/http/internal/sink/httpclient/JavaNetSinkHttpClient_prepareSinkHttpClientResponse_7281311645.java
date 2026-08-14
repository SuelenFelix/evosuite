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
import java.util.ArrayList;

public class JavaNetSinkHttpClient_prepareSinkHttpClientResponse_7281311645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1069;
     Object term1199;

    public JavaNetSinkHttpClient_prepareSinkHttpClientResponse_7281311645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1179 = new HashMap();
        term1069 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient"));
        Object[] term1070 = (Object[]) newArray("java.lang.String", 9);
        Object term1189 = newInstance(Class.forName("java.util.Properties"));
        Object term1190 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setElement(term1070, 0, "Ghbwtircqb");
        setElement(term1070, 1, "xrwlQZdwCp");
        setElement(term1070, 2, "IDCWpPLRkE");
        setElement(term1070, 3, "nyiiPDVjAc");
        setElement(term1070, 4, "aKnKipADSo");
        setElement(term1070, 5, "wSQxaModmm");
        setElement(term1070, 6, "UlajhuVLaP");
        setElement(term1070, 7, "gGSMzuGICf");
        setElement(term1070, 8, "hxCBltsObl");
        setField(term1069, term1069.getClass(), "headersAndValues", term1070);
        setField(term1069, term1069.getClass(), "headerMap", term1179);
        setField(term1069, term1069.getClass(), "statusCodeChecker", null);
        setField(term1069, term1069.getClass(), "httpPostRequestCallback", null);
        setField(term1069, term1069.getClass(), "requestSubmitter", null);
        setField(term1189, term1189.getClass(), "defaults", null);
        setField(term1190, term1190.getClass(), "table", null);
        setField(term1190, term1190.getClass(), "nextTable", null);
        setLongField(term1190, term1190.getClass(), "baseCount", 0L);
        setIntField(term1190, term1190.getClass(), "sizeCtl", 16);
        setIntField(term1190, term1190.getClass(), "transferIndex", 0);
        setIntField(term1190, term1190.getClass(), "cellsBusy", 0);
        setField(term1190, term1190.getClass(), "counterCells", null);
        setField(term1190, term1190.getClass(), "keySet", null);
        setField(term1190, term1190.getClass(), "values", null);
        setField(term1190, term1190.getClass(), "entrySet", null);
        setField(term1190, term1190.getClass(), "keySet", null);
        setField(term1190, term1190.getClass(), "values", null);
        setField(term1189, term1189.getClass(), "map", term1190);
        setField(term1189, term1189.getClass(), "table", null);
        setIntField(term1189, term1189.getClass(), "count", 0);
        setIntField(term1189, term1189.getClass(), "threshold", 0);
        setFloatField(term1189, term1189.getClass(), "loadFactor", 0.0F);
        setIntField(term1189, term1189.getClass(), "modCount", 0);
        setField(term1189, term1189.getClass(), "keySet", null);
        setField(term1189, term1189.getClass(), "entrySet", null);
        setField(term1189, term1189.getClass(), "values", null);
        setField(term1069, term1069.getClass(), "properties", term1189);
        ArrayList term1204 = new ArrayList();
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        ((ArrayList) term1204).add((Object)null);
        Object term1202 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1203 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1203, term1203.getClass(), "httpRequest", null);
        setField(term1203, term1203.getClass(), "elements", term1204);
        setField(term1203, term1203.getClass(), "method", "");
        setField(term1202, term1202.getClass(), "httpRequest", term1203);
        setField(term1202, term1202.getClass(), "response", null);
        Object term1209 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1210 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1210, term1210.getClass(), "httpRequest", null);
        setField(term1210, term1210.getClass(), "elements", null);
        setField(term1210, term1210.getClass(), "method", null);
        setField(term1209, term1209.getClass(), "httpRequest", term1210);
        setField(term1209, term1209.getClass(), "response", null);
        term1199 = new LinkedList();
        ((LinkedList) term1199).add(term1202);
        ((LinkedList) term1199).add(term1209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetSinkHttpClient");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1199;
        args[1] = "xLbjWUgOIL";
        callMethod(klass, "prepareSinkHttpClientResponse", argTypes, term1069, args);
    }

};


