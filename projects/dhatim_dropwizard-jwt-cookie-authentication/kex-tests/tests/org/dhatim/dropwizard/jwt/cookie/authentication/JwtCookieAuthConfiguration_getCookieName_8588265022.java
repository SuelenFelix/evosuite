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

public class JwtCookieAuthConfiguration_getCookieName_8588265022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public JwtCookieAuthConfiguration_getCookieName_8588265022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term540 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term539 = ((Class) term540).getDeclaredField((String) "STRICT");
        ((Field) term539).setAccessible(true);
        Object enum1 = ((Field) term539).get((Object) null);
        term446 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term446, term446.getClass(), "secretSeed", "MuLcgQHgqz");
        setField(term446, term446.getClass(), "cookieName", "sessionToken");
        setBooleanField(term446, term446.getClass(), "secure", false);
        setBooleanField(term446, term446.getClass(), "httpOnly", true);
        setField(term446, term446.getClass(), "sameSite", enum1);
        setField(term446, term446.getClass(), "domain", "xxtlPwDYFs");
        setField(term446, term446.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term446, term446.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCookieName", argTypes, term446, args);
    }

};


