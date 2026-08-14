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
import java.util.LinkedList;
import java.lang.Object;

public class HttpRequest_init_7186187740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public HttpRequest_init_7186187740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term4 = (byte[]) newByteArray(9);
        setByteElement(term4, 0, (byte) 47);
        setByteElement(term4, 1, (byte) 48);
        setByteElement(term4, 2, (byte) 89);
        setByteElement(term4, 3, (byte) 75);
        setByteElement(term4, 4, (byte) 18);
        setByteElement(term4, 5, (byte) -58);
        setByteElement(term4, 6, (byte) -29);
        setByteElement(term4, 7, (byte) -54);
        setByteElement(term4, 8, (byte) -10);
        byte[] term15 = (byte[]) newByteArray(0);
        byte[] term17 = (byte[]) newByteArray(4);
        setByteElement(term17, 0, (byte) 79);
        setByteElement(term17, 1, (byte) -119);
        setByteElement(term17, 2, (byte) -66);
        setByteElement(term17, 3, (byte) 83);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term15);
        ((LinkedList) term1).add(term17);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


