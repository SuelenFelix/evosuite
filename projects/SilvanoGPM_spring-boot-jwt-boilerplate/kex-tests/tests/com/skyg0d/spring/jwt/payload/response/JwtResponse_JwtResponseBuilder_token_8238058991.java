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

public class JwtResponse_JwtResponseBuilder_token_8238058991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8709;

    public JwtResponse_JwtResponseBuilder_token_8238058991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8782 = new ArrayList();
        ((ArrayList) term8782).add("lgQkrXANyI");
        ((ArrayList) term8782).add("MeTmRZXErV");
        ((ArrayList) term8782).add("jNxbVmoZgq");
        ((ArrayList) term8782).add("PvmBHIXaMY");
        ((ArrayList) term8782).add("hulYxtowxw");
        ((ArrayList) term8782).add("GNEmuHPNcU");
        ((ArrayList) term8782).add("IoSfuKDFRe");
        term8709 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term8709, term8709.getClass(), "token", "qFGKIJjlmV");
        setField(term8709, term8709.getClass(), "type", "IHqvyhMtuM");
        setField(term8709, term8709.getClass(), "refreshToken", "dAldIGYAXV");
        setField(term8709, term8709.getClass(), "id", "mLwibAPEsa");
        setField(term8709, term8709.getClass(), "username", "zsWKWiTFuo");
        setField(term8709, term8709.getClass(), "email", "UPUbwyHQKN");
        setField(term8709, term8709.getClass(), "roles", term8782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWYyZiNfsm";
        callMethod(klass, "token", argTypes, term8709, args);
    }

};


