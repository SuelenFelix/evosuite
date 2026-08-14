package com.microsoft.credentialstorage.implementation.memory;

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
import static com.microsoft.credentialstorage.implementation.memory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InsecureInMemoryStore_add_3509759028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public InsecureInMemoryStore_add_3509759028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore"));
        setField(term93, term93.getClass(), "store", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.memory.InsecureInMemoryStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredSecret");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "add", argTypes, term93, args);
    }

};


