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

public class JwtCookieAuthConfiguration_isSecure_4436543393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public JwtCookieAuthConfiguration_isSecure_4436543393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term950 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term949 = ((Class) term950).getDeclaredField((String) "LAX");
        ((Field) term949).setAccessible(true);
        Object enum2 = ((Field) term949).get((Object) null);
        term862 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term862, term862.getClass(), "secretSeed", "jJCZpVmanW");
        setField(term862, term862.getClass(), "cookieName", "sessionToken");
        setBooleanField(term862, term862.getClass(), "secure", false);
        setBooleanField(term862, term862.getClass(), "httpOnly", true);
        setField(term862, term862.getClass(), "sameSite", enum2);
        setField(term862, term862.getClass(), "domain", "EGtDIRbSSb");
        setField(term862, term862.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term862, term862.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSecure", argTypes, term862, args);
    }

};


