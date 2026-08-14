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

public class JwtCookieAuthConfiguration_getDomain_5247074518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2902;

    public JwtCookieAuthConfiguration_getDomain_5247074518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2992 = Class.forName((String) "org.dhatim.dropwizard.jwt.cookie.authentication.SameSite");
        Field term2991 = ((Class) term2992).getDeclaredField((String) "NONE");
        ((Field) term2991).setAccessible(true);
        Object enum7 = ((Field) term2991).get((Object) null);
        term2902 = newInstance(Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration"));
        setField(term2902, term2902.getClass(), "secretSeed", "oVcInYnLWB");
        setField(term2902, term2902.getClass(), "cookieName", "sessionToken");
        setBooleanField(term2902, term2902.getClass(), "secure", true);
        setBooleanField(term2902, term2902.getClass(), "httpOnly", true);
        setField(term2902, term2902.getClass(), "sameSite", enum7);
        setField(term2902, term2902.getClass(), "domain", "aJlieCFVtF");
        setField(term2902, term2902.getClass(), "sessionExpiryVolatile", "PT30m");
        setField(term2902, term2902.getClass(), "sessionExpiryPersistent", "P7d");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.jwt.cookie.authentication.JwtCookieAuthConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomain", argTypes, term2902, args);
    }

};


