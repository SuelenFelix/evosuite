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

public class JwtResponse_getRoles_10901346189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4026;

    public JwtResponse_getRoles_10901346189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4095 = new ArrayList();
        ((ArrayList) term4095).add("sQvGcVjdEx");
        ((ArrayList) term4095).add("rLHAoqXgPh");
        ((ArrayList) term4095).add("zUlRdimJtU");
        ((ArrayList) term4095).add("vwbEQQNQrx");
        ((ArrayList) term4095).add("xtftXXMbem");
        ((ArrayList) term4095).add("cudZvLMQon");
        term4026 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term4026, term4026.getClass(), "token", "PapWxkhEWe");
        setField(term4026, term4026.getClass(), "type", "Bearer");
        setField(term4026, term4026.getClass(), "refreshToken", "smnHEqRFRx");
        setField(term4026, term4026.getClass(), "id", "XYtryyobou");
        setField(term4026, term4026.getClass(), "username", "OYbzXylRWW");
        setField(term4026, term4026.getClass(), "email", "DSNsTGYXDF");
        setField(term4026, term4026.getClass(), "roles", term4095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term4026, args);
    }

};


