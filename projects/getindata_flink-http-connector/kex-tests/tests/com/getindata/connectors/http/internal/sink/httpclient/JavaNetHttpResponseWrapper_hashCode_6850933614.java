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

public class JavaNetHttpResponseWrapper_hashCode_6850933614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;

    public JavaNetHttpResponseWrapper_hashCode_6850933614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1707 = (byte[]) newByteArray(9);
        setByteElement(term1707, 0, (byte) 55);
        setByteElement(term1707, 1, (byte) -103);
        setByteElement(term1707, 2, (byte) -103);
        setByteElement(term1707, 3, (byte) -98);
        setByteElement(term1707, 4, (byte) -119);
        setByteElement(term1707, 5, (byte) 120);
        setByteElement(term1707, 6, (byte) -15);
        setByteElement(term1707, 7, (byte) 115);
        setByteElement(term1707, 8, (byte) 52);
        byte[] term1717 = (byte[]) newByteArray(7);
        setByteElement(term1717, 0, (byte) 96);
        setByteElement(term1717, 1, (byte) 40);
        setByteElement(term1717, 2, (byte) -5);
        setByteElement(term1717, 3, (byte) 24);
        setByteElement(term1717, 4, (byte) -39);
        setByteElement(term1717, 5, (byte) 30);
        setByteElement(term1717, 6, (byte) -119);
        byte[] term1725 = (byte[]) newByteArray(6);
        setByteElement(term1725, 0, (byte) 94);
        setByteElement(term1725, 1, (byte) -52);
        setByteElement(term1725, 2, (byte) -33);
        setByteElement(term1725, 3, (byte) 16);
        setByteElement(term1725, 4, (byte) 20);
        setByteElement(term1725, 5, (byte) -114);
        ArrayList term1705 = new ArrayList();
        ((ArrayList) term1705).add(term1707);
        ((ArrayList) term1705).add(term1717);
        ((ArrayList) term1705).add(term1725);
        term1703 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1704 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1704, term1704.getClass(), "httpRequest", null);
        setField(term1704, term1704.getClass(), "elements", term1705);
        setField(term1704, term1704.getClass(), "method", "nHXjMycHlU");
        setField(term1703, term1703.getClass(), "httpRequest", term1704);
        setField(term1703, term1703.getClass(), "response", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1703, args);
    }

};


