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

public class HttpSinkRequestEntry_equals_3831464472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2039;
     Object term2059;

    public HttpSinkRequestEntry_equals_3831464472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2039 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term2052 = (byte[]) newByteArray(6);
        setField(term2039, term2039.getClass(), "method", "tPlsykYBqO");
        setByteElement(term2052, 0, (byte) -99);
        setByteElement(term2052, 1, (byte) 59);
        setByteElement(term2052, 2, (byte) -99);
        setByteElement(term2052, 3, (byte) 61);
        setByteElement(term2052, 4, (byte) 100);
        setByteElement(term2052, 5, (byte) 55);
        setField(term2039, term2039.getClass(), "element", term2052);
        term2059 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2059;
        callMethod(klass, "equals", argTypes, term2039, args);
    }

};


