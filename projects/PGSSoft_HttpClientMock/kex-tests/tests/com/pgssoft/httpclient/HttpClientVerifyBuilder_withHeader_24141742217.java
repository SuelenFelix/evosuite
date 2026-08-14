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

public class HttpClientVerifyBuilder_withHeader_24141742217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20007;

    public HttpClientVerifyBuilder_withHeader_24141742217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20007 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder"));
        setField(term20007, term20007.getClass(), "ruleBuilder", null);
        setField(term20007, term20007.getClass(), "requests", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerifyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "withHeader", argTypes, term20007, args);
    }

};


