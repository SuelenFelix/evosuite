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

public class HttpRequest_hashCode_17091245616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public HttpRequest_hashCode_17091245616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term419 = (byte[]) newByteArray(0);
        byte[] term420 = (byte[]) newByteArray(0);
        byte[] term421 = (byte[]) newByteArray(1);
        setByteElement(term421, 0, (byte) -17);
        byte[] term423 = (byte[]) newByteArray(5);
        setByteElement(term423, 0, (byte) -83);
        setByteElement(term423, 1, (byte) 48);
        setByteElement(term423, 2, (byte) -128);
        setByteElement(term423, 3, (byte) 70);
        setByteElement(term423, 4, (byte) -28);
        byte[] term429 = (byte[]) newByteArray(4);
        setByteElement(term429, 0, (byte) 115);
        setByteElement(term429, 1, (byte) 96);
        setByteElement(term429, 2, (byte) 51);
        setByteElement(term429, 3, (byte) -53);
        byte[] term434 = (byte[]) newByteArray(4);
        setByteElement(term434, 0, (byte) -8);
        setByteElement(term434, 1, (byte) -9);
        setByteElement(term434, 2, (byte) 97);
        setByteElement(term434, 3, (byte) -46);
        byte[] term439 = (byte[]) newByteArray(0);
        byte[] term440 = (byte[]) newByteArray(7);
        setByteElement(term440, 0, (byte) 14);
        setByteElement(term440, 1, (byte) 34);
        setByteElement(term440, 2, (byte) 126);
        setByteElement(term440, 3, (byte) 7);
        setByteElement(term440, 4, (byte) -96);
        setByteElement(term440, 5, (byte) -22);
        setByteElement(term440, 6, (byte) -5);
        ArrayList term417 = new ArrayList();
        ((ArrayList) term417).add(term419);
        ((ArrayList) term417).add(term420);
        ((ArrayList) term417).add(term421);
        ((ArrayList) term417).add(term423);
        ((ArrayList) term417).add(term429);
        ((ArrayList) term417).add(term434);
        ((ArrayList) term417).add(term439);
        ((ArrayList) term417).add(term440);
        term416 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term416, term416.getClass(), "httpRequest", null);
        setField(term416, term416.getClass(), "elements", term417);
        setField(term416, term416.getClass(), "method", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term416, args);
    }

};


