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

public class JwtResponse_getUsername_8873834747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3592;

    public JwtResponse_getUsername_8873834747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3661 = new ArrayList();
        ((ArrayList) term3661).add("MwwjNtdOFT");
        ((ArrayList) term3661).add("VYkqXKVlAJ");
        ((ArrayList) term3661).add("XkIoWJRNwN");
        ((ArrayList) term3661).add("aNWLJdrZMq");
        ((ArrayList) term3661).add("HHmNoYxIGj");
        ((ArrayList) term3661).add("PtirvZmsGt");
        term3592 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term3592, term3592.getClass(), "token", "FPvxVzzSvD");
        setField(term3592, term3592.getClass(), "type", "Bearer");
        setField(term3592, term3592.getClass(), "refreshToken", "WHcwFgsGFC");
        setField(term3592, term3592.getClass(), "id", "HzqpegHiRq");
        setField(term3592, term3592.getClass(), "username", "jwsfVjMoJT");
        setField(term3592, term3592.getClass(), "email", "ZfdXfCCFDf");
        setField(term3592, term3592.getClass(), "roles", term3661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term3592, args);
    }

};


