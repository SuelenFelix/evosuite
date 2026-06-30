package org.zerhusen.security.rest;

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
import static org.zerhusen.security.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthenticationRestController_JWTToken_setIdToken_6970738505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;

    public AuthenticationRestController_JWTToken_setIdToken_6970738505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = newInstance(Class.forName("org.zerhusen.security.rest.AuthenticationRestController$JWTToken"));
        setField(term474, term474.getClass(), "idToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.rest.AuthenticationRestController$JWTToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIdToken", argTypes, term474, args);
    }

};


