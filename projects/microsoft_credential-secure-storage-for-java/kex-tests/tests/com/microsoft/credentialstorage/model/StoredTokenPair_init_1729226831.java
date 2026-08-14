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
import java.util.LinkedHashMap;

public class StoredTokenPair_init_1729226831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4339;
     Object term4341;
     Object term4351;

    public StoredTokenPair_init_1729226831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4339 = (char[]) newCharArray(1);
        setCharElement(term4339, 0, 'j');
        term4341 = (char[]) newCharArray(9);
        setCharElement(term4341, 0, 'G');
        setCharElement(term4341, 1, 'Y');
        setCharElement(term4341, 2, 'S');
        setCharElement(term4341, 3, 'R');
        setCharElement(term4341, 4, 'K');
        setCharElement(term4341, 5, 'T');
        setCharElement(term4341, 6, 'N');
        setCharElement(term4341, 7, 'F');
        setCharElement(term4341, 8, 'h');
        term4351 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term4339;
        args[1] = term4341;
        args[2] = term4351;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


