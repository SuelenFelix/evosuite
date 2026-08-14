package com.getindata.connectors.http.internal.table.sink;

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
import static com.getindata.connectors.http.internal.table.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Slf4jHttpPostRequestCallback_call_5987328083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public Slf4jHttpPostRequestCallback_call_5987328083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.sink.Slf4jHttpPostRequestCallback"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.sink.Slf4jHttpPostRequestCallback");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.net.http.HttpResponse");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Map");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "call", argTypes, term183, args);
    }

};


