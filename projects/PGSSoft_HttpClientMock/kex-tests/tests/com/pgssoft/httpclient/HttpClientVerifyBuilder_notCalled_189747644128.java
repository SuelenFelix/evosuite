package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpClientVerifyBuilder_notCalled_189747644128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20018;

    public HttpClientVerifyBuilder_notCalled_189747644128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20018 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        setField(term20018, term20018.getClass(), "ruleBuilder", null);
        setField(term20018, term20018.getClass(), "requests", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "notCalled", argTypes, term20018, args);
    }

};


