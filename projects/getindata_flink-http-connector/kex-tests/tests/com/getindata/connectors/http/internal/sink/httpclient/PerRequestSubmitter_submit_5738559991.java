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

public class PerRequestSubmitter_submit_5738559991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;
     Object term2954;

    public PerRequestSubmitter_submit_5738559991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2939 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter"));
        Object[] term2941 = (Object[]) newArray("java.lang.String", 0);
        setField(term2939, term2939.getClass(), "publishingThreadPool", null);
        setIntField(term2939, term2939.getClass(), "httpRequestTimeOutSeconds", 1725571209);
        setField(term2939, term2939.getClass(), "headersAndValues", term2941);
        setField(term2939, term2939.getClass(), "httpClient", null);
        term2954 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "XPKmummaqg";
        args[1] = term2954;
        callMethod(klass, "submit", argTypes, term2939, args);
    }

};


