package com.getindata.connectors.http.internal.sink.httpclient;

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
import static com.getindata.connectors.http.internal.sink.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class PerRequestRequestSubmitterFactory_createSubmitter_19210201101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;
     Object term1856;
     Object term1861;

    public PerRequestRequestSubmitterFactory_createSubmitter_19210201101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1854 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestRequestSubmitterFactory"));
        setIntField(term1854, term1854.getClass(), "HTTP_CLIENT_THREAD_POOL_SIZE", 1);
        term1856 = new HashMap();
        term1861 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1861, 0, "dEnhdmILtU");
        setElement(term1861, 1, "hoicvmsovO");
        setElement(term1861, 2, "eqJfYWRaEL");
        setElement(term1861, 3, "fhkbdRViHi");
        setElement(term1861, 4, "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.PerRequestRequestSubmitterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Properties");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1856;
        args[1] = term1861;
        callMethod(klass, "createSubmitter", argTypes, term1854, args);
    }

};


