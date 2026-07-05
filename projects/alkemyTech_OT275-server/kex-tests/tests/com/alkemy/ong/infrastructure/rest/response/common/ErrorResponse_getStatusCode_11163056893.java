package com.alkemy.ong.infrastructure.rest.response.common;

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
import static com.alkemy.ong.infrastructure.rest.response.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ErrorResponse_getStatusCode_11163056893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;

    public ErrorResponse_getStatusCode_11163056893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1262 = new ArrayList();
        ((ArrayList) term1262).add("YRHGsAkhxb");
        ((ArrayList) term1262).add("ffYhPOzlUs");
        ((ArrayList) term1262).add("MLqYREekMl");
        ((ArrayList) term1262).add("ytSBIKXogI");
        ((ArrayList) term1262).add("nHXjMycHlU");
        ((ArrayList) term1262).add("ieCtQFdkii");
        ((ArrayList) term1262).add("dEnhdmILtU");
        ((ArrayList) term1262).add("hoicvmsovO");
        ((ArrayList) term1262).add("eqJfYWRaEL");
        term1248 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse"));
        setIntField(term1248, term1248.getClass(), "statusCode", -73683645);
        setField(term1248, term1248.getClass(), "message", "onpbIeEKoi");
        setField(term1248, term1248.getClass(), "moreInfo", term1262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusCode", argTypes, term1248, args);
    }

};


