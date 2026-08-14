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

public class JwtResponse_setUsername_69895896614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5309;

    public JwtResponse_setUsername_69895896614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5378 = new ArrayList();
        ((ArrayList) term5378).add("NzBMMhkhpT");
        ((ArrayList) term5378).add("qCpEbQDHdF");
        ((ArrayList) term5378).add("AHbZyFOmlo");
        ((ArrayList) term5378).add("TwfWVQGiIj");
        ((ArrayList) term5378).add("gUvcueTURF");
        term5309 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term5309, term5309.getClass(), "token", "SFqCrhEWLm");
        setField(term5309, term5309.getClass(), "type", "Bearer");
        setField(term5309, term5309.getClass(), "refreshToken", "GZdcJyZntS");
        setField(term5309, term5309.getClass(), "id", "OIHoJeysUi");
        setField(term5309, term5309.getClass(), "username", "WXMWFDGcLB");
        setField(term5309, term5309.getClass(), "email", "wKWbJssZuG");
        setField(term5309, term5309.getClass(), "roles", term5378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EwQBhZjCIT";
        callMethod(klass, "setUsername", argTypes, term5309, args);
    }

};


