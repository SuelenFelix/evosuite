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

public class JwtResponse_getEmail_17634378768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3853;

    public JwtResponse_getEmail_17634378768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3922 = new ArrayList();
        ((ArrayList) term3922).add("DbiCVtPPCT");
        ((ArrayList) term3922).add("WzFopsaDuG");
        term3853 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term3853, term3853.getClass(), "token", "HWkpTmtlrc");
        setField(term3853, term3853.getClass(), "type", "Bearer");
        setField(term3853, term3853.getClass(), "refreshToken", "hMmaoREuCK");
        setField(term3853, term3853.getClass(), "id", "VeDtgDzGAN");
        setField(term3853, term3853.getClass(), "username", "aWYOWZFyaX");
        setField(term3853, term3853.getClass(), "email", "BRIVNtfUWU");
        setField(term3853, term3853.getClass(), "roles", term3922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3853, args);
    }

};


