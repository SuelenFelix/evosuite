package org.dhatim.dropwizard.jwt.cookie.authentication;

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
import static org.dhatim.dropwizard.jwt.cookie.authentication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtCookieAuthConfiguration_isHttpOnly_190672528613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3317;

    public JwtCookieAuthConfiguration_isHttpOnly_190672528613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3317 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term3317, term3317.getClass(), "secretSeed", null);
        setField(term3317, term3317.getClass(), "cookieName", null);
        setBooleanField(term3317, term3317.getClass(), "secure", false);
        setBooleanField(term3317, term3317.getClass(), "httpOnly", false);
        setField(term3317, term3317.getClass(), "sameSite", null);
        setField(term3317, term3317.getClass(), "domain", null);
        setField(term3317, term3317.getClass(), "sessionExpiryVolatile", null);
        setField(term3317, term3317.getClass(), "sessionExpiryPersistent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHttpOnly", argTypes, term3317, args);
    }

};


