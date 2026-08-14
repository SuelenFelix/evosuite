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

public class HttpClientMock_onGet_19569115016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17452;

    public HttpClientMock_onGet_19569115016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17454 = new ArrayList();
        ArrayList term17458 = new ArrayList();
        ArrayList term17464 = new ArrayList();
        term17452 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17453 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17452, term17452.getClass(), "debugger", term17453);
        setField(term17452, term17452.getClass(), "rules", term17454);
        setField(term17452, term17452.getClass(), "rulesUnderConstruction", term17458);
        setField(term17452, term17452.getClass(), "host", "");
        setField(term17452, term17452.getClass(), "requests", term17464);
        setBooleanField(term17452, term17452.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onGet", argTypes, term17452, args);
    }

};


