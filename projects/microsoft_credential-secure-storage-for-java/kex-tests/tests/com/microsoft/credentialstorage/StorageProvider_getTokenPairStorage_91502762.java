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

public class StorageProvider_getTokenPairStorage_91502762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15185;
     Object enum36;

    public StorageProvider_getTokenPairStorage_91502762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15185 = new Boolean(true);
        Class<? extends Object> term15200 = Class.forName((String) "com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Field term15199 = ((Class) term15200).getDeclaredField((String) "REQUIRED");
        ((Field) term15199).setAccessible(true);
        enum36 = ((Field) term15199).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.StorageProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Object[] args = new Object[2];
        args[0] = term15185;
        args[1] = enum36;
        callMethod(klass, "getTokenPairStorage", argTypes, null, args);
    }

};


