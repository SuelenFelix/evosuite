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

public class SignupRequest_setEmail_10799730655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738;

    public SignupRequest_setEmail_10799730655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1738 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest"));
        setField(term1738, term1738.getClass(), "username", "iNwOJRBEjp");
        setField(term1738, term1738.getClass(), "email", "XylxrMBraH");
        setField(term1738, term1738.getClass(), "password", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "setEmail", argTypes, term1738, args);
    }

};


