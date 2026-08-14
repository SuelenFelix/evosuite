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

public class HttpLogger_createStringForBody_8371645910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15993;

    public HttpLogger_createStringForBody_8371645910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16014 = Class.forName((String) "com.getindata.connectors.http.internal.HttpLoggingLevelType");
        Field term16013 = ((Class) term16014).getDeclaredField((String) "MIN");
        ((Field) term16013).setAccessible(true);
        Object enum18 = ((Field) term16013).get((Object) null);
        term15993 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term15993, term15993.getClass(), "httpLoggingLevelType", enum18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        callMethod(klass, "createStringForBody", argTypes, term15993, args);
    }

};


