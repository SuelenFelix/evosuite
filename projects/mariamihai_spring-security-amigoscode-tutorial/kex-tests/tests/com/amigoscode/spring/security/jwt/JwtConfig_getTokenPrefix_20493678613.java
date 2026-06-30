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
import java.lang.Integer;

public class JwtConfig_getTokenPrefix_20493678613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441;

    public JwtConfig_getTokenPrefix_20493678613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term466 = new Integer(-1922583790);
        term441 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtConfig"));
        setField(term441, term441.getClass(), "secretKey", "pCTimMblYc");
        setField(term441, term441.getClass(), "tokenPrefix", "hNxWaHcfhY");
        setField(term441, term441.getClass(), "tokenExpirationAfterDays", term466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.jwt.JwtConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTokenPrefix", argTypes, term441, args);
    }

};


