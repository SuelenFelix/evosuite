package com.getindata.connectors.http.internal.sink;

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
import static com.getindata.connectors.http.internal.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpSinkRequestEntry_toString_5762999189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2153;

    public HttpSinkRequestEntry_toString_5762999189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2153 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        setField(term2153, term2153.getClass(), "method", null);
        setField(term2153, term2153.getClass(), "element", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2153, args);
    }

};


