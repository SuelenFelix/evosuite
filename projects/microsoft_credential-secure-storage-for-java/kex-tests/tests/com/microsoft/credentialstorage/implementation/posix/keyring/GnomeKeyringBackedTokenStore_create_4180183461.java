package com.microsoft.credentialstorage.implementation.posix.keyring;

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
import static com.microsoft.credentialstorage.implementation.posix.keyring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GnomeKeyringBackedTokenStore_create_4180183461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029;

    public GnomeKeyringBackedTokenStore_create_4180183461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1029 = (char[]) newCharArray(6);
        setCharElement(term1029, 0, 'R');
        setCharElement(term1029, 1, 'r');
        setCharElement(term1029, 2, 'b');
        setCharElement(term1029, 3, 'M');
        setCharElement(term1029, 4, 'u');
        setCharElement(term1029, 5, 'L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.posix.keyring.GnomeKeyringBackedTokenStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = term1029;
        callMethod(klass, "create", argTypes, null, args);
    }

};


