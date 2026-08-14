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

public class BatchRequestSubmitter_getBatchSize_7535385162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2444;

    public BatchRequestSubmitter_getBatchSize_7535385162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2444 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter"));
        Object[] term2447 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term2444, term2444.getClass(), "httpRequestBatchSize", -1922583790);
        setField(term2444, term2444.getClass(), "publishingThreadPool", null);
        setIntField(term2444, term2444.getClass(), "httpRequestTimeOutSeconds", -616727354);
        setElement(term2447, 0, "LvJFtLBaxj");
        setElement(term2447, 1, "PHvxnGHptP");
        setElement(term2447, 2, "TimdotUuNC");
        setElement(term2447, 3, "PkWMRdJcBb");
        setElement(term2447, 4, "jSpAteRute");
        setField(term2444, term2444.getClass(), "headersAndValues", term2447);
        setField(term2444, term2444.getClass(), "httpClient", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBatchSize", argTypes, term2444, args);
    }

};


