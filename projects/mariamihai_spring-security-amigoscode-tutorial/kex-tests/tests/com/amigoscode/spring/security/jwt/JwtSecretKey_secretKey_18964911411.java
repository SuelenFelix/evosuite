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
import java.lang.Object;
import java.lang.Integer;

public class JwtSecretKey_secretKey_18964911411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;

    public JwtSecretKey_secretKey_18964911411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term302 = new Integer(1162663216);
        term276 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtSecretKey"));
        Object term277 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtConfig"));
        setField(term277, term277.getClass(), "secretKey", "MxlszYVzRf");
        setField(term277, term277.getClass(), "tokenPrefix", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "tokenExpirationAfterDays", term302);
        setField(term276, term276.getClass(), "jwtConfig", term277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.jwt.JwtSecretKey");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "secretKey", argTypes, term276, args);
    }

};


