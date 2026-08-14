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
import java.lang.Integer;

public class MockedServerResponse_Builder_setStatusCode_17433399556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13290;
     Object term13292;

    public MockedServerResponse_Builder_setStatusCode_17433399556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13290 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        setIntField(term13290, term13290.getClass(), "statusCode", 0);
        setField(term13290, term13290.getClass(), "headers", null);
        setField(term13290, term13290.getClass(), "bodyBytes", null);
        term13292 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13292;
        callMethod(klass, "setStatusCode", argTypes, term13290, args);
    }

};


