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
import java.util.ArrayList;

public class HttpRequest_toString_20750830457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;

    public HttpRequest_toString_20750830457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term496 = (byte[]) newByteArray(1);
        setByteElement(term496, 0, (byte) -124);
        byte[] term498 = (byte[]) newByteArray(6);
        setByteElement(term498, 0, (byte) -105);
        setByteElement(term498, 1, (byte) 25);
        setByteElement(term498, 2, (byte) 16);
        setByteElement(term498, 3, (byte) 39);
        setByteElement(term498, 4, (byte) 123);
        setByteElement(term498, 5, (byte) 16);
        ArrayList term494 = new ArrayList();
        ((ArrayList) term494).add(term496);
        ((ArrayList) term494).add(term498);
        term493 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term493, term493.getClass(), "httpRequest", null);
        setField(term493, term493.getClass(), "elements", term494);
        setField(term493, term493.getClass(), "method", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term493, args);
    }

};


