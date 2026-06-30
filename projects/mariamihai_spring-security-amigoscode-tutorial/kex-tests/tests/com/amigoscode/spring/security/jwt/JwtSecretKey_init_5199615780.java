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

public class JwtSecretKey_init_5199615780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public JwtSecretKey_init_5199615780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term254 = new Integer(568599855);
        term229 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtConfig"));
        setField(term229, term229.getClass(), "secretKey", "NRdvgJlhkX");
        setField(term229, term229.getClass(), "tokenPrefix", "uuaPigETmJ");
        setField(term229, term229.getClass(), "tokenExpirationAfterDays", term254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.jwt.JwtSecretKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amigoscode.spring.security.jwt.JwtConfig");
        Object[] args = new Object[1];
        args[0] = term229;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


