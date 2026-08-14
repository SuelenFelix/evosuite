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

public class HttpClientMock_debugOff_26026839736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18167;

    public HttpClientMock_debugOff_26026839736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18169 = new ArrayList();
        ArrayList term18173 = new ArrayList();
        ArrayList term18179 = new ArrayList();
        term18167 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18168 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18167, term18167.getClass(), "debugger", term18168);
        setField(term18167, term18167.getClass(), "rules", term18169);
        setField(term18167, term18167.getClass(), "rulesUnderConstruction", term18173);
        setField(term18167, term18167.getClass(), "host", "");
        setField(term18167, term18167.getClass(), "requests", term18179);
        setBooleanField(term18167, term18167.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "debugOff", argTypes, term18167, args);
    }

};


