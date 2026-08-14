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
import java.lang.String;
import java.lang.Object;

public class JwtCookieAuthConfiguration_isHttpOnly_19067252864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263;

    public JwtCookieAuthConfiguration_isHttpOnly_19067252864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1357 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term1356 = ((Class) term1357).getDeclaredField((String) "STRICT");
        ((Field) term1356).setAccessible(true);
        Object enum3 = ((Field) term1356).get((Object) null);
        term1263 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term1263, term1263.getClass(), "secretSeed", "SzjVpOQTyS");
        setField(term1263, term1263.getClass(), "cookieName", "sessionToken");
        setBooleanField(term1263, term1263.getClass(), "secure", false);
        setBooleanField(term1263, term1263.getClass(), "httpOnly", true);
        setField(term1263, term1263.getClass(), "sameSite", enum3);
        setField(term1263, term1263.getClass(), "domain", "MjGYSRKTNF");
        setField(term1263, term1263.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term1263, term1263.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHttpOnly", argTypes, term1263, args);
    }

};


