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

public class BatchRequestSubmitter_sendBatch_18247034093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2558;
     Object term2622;

    public BatchRequestSubmitter_sendBatch_18247034093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2558 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter"));
        Object[] term2561 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term2558, term2558.getClass(), "httpRequestBatchSize", -1955890973);
        setField(term2558, term2558.getClass(), "publishingThreadPool", null);
        setIntField(term2558, term2558.getClass(), "httpRequestTimeOutSeconds", -2038273078);
        setElement(term2561, 0, "swZVeJAxjt");
        setElement(term2561, 1, "xOcJIiQQDu");
        setElement(term2561, 2, "GVizqqzXpy");
        setElement(term2561, 3, "JqXGgAhZPl");
        setField(term2558, term2558.getClass(), "headersAndValues", term2561);
        setField(term2558, term2558.getClass(), "httpClient", null);
        Object term2625 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term2638 = (byte[]) newByteArray(7);
        setField(term2625, term2625.getClass(), "method", "DfISiziTgG");
        setByteElement(term2638, 0, (byte) 119);
        setByteElement(term2638, 1, (byte) 81);
        setByteElement(term2638, 2, (byte) -28);
        setByteElement(term2638, 3, (byte) -18);
        setByteElement(term2638, 4, (byte) -61);
        setByteElement(term2638, 5, (byte) 70);
        setByteElement(term2638, 6, (byte) 89);
        setField(term2625, term2625.getClass(), "element", term2638);
        term2622 = new LinkedList();
        ((LinkedList) term2622).add(term2625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "jiKYgYHqIS";
        args[1] = term2622;
        callMethod(klass, "sendBatch", argTypes, term2558, args);
    }

};


