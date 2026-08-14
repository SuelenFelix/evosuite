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

public class HttpClientMock_onOptions_82501794110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17505;

    public HttpClientMock_onOptions_82501794110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17507 = new ArrayList();
        ArrayList term17511 = new ArrayList();
        ArrayList term17517 = new ArrayList();
        term17505 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17506 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17505, term17505.getClass(), "debugger", term17506);
        setField(term17505, term17505.getClass(), "rules", term17507);
        setField(term17505, term17505.getClass(), "rulesUnderConstruction", term17511);
        setField(term17505, term17505.getClass(), "host", "");
        setField(term17505, term17505.getClass(), "requests", term17517);
        setBooleanField(term17505, term17505.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onOptions", argTypes, term17505, args);
    }

};


