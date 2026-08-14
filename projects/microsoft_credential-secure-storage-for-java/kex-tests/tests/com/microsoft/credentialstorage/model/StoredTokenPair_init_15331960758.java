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

public class StoredTokenPair_init_15331960758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public StoredTokenPair_init_15331960758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredTokenPair");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


