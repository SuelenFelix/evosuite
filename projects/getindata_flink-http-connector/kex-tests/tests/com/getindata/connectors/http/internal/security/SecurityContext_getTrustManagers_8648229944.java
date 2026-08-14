package com.getindata.connectors.http.internal.security;

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
import static com.getindata.connectors.http.internal.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SecurityContext_getTrustManagers_8648229944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;

    public SecurityContext_getTrustManagers_8648229944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SecurityContext"));
        char[] term101 = (char[]) newCharArray(1);
        Object term103 = newInstance(Class.forName("java.security.KeyStore"));
        setCharElement(term101, 0, 'l');
        setField(term100, term100.getClass(), "storePassword", term101);
        setField(term103, term103.getClass(), "type", "xxtlPwDYFs");
        setField(term103, term103.getClass(), "provider", null);
        setField(term103, term103.getClass(), "keyStoreSpi", null);
        setBooleanField(term103, term103.getClass(), "initialized", true);
        setField(term100, term100.getClass(), "keystore", term103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustManagers", argTypes, term100, args);
    }

};


