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

public class HttpClientMock_onPut_196569984611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17522;

    public HttpClientMock_onPut_196569984611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17524 = new ArrayList();
        ArrayList term17528 = new ArrayList();
        ArrayList term17534 = new ArrayList();
        term17522 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17523 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17522, term17522.getClass(), "debugger", term17523);
        setField(term17522, term17522.getClass(), "rules", term17524);
        setField(term17522, term17522.getClass(), "rulesUnderConstruction", term17528);
        setField(term17522, term17522.getClass(), "host", "");
        setField(term17522, term17522.getClass(), "requests", term17534);
        setBooleanField(term17522, term17522.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onPut", argTypes, term17522, args);
    }

};


