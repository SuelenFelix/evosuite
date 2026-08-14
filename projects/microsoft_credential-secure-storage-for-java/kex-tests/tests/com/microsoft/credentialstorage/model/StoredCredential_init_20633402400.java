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

public class StoredCredential_init_20633402400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3750;

    public StoredCredential_init_20633402400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3750 = (char[]) newCharArray(7);
        setCharElement(term3750, 0, 'c');
        setCharElement(term3750, 1, 'g');
        setCharElement(term3750, 2, 'Q');
        setCharElement(term3750, 3, 'H');
        setCharElement(term3750, 4, 'g');
        setCharElement(term3750, 5, 'q');
        setCharElement(term3750, 6, 'z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = term3750;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


