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

public class HttpRequest_getMethod_19348325923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;

    public HttpRequest_getMethod_19348325923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term244 = (byte[]) newByteArray(1);
        setByteElement(term244, 0, (byte) -39);
        ArrayList term242 = new ArrayList();
        ((ArrayList) term242).add(term244);
        term241 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term241, term241.getClass(), "httpRequest", null);
        setField(term241, term241.getClass(), "elements", term242);
        setField(term241, term241.getClass(), "method", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term241, args);
    }

};


