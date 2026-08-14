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

public class HttpClientMock_debugOn_191729494772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18292;

    public HttpClientMock_debugOn_191729494772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18292 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        setField(term18292, term18292.getClass(), "debugger", null);
        setField(term18292, term18292.getClass(), "rules", null);
        setField(term18292, term18292.getClass(), "rulesUnderConstruction", null);
        setField(term18292, term18292.getClass(), "host", null);
        setField(term18292, term18292.getClass(), "requests", null);
        setBooleanField(term18292, term18292.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "debugOn", argTypes, term18292, args);
    }

};


