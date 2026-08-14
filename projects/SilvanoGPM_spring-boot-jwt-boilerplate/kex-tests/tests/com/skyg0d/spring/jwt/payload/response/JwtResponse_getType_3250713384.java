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

public class JwtResponse_getType_3250713384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3029;

    public JwtResponse_getType_3250713384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3098 = new ArrayList();
        ((ArrayList) term3098).add("SdCKLMIYnX");
        ((ArrayList) term3098).add("OJJtVNPyKZ");
        ((ArrayList) term3098).add("AKNapTAfmD");
        term3029 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term3029, term3029.getClass(), "token", "AdxvLJhNLe");
        setField(term3029, term3029.getClass(), "type", "Bearer");
        setField(term3029, term3029.getClass(), "refreshToken", "lHfTrWKMPk");
        setField(term3029, term3029.getClass(), "id", "JDaAnsVTGV");
        setField(term3029, term3029.getClass(), "username", "mLUZFTfjle");
        setField(term3029, term3029.getClass(), "email", "xIeFjkHkOe");
        setField(term3029, term3029.getClass(), "roles", term3098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3029, args);
    }

};


