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

public class SignupRequest_getEmail_6563046492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1515;

    public SignupRequest_getEmail_6563046492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1515 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest"));
        setField(term1515, term1515.getClass(), "username", "xBsXSDjXYK");
        setField(term1515, term1515.getClass(), "email", "sEnIVFtZuQ");
        setField(term1515, term1515.getClass(), "password", "ZVecLZMLHF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.request.SignupRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1515, args);
    }

};


