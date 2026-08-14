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

public class JwtCookieAuthConfiguration_getSessionExpiryPersistent_3613965876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2085;

    public JwtCookieAuthConfiguration_getSessionExpiryPersistent_3613965876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2173 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term2172 = ((Class) term2173).getDeclaredField((String) "LAX");
        ((Field) term2172).setAccessible(true);
        Object enum5 = ((Field) term2172).get((Object) null);
        term2085 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term2085, term2085.getClass(), "secretSeed", "NRdvgJlhkX");
        setField(term2085, term2085.getClass(), "cookieName", "sessionToken");
        setBooleanField(term2085, term2085.getClass(), "secure", true);
        setBooleanField(term2085, term2085.getClass(), "httpOnly", true);
        setField(term2085, term2085.getClass(), "sameSite", enum5);
        setField(term2085, term2085.getClass(), "domain", "uuaPigETmJ");
        setField(term2085, term2085.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term2085, term2085.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSessionExpiryPersistent", argTypes, term2085, args);
    }

};


