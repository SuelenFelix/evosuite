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

public class HttpRequest_getHttpRequest_8848946921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public HttpRequest_getHttpRequest_8848946921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term64 = (byte[]) newByteArray(0);
        byte[] term65 = (byte[]) newByteArray(9);
        setByteElement(term65, 0, (byte) 78);
        setByteElement(term65, 1, (byte) 87);
        setByteElement(term65, 2, (byte) 121);
        setByteElement(term65, 3, (byte) -99);
        setByteElement(term65, 4, (byte) -2);
        setByteElement(term65, 5, (byte) -16);
        setByteElement(term65, 6, (byte) -112);
        setByteElement(term65, 7, (byte) -111);
        setByteElement(term65, 8, (byte) 23);
        byte[] term75 = (byte[]) newByteArray(9);
        setByteElement(term75, 0, (byte) -15);
        setByteElement(term75, 1, (byte) 36);
        setByteElement(term75, 2, (byte) 118);
        setByteElement(term75, 3, (byte) 106);
        setByteElement(term75, 4, (byte) 98);
        setByteElement(term75, 5, (byte) 67);
        setByteElement(term75, 6, (byte) 66);
        setByteElement(term75, 7, (byte) -121);
        setByteElement(term75, 8, (byte) -119);
        byte[] term85 = (byte[]) newByteArray(3);
        setByteElement(term85, 0, (byte) 71);
        setByteElement(term85, 1, (byte) 80);
        setByteElement(term85, 2, (byte) 42);
        byte[] term89 = (byte[]) newByteArray(7);
        setByteElement(term89, 0, (byte) 72);
        setByteElement(term89, 1, (byte) 111);
        setByteElement(term89, 2, (byte) 99);
        setByteElement(term89, 3, (byte) -12);
        setByteElement(term89, 4, (byte) -61);
        setByteElement(term89, 5, (byte) -85);
        setByteElement(term89, 6, (byte) -22);
        byte[] term97 = (byte[]) newByteArray(0);
        byte[] term98 = (byte[]) newByteArray(1);
        setByteElement(term98, 0, (byte) 93);
        byte[] term100 = (byte[]) newByteArray(0);
        byte[] term101 = (byte[]) newByteArray(2);
        setByteElement(term101, 0, (byte) 69);
        setByteElement(term101, 1, (byte) -74);
        ArrayList term62 = new ArrayList();
        ((ArrayList) term62).add(term64);
        ((ArrayList) term62).add(term65);
        ((ArrayList) term62).add(term75);
        ((ArrayList) term62).add(term85);
        ((ArrayList) term62).add(term89);
        ((ArrayList) term62).add(term97);
        ((ArrayList) term62).add(term98);
        ((ArrayList) term62).add(term100);
        ((ArrayList) term62).add(term101);
        term61 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term61, term61.getClass(), "httpRequest", null);
        setField(term61, term61.getClass(), "elements", term62);
        setField(term61, term61.getClass(), "method", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpRequest", argTypes, term61, args);
    }

};


