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

public class HttpClientMock_followRedirects_8499674461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18270;

    public HttpClientMock_followRedirects_8499674461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18270 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        setField(term18270, term18270.getClass(), "debugger", null);
        setField(term18270, term18270.getClass(), "rules", null);
        setField(term18270, term18270.getClass(), "rulesUnderConstruction", null);
        setField(term18270, term18270.getClass(), "host", null);
        setField(term18270, term18270.getClass(), "requests", null);
        setBooleanField(term18270, term18270.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "followRedirects", argTypes, term18270, args);
    }

};


