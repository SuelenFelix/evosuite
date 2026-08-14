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

public class HttpClientMock_1_statusCode_1941300011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9881;

    public HttpClientMock_1_statusCode_1941300011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9884 = new HashMap();
        term9881 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock$1"));
        Object term9882 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse"));
        setIntField(term9882, term9882.getClass(), "statusCode", 1334483645);
        setField(term9882, term9882.getClass(), "headers", term9884);
        setField(term9882, term9882.getClass(), "bodyBytes", null);
        setField(term9881, term9881.getClass(), "val$response", term9882);
        setField(term9881, term9881.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "statusCode", argTypes, term9881, args);
    }

};


