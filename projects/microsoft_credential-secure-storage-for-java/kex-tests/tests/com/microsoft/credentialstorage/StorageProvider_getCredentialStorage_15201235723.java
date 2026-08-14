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
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public class StorageProvider_getCredentialStorage_15201235723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15530;
     Object enum37;

    public StorageProvider_getCredentialStorage_15201235723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15530 = new Boolean(false);
        Class<? extends Object> term15545 = Class.forName((String) "com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Field term15544 = ((Class) term15545).getDeclaredField((String) "REQUIRED");
        ((Field) term15544).setAccessible(true);
        enum37 = ((Field) term15544).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.StorageProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Object[] args = new Object[2];
        args[0] = term15530;
        args[1] = enum37;
        callMethod(klass, "getCredentialStorage", argTypes, null, args);
    }

};


