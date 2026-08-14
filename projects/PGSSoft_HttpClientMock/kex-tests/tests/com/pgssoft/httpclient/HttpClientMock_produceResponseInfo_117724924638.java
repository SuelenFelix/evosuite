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
import java.util.HashMap;

public class HttpClientMock_produceResponseInfo_117724924638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18208;
     Object term18225;

    public HttpClientMock_produceResponseInfo_117724924638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18210 = new ArrayList();
        ArrayList term18214 = new ArrayList();
        ArrayList term18220 = new ArrayList();
        term18208 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term18209 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term18208, term18208.getClass(), "debugger", term18209);
        setField(term18208, term18208.getClass(), "rules", term18210);
        setField(term18208, term18208.getClass(), "rulesUnderConstruction", term18214);
        setField(term18208, term18208.getClass(), "host", "");
        setField(term18208, term18208.getClass(), "requests", term18220);
        setBooleanField(term18208, term18208.getClass(), "debuggingOn", true);
        HashMap term18227 = new HashMap();
        term18225 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse"));
        setIntField(term18225, term18225.getClass(), "statusCode", 1292332296);
        setField(term18225, term18225.getClass(), "headers", term18227);
        setField(term18225, term18225.getClass(), "bodyBytes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse");
        Object[] args = new Object[1];
        args[0] = term18225;
        callMethod(klass, "produceResponseInfo", argTypes, term18208, args);
    }

};


