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

public class HttpClientMock_onPatch_44496441712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17539;

    public HttpClientMock_onPatch_44496441712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17541 = new ArrayList();
        ArrayList term17545 = new ArrayList();
        ArrayList term17551 = new ArrayList();
        term17539 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17540 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17539, term17539.getClass(), "debugger", term17540);
        setField(term17539, term17539.getClass(), "rules", term17541);
        setField(term17539, term17539.getClass(), "rulesUnderConstruction", term17545);
        setField(term17539, term17539.getClass(), "host", "");
        setField(term17539, term17539.getClass(), "requests", term17551);
        setBooleanField(term17539, term17539.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onPatch", argTypes, term17539, args);
    }

};


