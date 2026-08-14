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

public class BatchRequestSubmitterFactory_createSubmitter_19889408641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976;
     Object term1990;
     Object term2008;

    public BatchRequestSubmitterFactory_createSubmitter_19889408641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1976 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitterFactory"));
        setIntField(term1976, term1976.getClass(), "HTTP_CLIENT_THREAD_POOL_SIZE", 1162663216);
        setField(term1976, term1976.getClass(), "maxBatchSize", "kBdSllIBVz");
        term1990 = new HashMap();
        term2008 = (Object[]) newArray("java.lang.String", 1);
        setElement(term2008, 0, "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.BatchRequestSubmitterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Properties");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1990;
        args[1] = term2008;
        callMethod(klass, "createSubmitter", argTypes, term1976, args);
    }

};


