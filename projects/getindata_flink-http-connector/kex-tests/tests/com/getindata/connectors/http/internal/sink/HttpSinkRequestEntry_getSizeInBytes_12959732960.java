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

public class HttpSinkRequestEntry_getSizeInBytes_12959732960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1974;

    public HttpSinkRequestEntry_getSizeInBytes_12959732960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1974 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry"));
        byte[] term1987 = (byte[]) newByteArray(6);
        setField(term1974, term1974.getClass(), "method", "kBdSllIBVz");
        setByteElement(term1987, 0, (byte) -70);
        setByteElement(term1987, 1, (byte) -5);
        setByteElement(term1987, 2, (byte) 119);
        setByteElement(term1987, 3, (byte) 81);
        setByteElement(term1987, 4, (byte) -28);
        setByteElement(term1987, 5, (byte) -18);
        setField(term1974, term1974.getClass(), "element", term1987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.HttpSinkRequestEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizeInBytes", argTypes, term1974, args);
    }

};


