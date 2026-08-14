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

public class HttpClientMock_onHead_3523691417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17712;

    public HttpClientMock_onHead_3523691417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17714 = new ArrayList();
        ArrayList term17718 = new ArrayList();
        ArrayList term17724 = new ArrayList();
        term17712 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17713 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17712, term17712.getClass(), "debugger", term17713);
        setField(term17712, term17712.getClass(), "rules", term17714);
        setField(term17712, term17712.getClass(), "rulesUnderConstruction", term17718);
        setField(term17712, term17712.getClass(), "host", "");
        setField(term17712, term17712.getClass(), "requests", term17724);
        setBooleanField(term17712, term17712.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "onHead", argTypes, term17712, args);
    }

};


