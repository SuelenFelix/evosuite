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

public class HttpClientMock_authenticator_50397204828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18031;

    public HttpClientMock_authenticator_50397204828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18033 = new ArrayList();
        ArrayList term18037 = new ArrayList();
        ArrayList term18043 = new ArrayList();
        term18031 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18032 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18031, term18031.getClass(), "debugger", term18032);
        setField(term18031, term18031.getClass(), "rules", term18033);
        setField(term18031, term18031.getClass(), "rulesUnderConstruction", term18037);
        setField(term18031, term18031.getClass(), "host", "");
        setField(term18031, term18031.getClass(), "requests", term18043);
        setBooleanField(term18031, term18031.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "authenticator", argTypes, term18031, args);
    }

};


