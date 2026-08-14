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

public class HttpClientMock_onPut_181344672315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17634;

    public HttpClientMock_onPut_181344672315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17636 = new ArrayList();
        ArrayList term17640 = new ArrayList();
        ArrayList term17646 = new ArrayList();
        term17634 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17635 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17634, term17634.getClass(), "debugger", term17635);
        setField(term17634, term17634.getClass(), "rules", term17636);
        setField(term17634, term17634.getClass(), "rulesUnderConstruction", term17640);
        setField(term17634, term17634.getClass(), "host", "");
        setField(term17634, term17634.getClass(), "requests", term17646);
        setBooleanField(term17634, term17634.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "onPut", argTypes, term17634, args);
    }

};


