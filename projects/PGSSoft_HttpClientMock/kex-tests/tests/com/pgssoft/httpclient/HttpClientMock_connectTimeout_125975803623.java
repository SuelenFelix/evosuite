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

public class HttpClientMock_connectTimeout_125975803623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17946;

    public HttpClientMock_connectTimeout_125975803623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17948 = new ArrayList();
        ArrayList term17952 = new ArrayList();
        ArrayList term17958 = new ArrayList();
        term17946 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17947 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17946, term17946.getClass(), "debugger", term17947);
        setField(term17946, term17946.getClass(), "rules", term17948);
        setField(term17946, term17946.getClass(), "rulesUnderConstruction", term17952);
        setField(term17946, term17946.getClass(), "host", "");
        setField(term17946, term17946.getClass(), "requests", term17958);
        setBooleanField(term17946, term17946.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "connectTimeout", argTypes, term17946, args);
    }

};


