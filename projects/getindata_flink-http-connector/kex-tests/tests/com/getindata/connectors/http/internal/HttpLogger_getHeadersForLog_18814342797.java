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

public class HttpLogger_getHeadersForLog_18814342797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11977;

    public HttpLogger_getHeadersForLog_18814342797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11994 = Class.forName((String) "com.getindata.connectors.http.internal.HttpLoggingLevelType");
        Field term11993 = ((Class) term11994).getDeclaredField((String) "REQRESPONSE");
        ((Field) term11993).setAccessible(true);
        Object enum15 = ((Field) term11993).get((Object) null);
        term11977 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term11977, term11977.getClass(), "httpLoggingLevelType", enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpHeaders");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getHeadersForLog", argTypes, term11977, args);
    }

};


