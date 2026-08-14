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
import java.lang.Object;

public class KeychainSecurityBackedCredentialStore_add_18518006242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3342;
     Object term3355;

    public KeychainSecurityBackedCredentialStore_add_18518006242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3342 = newInstance(Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedCredentialStore"));
        term3355 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredCredential"));
        Object term3368 = newInstance(Class.forName("com.microsoft.credentialstorage.model.ClearableValue"));
        char[] term3369 = (char[]) newCharArray(9);
        setField(term3355, term3355.getClass(), "username", "OclPbYPkcH");
        setCharElement(term3369, 0, 'r');
        setCharElement(term3369, 1, 'b');
        setCharElement(term3369, 2, 'M');
        setCharElement(term3369, 3, 'u');
        setCharElement(term3369, 4, 'L');
        setCharElement(term3369, 5, 'c');
        setCharElement(term3369, 6, 'g');
        setCharElement(term3369, 7, 'Q');
        setCharElement(term3369, 8, 'H');
        setField(term3368, term3368.getClass(), "value", term3369);
        setField(term3355, term3355.getClass(), "password", term3368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.implementation.macosx.KeychainSecurityBackedCredentialStore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.microsoft.credentialstorage.model.StoredCredential");
        Object[] args = new Object[2];
        args[0] = "flxyYxBRtu";
        args[1] = term3355;
        callMethod(klass, "add", argTypes, term3342, args);
    }

};


