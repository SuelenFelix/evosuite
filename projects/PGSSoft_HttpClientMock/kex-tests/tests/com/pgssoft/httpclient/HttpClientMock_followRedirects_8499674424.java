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

public class HttpClientMock_followRedirects_8499674424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17963;

    public HttpClientMock_followRedirects_8499674424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17965 = new ArrayList();
        ArrayList term17969 = new ArrayList();
        ArrayList term17975 = new ArrayList();
        term17963 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17964 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17963, term17963.getClass(), "debugger", term17964);
        setField(term17963, term17963.getClass(), "rules", term17965);
        setField(term17963, term17963.getClass(), "rulesUnderConstruction", term17969);
        setField(term17963, term17963.getClass(), "host", "");
        setField(term17963, term17963.getClass(), "requests", term17975);
        setBooleanField(term17963, term17963.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "followRedirects", argTypes, term17963, args);
    }

};


