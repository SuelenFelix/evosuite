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
import java.lang.Object;
import java.util.HashMap;

public class HttpClientMock_1_version_16534059113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9897;

    public HttpClientMock_1_version_16534059113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9900 = new HashMap();
        term9897 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock$1"));
        Object term9898 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse"));
        setIntField(term9898, term9898.getClass(), "statusCode", 787278105);
        setField(term9898, term9898.getClass(), "headers", term9900);
        setField(term9898, term9898.getClass(), "bodyBytes", null);
        setField(term9897, term9897.getClass(), "val$response", term9898);
        setField(term9897, term9897.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "version", argTypes, term9897, args);
    }

};


