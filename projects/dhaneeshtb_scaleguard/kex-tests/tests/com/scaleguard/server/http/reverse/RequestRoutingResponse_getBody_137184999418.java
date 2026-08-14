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

public class RequestRoutingResponse_getBody_137184999418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public RequestRoutingResponse_getBody_137184999418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681 = newInstance(Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse"));
        setIntField(term681, term681.getClass(), "status", 0);
        setField(term681, term681.getClass(), "body", null);
        setField(term681, term681.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term681, args);
    }

};


