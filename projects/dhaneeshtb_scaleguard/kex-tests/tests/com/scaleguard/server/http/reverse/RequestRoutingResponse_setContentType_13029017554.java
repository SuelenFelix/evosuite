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

public class RequestRoutingResponse_setContentType_13029017554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public RequestRoutingResponse_setContentType_13029017554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse"));
        setIntField(term369, term369.getClass(), "status", 391863371);
        setField(term369, term369.getClass(), "body", "ZiaGIbnzTs");
        setField(term369, term369.getClass(), "contentType", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.RequestRoutingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setContentType", argTypes, term369, args);
    }

};


