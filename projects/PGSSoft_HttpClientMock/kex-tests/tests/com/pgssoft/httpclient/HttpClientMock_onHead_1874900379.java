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

public class HttpClientMock_onHead_1874900379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17488;

    public HttpClientMock_onHead_1874900379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17490 = new ArrayList();
        ArrayList term17494 = new ArrayList();
        ArrayList term17500 = new ArrayList();
        term17488 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17489 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17488, term17488.getClass(), "debugger", term17489);
        setField(term17488, term17488.getClass(), "rules", term17490);
        setField(term17488, term17488.getClass(), "rulesUnderConstruction", term17494);
        setField(term17488, term17488.getClass(), "host", "");
        setField(term17488, term17488.getClass(), "requests", term17500);
        setBooleanField(term17488, term17488.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onHead", argTypes, term17488, args);
    }

};


