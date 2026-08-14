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

public class HttpClientMock_onGet_180465837813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17556;

    public HttpClientMock_onGet_180465837813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17558 = new ArrayList();
        ArrayList term17562 = new ArrayList();
        ArrayList term17568 = new ArrayList();
        term17556 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17557 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17556, term17556.getClass(), "debugger", term17557);
        setField(term17556, term17556.getClass(), "rules", term17558);
        setField(term17556, term17556.getClass(), "rulesUnderConstruction", term17562);
        setField(term17556, term17556.getClass(), "host", "");
        setField(term17556, term17556.getClass(), "requests", term17568);
        setBooleanField(term17556, term17556.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "onGet", argTypes, term17556, args);
    }

};


