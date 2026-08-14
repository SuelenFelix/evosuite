package com.microsoft.credentialstorage.implementation.macosx;

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
import static com.microsoft.credentialstorage.implementation.macosx.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KeychainSecurityCliStore_SecretKind_values_4051170573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum10;

    public KeychainSecurityCliStore_SecretKind_values_4051170573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5857 = Class.forName((String) "com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        Field term5856 = ((Class) term5857).getDeclaredField((String) "Credential");
        ((Field) term5856).setAccessible(true);
        enum10 = ((Field) term5856).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum10, args);
    }

};


