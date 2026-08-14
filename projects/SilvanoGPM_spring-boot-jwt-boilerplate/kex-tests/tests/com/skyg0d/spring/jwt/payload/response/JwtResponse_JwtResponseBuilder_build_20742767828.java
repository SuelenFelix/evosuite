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

public class JwtResponse_JwtResponseBuilder_build_20742767828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10353;

    public JwtResponse_JwtResponseBuilder_build_20742767828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10426 = new ArrayList();
        ((ArrayList) term10426).add("GGzwMoHZXC");
        ((ArrayList) term10426).add("IpmgwHTgnG");
        ((ArrayList) term10426).add("tIpkeYIezR");
        term10353 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term10353, term10353.getClass(), "token", "EusenEbIoF");
        setField(term10353, term10353.getClass(), "type", "SScVQYSvWH");
        setField(term10353, term10353.getClass(), "refreshToken", "MnovcqFhCl");
        setField(term10353, term10353.getClass(), "id", "qYtAeLzOhW");
        setField(term10353, term10353.getClass(), "username", "tJzmOfcUnY");
        setField(term10353, term10353.getClass(), "email", "TKlccZUpjz");
        setField(term10353, term10353.getClass(), "roles", term10426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term10353, args);
    }

};


