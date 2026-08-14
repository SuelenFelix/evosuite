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

public class HttpClientMock_onPost_27405694614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17595;

    public HttpClientMock_onPost_27405694614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17597 = new ArrayList();
        ArrayList term17601 = new ArrayList();
        ArrayList term17607 = new ArrayList();
        term17595 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17596 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17595, term17595.getClass(), "debugger", term17596);
        setField(term17595, term17595.getClass(), "rules", term17597);
        setField(term17595, term17595.getClass(), "rulesUnderConstruction", term17601);
        setField(term17595, term17595.getClass(), "host", "");
        setField(term17595, term17595.getClass(), "requests", term17607);
        setBooleanField(term17595, term17595.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "onPost", argTypes, term17595, args);
    }

};


