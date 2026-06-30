package com.amigoscode.spring.security.jwt;

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
import static com.amigoscode.spring.security.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtSecretKey_secretKey_18964911413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324;

    public JwtSecretKey_secretKey_18964911413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtSecretKey"));
        setField(term324, term324.getClass(), "jwtConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.jwt.JwtSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "secretKey", argTypes, term324, args);
    }

};


