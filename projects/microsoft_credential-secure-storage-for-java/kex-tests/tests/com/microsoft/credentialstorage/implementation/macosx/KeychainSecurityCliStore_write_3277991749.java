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

public class KeychainSecurityCliStore_write_3277991749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;
     Object term1414;

    public KeychainSecurityCliStore_write_3277991749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1416 = Class.forName((String) "com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        Field term1415 = ((Class) term1416).getDeclaredField((String) "Token");
        ((Field) term1415).setAccessible(true);
        enum2 = ((Field) term1415).get((Object) null);
        term1414 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityCliStore$SecretKind");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = enum2;
        args[1] = "hNxWaHcfhY";
        args[2] = "RkybSrpybU";
        args[3] = term1414;
        callMethod(klass, "write", argTypes, null, args);
    }

};


