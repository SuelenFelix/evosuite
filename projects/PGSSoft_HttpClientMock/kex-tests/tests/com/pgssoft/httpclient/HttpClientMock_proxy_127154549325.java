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

public class HttpClientMock_proxy_127154549325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17980;

    public HttpClientMock_proxy_127154549325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17982 = new ArrayList();
        ArrayList term17986 = new ArrayList();
        ArrayList term17992 = new ArrayList();
        term17980 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17981 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17980, term17980.getClass(), "debugger", term17981);
        setField(term17980, term17980.getClass(), "rules", term17982);
        setField(term17980, term17980.getClass(), "rulesUnderConstruction", term17986);
        setField(term17980, term17980.getClass(), "host", "");
        setField(term17980, term17980.getClass(), "requests", term17992);
        setBooleanField(term17980, term17980.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "proxy", argTypes, term17980, args);
    }

};


