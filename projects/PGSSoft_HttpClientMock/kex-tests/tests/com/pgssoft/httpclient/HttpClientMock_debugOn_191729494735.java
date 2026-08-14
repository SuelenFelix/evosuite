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
import java.util.ArrayList;

public class HttpClientMock_debugOn_191729494735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18150;

    public HttpClientMock_debugOn_191729494735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18152 = new ArrayList();
        ArrayList term18156 = new ArrayList();
        ArrayList term18162 = new ArrayList();
        term18150 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18151 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18150, term18150.getClass(), "debugger", term18151);
        setField(term18150, term18150.getClass(), "rules", term18152);
        setField(term18150, term18150.getClass(), "rulesUnderConstruction", term18156);
        setField(term18150, term18150.getClass(), "host", "");
        setField(term18150, term18150.getClass(), "requests", term18162);
        setBooleanField(term18150, term18150.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "debugOn", argTypes, term18150, args);
    }

};


