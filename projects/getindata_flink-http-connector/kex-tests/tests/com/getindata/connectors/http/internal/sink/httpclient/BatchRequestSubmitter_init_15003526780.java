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

public class BatchRequestSubmitter_init_15003526780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2045;
     Object term2055;

    public BatchRequestSubmitter_init_15003526780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2045 = new HashMap();
        term2055 = (Object[]) newArray("java.lang.String", 6);
        setElement(term2055, 0, "tPlsykYBqO");
        setElement(term2055, 1, "bLPjGVBhlX");
        setElement(term2055, 2, "whBvTVIIlC");
        setElement(term2055, 3, "IgRJUzaCwW");
        setElement(term2055, 4, "JUmudUmaaV");
        setElement(term2055, 5, "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Properties");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.net.http.HttpClient");
        Object[] args = new Object[3];
        args[0] = term2045;
        args[1] = term2055;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


