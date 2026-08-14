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

public class StorageProvider_getTokenStorage_17745232621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14840;
     Object enum35;

    public StorageProvider_getTokenStorage_17745232621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14840 = new Boolean(true);
        Class<? extends Object> term14855 = Class.forName((String) "com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Field term14854 = ((Class) term14855).getDeclaredField((String) "REQUIRED");
        ((Field) term14854).setAccessible(true);
        enum35 = ((Field) term14854).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.StorageProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Object[] args = new Object[2];
        args[0] = term14840;
        args[1] = enum35;
        callMethod(klass, "getTokenStorage", argTypes, null, args);
    }

};


