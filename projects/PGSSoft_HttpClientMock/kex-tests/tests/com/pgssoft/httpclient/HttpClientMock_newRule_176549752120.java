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

public class HttpClientMock_newRule_176549752120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17829;

    public HttpClientMock_newRule_176549752120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17831 = new ArrayList();
        ArrayList term17835 = new ArrayList();
        ArrayList term17841 = new ArrayList();
        term17829 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17830 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17829, term17829.getClass(), "debugger", term17830);
        setField(term17829, term17829.getClass(), "rules", term17831);
        setField(term17829, term17829.getClass(), "rulesUnderConstruction", term17835);
        setField(term17829, term17829.getClass(), "host", "");
        setField(term17829, term17829.getClass(), "requests", term17841);
        setBooleanField(term17829, term17829.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "newRule", argTypes, term17829, args);
    }

};


