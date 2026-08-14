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

public class JwtResponse_JwtResponseBuilder_id_3234065514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9472;

    public JwtResponse_JwtResponseBuilder_id_3234065514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9545 = new ArrayList();
        ((ArrayList) term9545).add("zLMTXDQHYH");
        ((ArrayList) term9545).add("PqywFWJlpE");
        ((ArrayList) term9545).add("OzXRsFGTIp");
        ((ArrayList) term9545).add("TjWpyghUWN");
        ((ArrayList) term9545).add("dkZFDZxcde");
        term9472 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term9472, term9472.getClass(), "token", "mGRiYhnMcR");
        setField(term9472, term9472.getClass(), "type", "NFlvfJCVPO");
        setField(term9472, term9472.getClass(), "refreshToken", "KarbTXFmUU");
        setField(term9472, term9472.getClass(), "id", "jiUSjqwSIQ");
        setField(term9472, term9472.getClass(), "username", "MgLCedQfoj");
        setField(term9472, term9472.getClass(), "email", "zgKiINdgNu");
        setField(term9472, term9472.getClass(), "roles", term9545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXcZEtUKlI";
        callMethod(klass, "id", argTypes, term9472, args);
    }

};


