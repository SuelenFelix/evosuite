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

public class HttpClientMock_1_init_20903366460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9857;
     Object term9874;

    public HttpClientMock_1_init_20903366460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9859 = new ArrayList();
        ArrayList term9863 = new ArrayList();
        ArrayList term9869 = new ArrayList();
        term9857 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term9858 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term9857, term9857.getClass(), "debugger", term9858);
        setField(term9857, term9857.getClass(), "rules", term9859);
        setField(term9857, term9857.getClass(), "rulesUnderConstruction", term9863);
        setField(term9857, term9857.getClass(), "host", "");
        setField(term9857, term9857.getClass(), "requests", term9869);
        setBooleanField(term9857, term9857.getClass(), "debuggingOn", false);
        HashMap term9876 = new HashMap();
        term9874 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse"));
        setIntField(term9874, term9874.getClass(), "statusCode", -1849105286);
        setField(term9874, term9874.getClass(), "headers", term9876);
        setField(term9874, term9874.getClass(), "bodyBytes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.MockedServerResponse");
        Object[] args = new Object[2];
        args[0] = term9857;
        args[1] = term9874;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


