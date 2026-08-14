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

public class HttpClientMock_verify_14160638794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17418;

    public HttpClientMock_verify_14160638794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17420 = new ArrayList();
        ArrayList term17424 = new ArrayList();
        ArrayList term17430 = new ArrayList();
        term17418 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17419 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17418, term17418.getClass(), "debugger", term17419);
        setField(term17418, term17418.getClass(), "rules", term17420);
        setField(term17418, term17418.getClass(), "rulesUnderConstruction", term17424);
        setField(term17418, term17418.getClass(), "host", "");
        setField(term17418, term17418.getClass(), "requests", term17430);
        setBooleanField(term17418, term17418.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "verify", argTypes, term17418, args);
    }

};


