package com.skyg0d.spring.jwt.payload.request;

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
import static com.skyg0d.spring.jwt.payload.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SignupRequest_SignupRequestBuilder_build_5103350194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;

    public SignupRequest_SignupRequestBuilder_build_5103350194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1309 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest$SignupRequestBuilder"));
        setField(term1309, term1309.getClass(), "username", "JiVRgTZvKc");
        setField(term1309, term1309.getClass(), "email", "XPKmummaqg");
        setField(term1309, term1309.getClass(), "password", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest$SignupRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1309, args);
    }

};


