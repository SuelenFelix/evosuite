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
import java.util.LinkedList;

public class BatchRequestSubmitter_submit_19055020841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2188;
     Object term2312;

    public BatchRequestSubmitter_submit_19055020841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2188 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter"));
        Object[] term2191 = (Object[]) newArray("java.lang.String", 9);
        setIntField(term2188, term2188.getClass(), "httpRequestBatchSize", 1484323161);
        setField(term2188, term2188.getClass(), "publishingThreadPool", null);
        setIntField(term2188, term2188.getClass(), "httpRequestTimeOutSeconds", 391863371);
        setElement(term2191, 0, "HqBOwkVqjD");
        setElement(term2191, 1, "MAcUBcBckh");
        setElement(term2191, 2, "oVgzLbrsFr");
        setElement(term2191, 3, "vQVyKLdtaz");
        setElement(term2191, 4, "OWKQODBLzb");
        setElement(term2191, 5, "wGmYcqUkgE");
        setElement(term2191, 6, "idgaQsnJpQ");
        setElement(term2191, 7, "VgZnGoIFwQ");
        setElement(term2191, 8, "jUbSRrkrYZ");
        setField(term2188, term2188.getClass(), "headersAndValues", term2191);
        setField(term2188, term2188.getClass(), "httpClient", null);
        Object term2315 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term2328 = (byte[]) newByteArray(2);
        setField(term2315, term2315.getClass(), "method", "cAPeiZHKGJ");
        setByteElement(term2328, 0, (byte) -70);
        setByteElement(term2328, 1, (byte) -5);
        setField(term2315, term2315.getClass(), "element", term2328);
        term2312 = new LinkedList();
        ((LinkedList) term2312).add(term2315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "bWWfajKbEX";
        args[1] = term2312;
        callMethod(klass, "submit", argTypes, term2188, args);
    }

};


