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

public class HttpLogger_createStringForResponse_1625068188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12328;

    public HttpLogger_createStringForResponse_1625068188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12337 = Class.forName((String) "com.getindata.connectors.http.internal.HttpLoggingLevelType");
        Field term12336 = ((Class) term12337).getDeclaredField((String) "MAX");
        ((Field) term12336).setAccessible(true);
        Object enum16 = ((Field) term12336).get((Object) null);
        term12328 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term12328, term12328.getClass(), "httpLoggingLevelType", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createStringForResponse", argTypes, term12328, args);
    }

};


