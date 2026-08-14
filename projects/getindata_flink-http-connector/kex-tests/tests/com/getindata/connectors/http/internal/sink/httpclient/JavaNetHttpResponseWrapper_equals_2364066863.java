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

public class JavaNetHttpResponseWrapper_equals_2364066863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660;
     Object term1686;

    public JavaNetHttpResponseWrapper_equals_2364066863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1664 = (byte[]) newByteArray(1);
        setByteElement(term1664, 0, (byte) -124);
        byte[] term1666 = (byte[]) newByteArray(5);
        setByteElement(term1666, 0, (byte) -72);
        setByteElement(term1666, 1, (byte) 90);
        setByteElement(term1666, 2, (byte) -34);
        setByteElement(term1666, 3, (byte) -2);
        setByteElement(term1666, 4, (byte) 96);
        ArrayList term1662 = new ArrayList();
        ((ArrayList) term1662).add(term1664);
        ((ArrayList) term1662).add(term1666);
        term1660 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1661 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1661, term1661.getClass(), "httpRequest", null);
        setField(term1661, term1661.getClass(), "elements", term1662);
        setField(term1661, term1661.getClass(), "method", "ytSBIKXogI");
        setField(term1660, term1660.getClass(), "httpRequest", term1661);
        setField(term1660, term1660.getClass(), "response", null);
        term1686 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1686;
        callMethod(klass, "equals", argTypes, term1660, args);
    }

};


