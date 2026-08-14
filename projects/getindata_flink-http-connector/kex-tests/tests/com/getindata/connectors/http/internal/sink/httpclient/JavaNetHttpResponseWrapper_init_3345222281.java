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

public class JavaNetHttpResponseWrapper_init_3345222281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1471;

    public JavaNetHttpResponseWrapper_init_3345222281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1474 = (byte[]) newByteArray(7);
        setByteElement(term1474, 0, (byte) 9);
        setByteElement(term1474, 1, (byte) 19);
        setByteElement(term1474, 2, (byte) -103);
        setByteElement(term1474, 3, (byte) 61);
        setByteElement(term1474, 4, (byte) -90);
        setByteElement(term1474, 5, (byte) -27);
        setByteElement(term1474, 6, (byte) 119);
        byte[] term1482 = (byte[]) newByteArray(0);
        byte[] term1483 = (byte[]) newByteArray(7);
        setByteElement(term1483, 0, (byte) -125);
        setByteElement(term1483, 1, (byte) 100);
        setByteElement(term1483, 2, (byte) -1);
        setByteElement(term1483, 3, (byte) -127);
        setByteElement(term1483, 4, (byte) -118);
        setByteElement(term1483, 5, (byte) 69);
        setByteElement(term1483, 6, (byte) 112);
        byte[] term1491 = (byte[]) newByteArray(1);
        setByteElement(term1491, 0, (byte) 77);
        byte[] term1493 = (byte[]) newByteArray(6);
        setByteElement(term1493, 0, (byte) -1);
        setByteElement(term1493, 1, (byte) -83);
        setByteElement(term1493, 2, (byte) -63);
        setByteElement(term1493, 3, (byte) 108);
        setByteElement(term1493, 4, (byte) -105);
        setByteElement(term1493, 5, (byte) 33);
        byte[] term1500 = (byte[]) newByteArray(4);
        setByteElement(term1500, 0, (byte) 109);
        setByteElement(term1500, 1, (byte) -54);
        setByteElement(term1500, 2, (byte) -85);
        setByteElement(term1500, 3, (byte) 81);
        ArrayList term1472 = new ArrayList();
        ((ArrayList) term1472).add(term1474);
        ((ArrayList) term1472).add(term1482);
        ((ArrayList) term1472).add(term1483);
        ((ArrayList) term1472).add(term1491);
        ((ArrayList) term1472).add(term1493);
        ((ArrayList) term1472).add(term1500);
        term1471 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1471, term1471.getClass(), "httpRequest", null);
        setField(term1471, term1471.getClass(), "elements", term1472);
        setField(term1471, term1471.getClass(), "method", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        argTypes[1] = Class.forName("java.net.http.HttpResponse");
        Object[] args = new Object[2];
        args[0] = term1471;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


