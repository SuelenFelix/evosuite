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

public class HttpRequest_canEqual_4562752575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;
     Object term373;

    public HttpRequest_canEqual_4562752575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term318 = (byte[]) newByteArray(4);
        setByteElement(term318, 0, (byte) 123);
        setByteElement(term318, 1, (byte) -5);
        setByteElement(term318, 2, (byte) 84);
        setByteElement(term318, 3, (byte) -97);
        byte[] term323 = (byte[]) newByteArray(7);
        setByteElement(term323, 0, (byte) -24);
        setByteElement(term323, 1, (byte) 88);
        setByteElement(term323, 2, (byte) 96);
        setByteElement(term323, 3, (byte) 70);
        setByteElement(term323, 4, (byte) 48);
        setByteElement(term323, 5, (byte) -46);
        setByteElement(term323, 6, (byte) -128);
        byte[] term331 = (byte[]) newByteArray(1);
        setByteElement(term331, 0, (byte) 66);
        byte[] term333 = (byte[]) newByteArray(8);
        setByteElement(term333, 0, (byte) -112);
        setByteElement(term333, 1, (byte) 81);
        setByteElement(term333, 2, (byte) 65);
        setByteElement(term333, 3, (byte) -44);
        setByteElement(term333, 4, (byte) 33);
        setByteElement(term333, 5, (byte) -74);
        setByteElement(term333, 6, (byte) -84);
        setByteElement(term333, 7, (byte) -53);
        byte[] term342 = (byte[]) newByteArray(7);
        setByteElement(term342, 0, (byte) -93);
        setByteElement(term342, 1, (byte) 82);
        setByteElement(term342, 2, (byte) -89);
        setByteElement(term342, 3, (byte) 24);
        setByteElement(term342, 4, (byte) 123);
        setByteElement(term342, 5, (byte) -101);
        setByteElement(term342, 6, (byte) -102);
        byte[] term350 = (byte[]) newByteArray(2);
        setByteElement(term350, 0, (byte) -95);
        setByteElement(term350, 1, (byte) -2);
        byte[] term353 = (byte[]) newByteArray(2);
        setByteElement(term353, 0, (byte) 28);
        setByteElement(term353, 1, (byte) 84);
        byte[] term356 = (byte[]) newByteArray(1);
        setByteElement(term356, 0, (byte) 85);
        byte[] term358 = (byte[]) newByteArray(0);
        ArrayList term316 = new ArrayList();
        ((ArrayList) term316).add(term318);
        ((ArrayList) term316).add(term323);
        ((ArrayList) term316).add(term331);
        ((ArrayList) term316).add(term333);
        ((ArrayList) term316).add(term342);
        ((ArrayList) term316).add(term350);
        ((ArrayList) term316).add(term353);
        ((ArrayList) term316).add(term356);
        ((ArrayList) term316).add(term358);
        term315 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term315, term315.getClass(), "httpRequest", null);
        setField(term315, term315.getClass(), "elements", term316);
        setField(term315, term315.getClass(), "method", "EGtDIRbSSb");
        term373 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term373;
        callMethod(klass, "canEqual", argTypes, term315, args);
    }

};


