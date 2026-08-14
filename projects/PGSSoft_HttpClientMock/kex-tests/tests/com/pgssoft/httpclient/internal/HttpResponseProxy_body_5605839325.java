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

public class HttpResponseProxy_body_5605839325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8743;

    public HttpResponseProxy_body_5605839325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8743 = newInstance(Class.forName("com.pgssoft.httpclient.internal.HttpResponseProxy"));
        setIntField(term8743, term8743.getClass(), "statusCode", -93135961);
        setField(term8743, term8743.getClass(), "headers", null);
        setField(term8743, term8743.getClass(), "request", null);
        setField(term8743, term8743.getClass(), "body", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.HttpResponseProxy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "body", argTypes, term8743, args);
    }

};


