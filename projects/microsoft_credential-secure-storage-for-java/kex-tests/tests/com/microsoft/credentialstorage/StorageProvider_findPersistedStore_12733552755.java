package com.microsoft.credentialstorage;

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
import static com.microsoft.credentialstorage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class StorageProvider_findPersistedStore_12733552755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum38;
     Object term15895;

    public StorageProvider_findPersistedStore_12733552755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15901 = Class.forName((String) "com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Field term15900 = ((Class) term15901).getDeclaredField((String) "REQUIRED");
        ((Field) term15900).setAccessible(true);
        enum38 = ((Field) term15900).get((Object) null);
        term15895 = new LinkedList();
        ((LinkedList) term15895).add((Object)null);
        ((LinkedList) term15895).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.StorageProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.microsoft.credentialstorage.StorageProvider$SecureOption");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = enum38;
        args[1] = term15895;
        callMethod(klass, "findPersistedStore", argTypes, null, args);
    }

};


