package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RequestRoutingResponse_getContentType_11998509392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321;

    public RequestRoutingResponse_getContentType_11998509392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321 = newInstance(Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse"));
        setIntField(term321, term321.getClass(), "status", 1484323161);
        setField(term321, term321.getClass(), "body", "oVcInYnLWB");
        setField(term321, term321.getClass(), "contentType", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term321, args);
    }

};


