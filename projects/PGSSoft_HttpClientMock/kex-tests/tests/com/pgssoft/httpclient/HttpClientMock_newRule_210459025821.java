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

public class HttpClientMock_newRule_210459025821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17868;

    public HttpClientMock_newRule_210459025821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17870 = new ArrayList();
        ArrayList term17874 = new ArrayList();
        ArrayList term17880 = new ArrayList();
        term17868 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17869 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17868, term17868.getClass(), "debugger", term17869);
        setField(term17868, term17868.getClass(), "rules", term17870);
        setField(term17868, term17868.getClass(), "rulesUnderConstruction", term17874);
        setField(term17868, term17868.getClass(), "host", "");
        setField(term17868, term17868.getClass(), "requests", term17880);
        setBooleanField(term17868, term17868.getClass(), "debuggingOn", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PHvxnGHptP";
        args[1] = "TimdotUuNC";
        callMethod(klass, "newRule", argTypes, term17868, args);
    }

};


