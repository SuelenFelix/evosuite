package com.getindata.connectors.http.internal;

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
import static com.getindata.connectors.http.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HttpLogger_logRequestBody_75146153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8042;

    public HttpLogger_logRequestBody_75146153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8071 = Class.forName((String) "com.getindata.connectors.http.internal.HttpLoggingLevelType");
        Field term8070 = ((Class) term8071).getDeclaredField((String) "REQRESPONSE");
        ((Field) term8070).setAccessible(true);
        Object enum12 = ((Field) term8070).get((Object) null);
        term8042 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term8042, term8042.getClass(), "httpLoggingLevelType", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "logRequestBody", argTypes, term8042, args);
    }

};


