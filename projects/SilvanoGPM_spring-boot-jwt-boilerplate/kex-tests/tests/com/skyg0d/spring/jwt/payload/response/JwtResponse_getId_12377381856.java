package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class JwtResponse_getId_12377381856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3441;

    public JwtResponse_getId_12377381856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3510 = new ArrayList();
        ((ArrayList) term3510).add("UfQtPRyWRC");
        term3441 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term3441, term3441.getClass(), "token", "yVMkkQhvmN");
        setField(term3441, term3441.getClass(), "type", "Bearer");
        setField(term3441, term3441.getClass(), "refreshToken", "mvrkADEgpp");
        setField(term3441, term3441.getClass(), "id", "pXOkjyeIRb");
        setField(term3441, term3441.getClass(), "username", "GgZWSjxjyE");
        setField(term3441, term3441.getClass(), "email", "EeBVbzjcCI");
        setField(term3441, term3441.getClass(), "roles", term3510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3441, args);
    }

};


