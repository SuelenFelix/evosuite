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
import java.util.HashMap;

public class MockedServerResponse_getBodyBytes_3079816163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17233;

    public MockedServerResponse_getBodyBytes_3079816163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17235 = new HashMap();
        term17233 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse"));
        setIntField(term17233, term17233.getClass(), "statusCode", -355469363);
        setField(term17233, term17233.getClass(), "headers", term17235);
        setField(term17233, term17233.getClass(), "bodyBytes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBodyBytes", argTypes, term17233, args);
    }

};


