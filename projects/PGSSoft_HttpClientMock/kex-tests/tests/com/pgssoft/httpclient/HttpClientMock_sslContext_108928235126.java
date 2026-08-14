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

public class HttpClientMock_sslContext_108928235126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17997;

    public HttpClientMock_sslContext_108928235126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17999 = new ArrayList();
        ArrayList term18003 = new ArrayList();
        ArrayList term18009 = new ArrayList();
        term17997 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17998 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17997, term17997.getClass(), "debugger", term17998);
        setField(term17997, term17997.getClass(), "rules", term17999);
        setField(term17997, term17997.getClass(), "rulesUnderConstruction", term18003);
        setField(term17997, term17997.getClass(), "host", "");
        setField(term17997, term17997.getClass(), "requests", term18009);
        setBooleanField(term17997, term17997.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sslContext", argTypes, term17997, args);
    }

};


