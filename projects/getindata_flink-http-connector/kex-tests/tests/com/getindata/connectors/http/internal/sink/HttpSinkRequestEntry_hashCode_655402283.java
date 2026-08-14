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

public class HttpSinkRequestEntry_hashCode_655402283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2076;

    public HttpSinkRequestEntry_hashCode_655402283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2076 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term2089 = (byte[]) newByteArray(9);
        setField(term2076, term2076.getClass(), "method", "bLPjGVBhlX");
        setByteElement(term2089, 0, (byte) -111);
        setByteElement(term2089, 1, (byte) -127);
        setByteElement(term2089, 2, (byte) 19);
        setByteElement(term2089, 3, (byte) 83);
        setByteElement(term2089, 4, (byte) -57);
        setByteElement(term2089, 5, (byte) 103);
        setByteElement(term2089, 6, (byte) 40);
        setByteElement(term2089, 7, (byte) -106);
        setByteElement(term2089, 8, (byte) -95);
        setField(term2076, term2076.getClass(), "element", term2089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2076, args);
    }

};


