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

public class HttpClientMock_version_129585030829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18048;

    public HttpClientMock_version_129585030829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18050 = new ArrayList();
        ArrayList term18054 = new ArrayList();
        ArrayList term18060 = new ArrayList();
        term18048 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18049 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18048, term18048.getClass(), "debugger", term18049);
        setField(term18048, term18048.getClass(), "rules", term18050);
        setField(term18048, term18048.getClass(), "rulesUnderConstruction", term18054);
        setField(term18048, term18048.getClass(), "host", "");
        setField(term18048, term18048.getClass(), "requests", term18060);
        setBooleanField(term18048, term18048.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "version", argTypes, term18048, args);
    }

};


