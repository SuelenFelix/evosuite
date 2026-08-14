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

public class BatchRequestSubmitter_sendBatch_18247034098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2868;

    public BatchRequestSubmitter_sendBatch_18247034098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2868 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter"));
        setIntField(term2868, term2868.getClass(), "httpRequestBatchSize", 0);
        setField(term2868, term2868.getClass(), "publishingThreadPool", null);
        setIntField(term2868, term2868.getClass(), "httpRequestTimeOutSeconds", 0);
        setField(term2868, term2868.getClass(), "headersAndValues", null);
        setField(term2868, term2868.getClass(), "httpClient", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "sendBatch", argTypes, term2868, args);
    }

};


