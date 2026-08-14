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

public class HttpClientMock_cookieHandler_9640685122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17929;

    public HttpClientMock_cookieHandler_9640685122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17931 = new ArrayList();
        ArrayList term17935 = new ArrayList();
        ArrayList term17941 = new ArrayList();
        term17929 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17930 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17929, term17929.getClass(), "debugger", term17930);
        setField(term17929, term17929.getClass(), "rules", term17931);
        setField(term17929, term17929.getClass(), "rulesUnderConstruction", term17935);
        setField(term17929, term17929.getClass(), "host", "");
        setField(term17929, term17929.getClass(), "requests", term17941);
        setBooleanField(term17929, term17929.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cookieHandler", argTypes, term17929, args);
    }

};


