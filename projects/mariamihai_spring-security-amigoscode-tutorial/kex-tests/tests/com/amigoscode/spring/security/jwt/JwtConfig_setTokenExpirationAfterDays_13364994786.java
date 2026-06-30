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

public class JwtConfig_setTokenExpirationAfterDays_13364994786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;
     Object term631;

    public JwtConfig_setTokenExpirationAfterDays_13364994786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term629 = new Integer(-2038273078);
        term604 = newInstance(Class.forName("com.amigoscode.spring.security.jwt.JwtConfig"));
        setField(term604, term604.getClass(), "secretKey", "flxyYxBRtu");
        setField(term604, term604.getClass(), "tokenPrefix", "OclPbYPkcH");
        setField(term604, term604.getClass(), "tokenExpirationAfterDays", term629);
        term631 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amigoscode.spring.security.jwt.JwtConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term631;
        callMethod(klass, "setTokenExpirationAfterDays", argTypes, term604, args);
    }

};


