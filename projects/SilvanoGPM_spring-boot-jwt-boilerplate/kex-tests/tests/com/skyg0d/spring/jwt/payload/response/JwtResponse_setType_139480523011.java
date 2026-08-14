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

public class JwtResponse_setType_139480523011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4592;

    public JwtResponse_setType_139480523011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4661 = new ArrayList();
        ((ArrayList) term4661).add("DhjNLmRMCu");
        term4592 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term4592, term4592.getClass(), "token", "vKQukfbJUd");
        setField(term4592, term4592.getClass(), "type", "Bearer");
        setField(term4592, term4592.getClass(), "refreshToken", "lFRJFUMVbx");
        setField(term4592, term4592.getClass(), "id", "sZdUNdggUW");
        setField(term4592, term4592.getClass(), "username", "OqbwYQfvAe");
        setField(term4592, term4592.getClass(), "email", "tRxZafjqIx");
        setField(term4592, term4592.getClass(), "roles", term4661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PgPzMSEjjX";
        callMethod(klass, "setType", argTypes, term4592, args);
    }

};


