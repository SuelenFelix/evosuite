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

public class JavaNetHttpResponseWrapper_getHttpRequest_4137423842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1554;

    public JavaNetHttpResponseWrapper_getHttpRequest_4137423842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1558 = (byte[]) newByteArray(7);
        setByteElement(term1558, 0, (byte) -113);
        setByteElement(term1558, 1, (byte) 90);
        setByteElement(term1558, 2, (byte) 10);
        setByteElement(term1558, 3, (byte) 87);
        setByteElement(term1558, 4, (byte) -35);
        setByteElement(term1558, 5, (byte) -14);
        setByteElement(term1558, 6, (byte) 10);
        byte[] term1566 = (byte[]) newByteArray(0);
        byte[] term1567 = (byte[]) newByteArray(9);
        setByteElement(term1567, 0, (byte) 65);
        setByteElement(term1567, 1, (byte) -44);
        setByteElement(term1567, 2, (byte) 115);
        setByteElement(term1567, 3, (byte) -32);
        setByteElement(term1567, 4, (byte) -52);
        setByteElement(term1567, 5, (byte) 53);
        setByteElement(term1567, 6, (byte) 44);
        setByteElement(term1567, 7, (byte) 49);
        setByteElement(term1567, 8, (byte) 114);
        byte[] term1577 = (byte[]) newByteArray(6);
        setByteElement(term1577, 0, (byte) -81);
        setByteElement(term1577, 1, (byte) 127);
        setByteElement(term1577, 2, (byte) -24);
        setByteElement(term1577, 3, (byte) -89);
        setByteElement(term1577, 4, (byte) -35);
        setByteElement(term1577, 5, (byte) -59);
        byte[] term1584 = (byte[]) newByteArray(8);
        setByteElement(term1584, 0, (byte) 73);
        setByteElement(term1584, 1, (byte) 94);
        setByteElement(term1584, 2, (byte) 114);
        setByteElement(term1584, 3, (byte) 110);
        setByteElement(term1584, 4, (byte) 70);
        setByteElement(term1584, 5, (byte) -46);
        setByteElement(term1584, 6, (byte) -78);
        setByteElement(term1584, 7, (byte) 109);
        byte[] term1593 = (byte[]) newByteArray(6);
        setByteElement(term1593, 0, (byte) 17);
        setByteElement(term1593, 1, (byte) -126);
        setByteElement(term1593, 2, (byte) 35);
        setByteElement(term1593, 3, (byte) -46);
        setByteElement(term1593, 4, (byte) -14);
        setByteElement(term1593, 5, (byte) 124);
        ArrayList term1556 = new ArrayList();
        ((ArrayList) term1556).add(term1558);
        ((ArrayList) term1556).add(term1566);
        ((ArrayList) term1556).add(term1567);
        ((ArrayList) term1556).add(term1577);
        ((ArrayList) term1556).add(term1584);
        ((ArrayList) term1556).add(term1593);
        term1554 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1555 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1555, term1555.getClass(), "httpRequest", null);
        setField(term1555, term1555.getClass(), "elements", term1556);
        setField(term1555, term1555.getClass(), "method", "MLqYREekMl");
        setField(term1554, term1554.getClass(), "httpRequest", term1555);
        setField(term1554, term1554.getClass(), "response", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpRequest", argTypes, term1554, args);
    }

};


