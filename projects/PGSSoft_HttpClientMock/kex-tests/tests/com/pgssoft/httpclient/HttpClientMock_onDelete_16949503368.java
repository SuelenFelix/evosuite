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

public class HttpClientMock_onDelete_16949503368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17471;

    public HttpClientMock_onDelete_16949503368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17473 = new ArrayList();
        ArrayList term17477 = new ArrayList();
        ArrayList term17483 = new ArrayList();
        term17471 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17472 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17471, term17471.getClass(), "debugger", term17472);
        setField(term17471, term17471.getClass(), "rules", term17473);
        setField(term17471, term17471.getClass(), "rulesUnderConstruction", term17477);
        setField(term17471, term17471.getClass(), "host", "");
        setField(term17471, term17471.getClass(), "requests", term17483);
        setBooleanField(term17471, term17471.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onDelete", argTypes, term17471, args);
    }

};


