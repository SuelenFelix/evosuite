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

public class HttpClientMock_reset_10822031683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17401;

    public HttpClientMock_reset_10822031683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17403 = new ArrayList();
        ArrayList term17407 = new ArrayList();
        ArrayList term17413 = new ArrayList();
        term17401 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17402 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17401, term17401.getClass(), "debugger", term17402);
        setField(term17401, term17401.getClass(), "rules", term17403);
        setField(term17401, term17401.getClass(), "rulesUnderConstruction", term17407);
        setField(term17401, term17401.getClass(), "host", "");
        setField(term17401, term17401.getClass(), "requests", term17413);
        setBooleanField(term17401, term17401.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term17401, args);
    }

};


