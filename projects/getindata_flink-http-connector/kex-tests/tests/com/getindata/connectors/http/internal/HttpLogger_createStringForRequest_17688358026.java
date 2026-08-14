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

public class HttpLogger_createStringForRequest_17688358026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11658;

    public HttpLogger_createStringForRequest_17688358026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11667 = Class.forName((String) "com.getindata.connectors.http.internal.HttpLoggingLevelType");
        Field term11666 = ((Class) term11667).getDeclaredField((String) "MIN");
        ((Field) term11666).setAccessible(true);
        Object enum14 = ((Field) term11666).get((Object) null);
        term11658 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term11658, term11658.getClass(), "httpLoggingLevelType", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createStringForRequest", argTypes, term11658, args);
    }

};


