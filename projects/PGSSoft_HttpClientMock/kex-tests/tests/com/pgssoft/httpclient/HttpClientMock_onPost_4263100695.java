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

public class HttpClientMock_onPost_4263100695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17435;

    public HttpClientMock_onPost_4263100695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17437 = new ArrayList();
        ArrayList term17441 = new ArrayList();
        ArrayList term17447 = new ArrayList();
        term17435 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17436 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17435, term17435.getClass(), "debugger", term17436);
        setField(term17435, term17435.getClass(), "rules", term17437);
        setField(term17435, term17435.getClass(), "rulesUnderConstruction", term17441);
        setField(term17435, term17435.getClass(), "host", "");
        setField(term17435, term17435.getClass(), "requests", term17447);
        setBooleanField(term17435, term17435.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onPost", argTypes, term17435, args);
    }

};


