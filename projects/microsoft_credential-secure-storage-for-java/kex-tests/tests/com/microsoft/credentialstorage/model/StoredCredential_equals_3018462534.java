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
import java.lang.Object;

public class StoredCredential_equals_3018462534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3874;
     Object term3894;

    public StoredCredential_equals_3018462534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3874 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3887 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3888 = (char[]) newCharArray(5);
        setField(term3874, term3874.getClass(), "username", "MjGYSRKTNF");
        setCharElement(term3888, 0, 'C');
        setCharElement(term3888, 1, 'Z');
        setCharElement(term3888, 2, 'p');
        setCharElement(term3888, 3, 'V');
        setCharElement(term3888, 4, 'm');
        setField(term3887, term3887.getClass(), "value", term3888);
        setField(term3874, term3874.getClass(), "password", term3887);
        term3894 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3894;
        callMethod(klass, "equals", argTypes, term3874, args);
    }

};


