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

public class JwtCookieAuthConfiguration_getSessionExpiryVolatile_2964879525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679;

    public JwtCookieAuthConfiguration_getSessionExpiryVolatile_2964879525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1769 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term1768 = ((Class) term1769).getDeclaredField((String) "NONE");
        ((Field) term1768).setAccessible(true);
        Object enum4 = ((Field) term1768).get((Object) null);
        term1679 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term1679, term1679.getClass(), "secretSeed", "hRNSzYYIrc");
        setField(term1679, term1679.getClass(), "cookieName", "sessionToken");
        setBooleanField(term1679, term1679.getClass(), "secure", true);
        setBooleanField(term1679, term1679.getClass(), "httpOnly", true);
        setField(term1679, term1679.getClass(), "sameSite", enum4);
        setField(term1679, term1679.getClass(), "domain", "RMFIsYGgne");
        setField(term1679, term1679.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term1679, term1679.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSessionExpiryVolatile", argTypes, term1679, args);
    }

};


