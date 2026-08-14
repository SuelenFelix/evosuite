package com.microsoft.credentialstorage.model;

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
import static com.microsoft.credentialstorage.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StoredToken_init_17252432950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;

    public StoredToken_init_17252432950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (char[]) newCharArray(5);
        setCharElement(term1, 0, 'P');
        setCharElement(term1, 1, 'A');
        setCharElement(term1, 2, 'E');
        setCharElement(term1, 3, 'B');
        setCharElement(term1, 4, 't');
        Class<? extends Object> term212 = Class.forName((String) "com.microsoft.credentialstorage.model.StoredTokenType");
        Field term211 = ((Class) term212).getDeclaredField((String) "ACCESS");
        ((Field) term211).setAccessible(true);
        enum0 = ((Field) term211).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredTokenType");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


