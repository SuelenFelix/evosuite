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

public class SecurityContext_init_13187838910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;

    public SecurityContext_init_13187838910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.security.KeyStore"));
        setField(term1, term1.getClass(), "type", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "provider", null);
        setField(term1, term1.getClass(), "keyStoreSpi", null);
        setBooleanField(term1, term1.getClass(), "initialized", false);
        term15 = (char[]) newCharArray(5);
        setCharElement(term15, 0, 'P');
        setCharElement(term15, 1, 'A');
        setCharElement(term15, 2, 'E');
        setCharElement(term15, 3, 'B');
        setCharElement(term15, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SecurityContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.security.KeyStore");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term15;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


