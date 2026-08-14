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

public class SecurityContext_addCertToTrustStore_12644233315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;

    public SecurityContext_addCertToTrustStore_12644233315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SecurityContext"));
        char[] term129 = (char[]) newCharArray(6);
        Object term136 = newInstance(Class.forName("java.security.KeyStore"));
        setCharElement(term129, 0, 'J');
        setCharElement(term129, 1, 'A');
        setCharElement(term129, 2, 'E');
        setCharElement(term129, 3, 't');
        setCharElement(term129, 4, 'R');
        setCharElement(term129, 5, 'r');
        setField(term128, term128.getClass(), "storePassword", term129);
        setField(term136, term136.getClass(), "type", "jJCZpVmanW");
        setField(term136, term136.getClass(), "provider", null);
        setField(term136, term136.getClass(), "keyStoreSpi", null);
        setBooleanField(term136, term136.getClass(), "initialized", true);
        setField(term128, term128.getClass(), "keystore", term136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "addCertToTrustStore", argTypes, term128, args);
    }

};


