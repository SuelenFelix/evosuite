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

public class HttpRequest_equals_12604378864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term297;

    public HttpRequest_equals_12604378864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term274 = (byte[]) newByteArray(3);
        setByteElement(term274, 0, (byte) -20);
        setByteElement(term274, 1, (byte) 10);
        setByteElement(term274, 2, (byte) 77);
        byte[] term278 = (byte[]) newByteArray(4);
        setByteElement(term278, 0, (byte) 14);
        setByteElement(term278, 1, (byte) -101);
        setByteElement(term278, 2, (byte) 35);
        setByteElement(term278, 3, (byte) 66);
        ArrayList term272 = new ArrayList();
        ((ArrayList) term272).add(term274);
        ((ArrayList) term272).add(term278);
        term271 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term271, term271.getClass(), "httpRequest", null);
        setField(term271, term271.getClass(), "elements", term272);
        setField(term271, term271.getClass(), "method", "jJCZpVmanW");
        term297 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term297;
        callMethod(klass, "equals", argTypes, term271, args);
    }

};


