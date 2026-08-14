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

public class HttpRequest_getElements_17632632652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public HttpRequest_getElements_17632632652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term162 = (byte[]) newByteArray(1);
        setByteElement(term162, 0, (byte) -123);
        byte[] term164 = (byte[]) newByteArray(5);
        setByteElement(term164, 0, (byte) -23);
        setByteElement(term164, 1, (byte) 100);
        setByteElement(term164, 2, (byte) 106);
        setByteElement(term164, 3, (byte) -57);
        setByteElement(term164, 4, (byte) -103);
        byte[] term170 = (byte[]) newByteArray(5);
        setByteElement(term170, 0, (byte) 98);
        setByteElement(term170, 1, (byte) 79);
        setByteElement(term170, 2, (byte) 61);
        setByteElement(term170, 3, (byte) -92);
        setByteElement(term170, 4, (byte) -42);
        byte[] term176 = (byte[]) newByteArray(4);
        setByteElement(term176, 0, (byte) 116);
        setByteElement(term176, 1, (byte) -81);
        setByteElement(term176, 2, (byte) 102);
        setByteElement(term176, 3, (byte) -118);
        byte[] term181 = (byte[]) newByteArray(1);
        setByteElement(term181, 0, (byte) -126);
        byte[] term183 = (byte[]) newByteArray(2);
        setByteElement(term183, 0, (byte) -91);
        setByteElement(term183, 1, (byte) -104);
        byte[] term186 = (byte[]) newByteArray(6);
        setByteElement(term186, 0, (byte) -89);
        setByteElement(term186, 1, (byte) 13);
        setByteElement(term186, 2, (byte) 44);
        setByteElement(term186, 3, (byte) -63);
        setByteElement(term186, 4, (byte) 15);
        setByteElement(term186, 5, (byte) 45);
        ArrayList term160 = new ArrayList();
        ((ArrayList) term160).add(term162);
        ((ArrayList) term160).add(term164);
        ((ArrayList) term160).add(term170);
        ((ArrayList) term160).add(term176);
        ((ArrayList) term160).add(term181);
        ((ArrayList) term160).add(term183);
        ((ArrayList) term160).add(term186);
        term159 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term159, term159.getClass(), "httpRequest", null);
        setField(term159, term159.getClass(), "elements", term160);
        setField(term159, term159.getClass(), "method", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getElements", argTypes, term159, args);
    }

};


