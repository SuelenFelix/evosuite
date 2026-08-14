package com.pgssoft.httpclient.internal;

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
import static com.pgssoft.httpclient.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpResponseProxy_previousResponse_155281145512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8757;

    public HttpResponseProxy_previousResponse_155281145512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8757 = newInstance(Class.forName("com.pgssoft.httpclient.internal.HttpResponseProxy"));
        setIntField(term8757, term8757.getClass(), "statusCode", 0);
        setField(term8757, term8757.getClass(), "headers", null);
        setField(term8757, term8757.getClass(), "request", null);
        setField(term8757, term8757.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.HttpResponseProxy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "previousResponse", argTypes, term8757, args);
    }

};


