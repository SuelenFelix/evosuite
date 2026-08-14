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

public class JwtResponse_JwtResponseBuilder_email_13178354966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9988;

    public JwtResponse_JwtResponseBuilder_email_13178354966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10061 = new ArrayList();
        ((ArrayList) term10061).add("bKBSncrMEZ");
        term9988 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term9988, term9988.getClass(), "token", "CVRGEomOth");
        setField(term9988, term9988.getClass(), "type", "vSeruUyNWX");
        setField(term9988, term9988.getClass(), "refreshToken", "UkKvaeJfEC");
        setField(term9988, term9988.getClass(), "id", "WPxXsahPRq");
        setField(term9988, term9988.getClass(), "username", "IENRuqmwUU");
        setField(term9988, term9988.getClass(), "email", "GsWxOwXvSu");
        setField(term9988, term9988.getClass(), "roles", term10061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yeSXGqQExb";
        callMethod(klass, "email", argTypes, term9988, args);
    }

};


