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

public class HttpClientMock_sslParameters_184598224527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18014;

    public HttpClientMock_sslParameters_184598224527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18016 = new ArrayList();
        ArrayList term18020 = new ArrayList();
        ArrayList term18026 = new ArrayList();
        term18014 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18015 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18014, term18014.getClass(), "debugger", term18015);
        setField(term18014, term18014.getClass(), "rules", term18016);
        setField(term18014, term18014.getClass(), "rulesUnderConstruction", term18020);
        setField(term18014, term18014.getClass(), "host", "");
        setField(term18014, term18014.getClass(), "requests", term18026);
        setBooleanField(term18014, term18014.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sslParameters", argTypes, term18014, args);
    }

};


