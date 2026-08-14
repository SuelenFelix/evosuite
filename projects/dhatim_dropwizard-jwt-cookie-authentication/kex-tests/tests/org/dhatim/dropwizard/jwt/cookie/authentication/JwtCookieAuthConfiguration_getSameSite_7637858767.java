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

public class JwtCookieAuthConfiguration_getSameSite_7637858767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2486;

    public JwtCookieAuthConfiguration_getSameSite_7637858767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2580 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term2579 = ((Class) term2580).getDeclaredField((String) "STRICT");
        ((Field) term2579).setAccessible(true);
        Object enum6 = ((Field) term2579).get((Object) null);
        term2486 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term2486, term2486.getClass(), "secretSeed", "MxlszYVzRf");
        setField(term2486, term2486.getClass(), "cookieName", "sessionToken");
        setBooleanField(term2486, term2486.getClass(), "secure", true);
        setBooleanField(term2486, term2486.getClass(), "httpOnly", true);
        setField(term2486, term2486.getClass(), "sameSite", enum6);
        setField(term2486, term2486.getClass(), "domain", "LQFpaHEwXR");
        setField(term2486, term2486.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term2486, term2486.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSameSite", argTypes, term2486, args);
    }

};


