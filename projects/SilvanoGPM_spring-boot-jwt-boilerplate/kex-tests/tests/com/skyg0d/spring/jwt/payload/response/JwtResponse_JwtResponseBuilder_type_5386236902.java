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

public class JwtResponse_JwtResponseBuilder_type_5386236902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9022;

    public JwtResponse_JwtResponseBuilder_type_5386236902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9095 = new ArrayList();
        ((ArrayList) term9095).add("JOqQxuzRuZ");
        term9022 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term9022, term9022.getClass(), "token", "ITRRYiuDwH");
        setField(term9022, term9022.getClass(), "type", "llRfwANcVF");
        setField(term9022, term9022.getClass(), "refreshToken", "sUEeHQTWkA");
        setField(term9022, term9022.getClass(), "id", "BDIRCxAWLA");
        setField(term9022, term9022.getClass(), "username", "eOJfbiZLnb");
        setField(term9022, term9022.getClass(), "email", "nKZKnxWYCK");
        setField(term9022, term9022.getClass(), "roles", term9095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RSaoipUlsg";
        callMethod(klass, "type", argTypes, term9022, args);
    }

};


