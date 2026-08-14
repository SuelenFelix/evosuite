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
import java.util.LinkedList;

public class StorageProvider_getStore_18605818456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16231;
     Object enum39;
     Object term16246;

    public StorageProvider_getStore_18605818456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16231 = new Boolean(true);
        Class<? extends Object> term16250 = Class.forName((String) "com.microsoft.credentialstorage.StorageProvider$SecureOption");
        Field term16249 = ((Class) term16250).getDeclaredField((String) "PREFERRED");
        ((Field) term16249).setAccessible(true);
        enum39 = ((Field) term16249).get((Object) null);
        term16246 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.StorageProvider");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.StorageProvider$SecureOption");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("com.microsoft.credentialstorage.StorageProvider$NonPersistentStoreGenerator");
        Object[] args = new Object[4];
        args[0] = term16231;
        args[1] = enum39;
        args[2] = term16246;
        args[3] = null;
        callMethod(klass, "getStore", argTypes, null, args);
    }

};


