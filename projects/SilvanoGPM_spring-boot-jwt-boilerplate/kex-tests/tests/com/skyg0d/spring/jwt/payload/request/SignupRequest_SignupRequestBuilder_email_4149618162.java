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

public class SignupRequest_SignupRequestBuilder_email_4149618162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1131;

    public SignupRequest_SignupRequestBuilder_email_4149618162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1131 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest$SignupRequestBuilder"));
        setField(term1131, term1131.getClass(), "username", "jSpAteRute");
        setField(term1131, term1131.getClass(), "email", "swZVeJAxjt");
        setField(term1131, term1131.getClass(), "password", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest$SignupRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "email", argTypes, term1131, args);
    }

};


