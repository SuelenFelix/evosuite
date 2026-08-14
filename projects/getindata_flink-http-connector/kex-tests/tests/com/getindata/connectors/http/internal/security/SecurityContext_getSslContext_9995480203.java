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

public class SecurityContext_getSslContext_9995480203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term86;

    public SecurityContext_getSslContext_9995480203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SecurityContext"));
        char[] term68 = (char[]) newCharArray(3);
        Object term72 = newInstance(Class.forName("java.security.KeyStore"));
        setCharElement(term68, 0, 'D');
        setCharElement(term68, 1, 's');
        setCharElement(term68, 2, 'j');
        setField(term67, term67.getClass(), "storePassword", term68);
        setField(term72, term72.getClass(), "type", "MuLcgQHgqz");
        setField(term72, term72.getClass(), "provider", null);
        setField(term72, term72.getClass(), "keyStoreSpi", null);
        setBooleanField(term72, term72.getClass(), "initialized", false);
        setField(term67, term67.getClass(), "keystore", term72);
        term86 = (Object[]) newArray("javax.net.ssl.TrustManager", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.net.ssl.TrustManager"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term86;
        callMethod(klass, "getSslContext", argTypes, term67, args);
    }

};


