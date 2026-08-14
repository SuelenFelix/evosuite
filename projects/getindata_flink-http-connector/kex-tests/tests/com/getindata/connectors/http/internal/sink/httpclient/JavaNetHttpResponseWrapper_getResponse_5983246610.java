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
import java.util.ArrayList;

public class JavaNetHttpResponseWrapper_getResponse_5983246610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440;

    public JavaNetHttpResponseWrapper_getResponse_5983246610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1444 = (byte[]) newByteArray(1);
        setByteElement(term1444, 0, (byte) -54);
        ArrayList term1442 = new ArrayList();
        ((ArrayList) term1442).add(term1444);
        term1440 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1441 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1441, term1441.getClass(), "httpRequest", null);
        setField(term1441, term1441.getClass(), "elements", term1442);
        setField(term1441, term1441.getClass(), "method", "YRHGsAkhxb");
        setField(term1440, term1440.getClass(), "httpRequest", term1441);
        setField(term1440, term1440.getClass(), "response", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponse", argTypes, term1440, args);
    }

};


