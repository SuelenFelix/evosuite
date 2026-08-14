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

public class HttpClientMock_onOptions_67276481818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17751;

    public HttpClientMock_onOptions_67276481818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17753 = new ArrayList();
        ArrayList term17757 = new ArrayList();
        ArrayList term17763 = new ArrayList();
        term17751 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17752 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17751, term17751.getClass(), "debugger", term17752);
        setField(term17751, term17751.getClass(), "rules", term17753);
        setField(term17751, term17751.getClass(), "rulesUnderConstruction", term17757);
        setField(term17751, term17751.getClass(), "host", "");
        setField(term17751, term17751.getClass(), "requests", term17763);
        setBooleanField(term17751, term17751.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "onOptions", argTypes, term17751, args);
    }

};


